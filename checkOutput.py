import subprocess
import sys
import json
import csv
import difflib
import time

specLab = str(sys.argv[1])

class Checker():

    def __init__(self, specLab):
        self.labName = specLab

    def getAssignmentList(self):
        assignmentList = subprocess.check_output("ls submissions/" + self.labName + "/", shell=True)
        assignmentList = assignmentList.split("\n")
        assignmentList = assignmentList[0:len(assignmentList) -1]
        #assignmentList = assignmentList[10:20]

        return assignmentList

    def setup(self):
        f = open("tests/" + self.labName + ".txt", "r")
        txt = json.loads(f.read())

        expectedOutput = txt["test_cases"]
        self.expected_output = expectedOutput

        header = txt["header"].strip()
        self.expected_header = header

        file_name = txt["file_name"].strip()
        self.expected_fileName = file_name

    def compileCheck(self, originalName, cleanedUpName, num):
        subprocess.call("touch sandbox/" + str(num) + ".txt", shell=True)
        subprocess.call("cp submissions/" + self.labName + "/" + originalName + " sandbox/", shell=True)
        subprocess.call("mv sandbox/" + originalName + " sandbox/" + cleanedUpName, shell=True)
        subprocess.call("javac -encoding ISO-8859-1 sandbox/" + cleanedUpName, shell=True)

    def compare(self, stringA, stringB):    
        difference = [li for li in list(difflib.ndiff(stringA, stringB)) if li[0] != ' ']

        return difference

    def outputCheck(self, cleanedUpName):
        i = 0
        partialCredit = 0
        errors = []
        for case in self.expected_output:
            outputOfProgram = ""
            if case["input"] == "":
                outputOfProgram = subprocess.check_output("cd sandbox/ && java " + cleanedUpName.replace(".java", ""), shell=True)
            else:
                p = subprocess.Popen("cd sandbox/ && java " + cleanedUpName.replace(".java", ""), stdin=subprocess.PIPE, stdout=subprocess.PIPE, shell=True)
                for el in case["input"]:
                    p.stdin.write(str(el) + "\n")
                outputOfProgram = p.communicate()[0]
            outputOfProgram = outputOfProgram.replace("\n", "").replace("\t", "").strip().replace(" ", "").lower()

            expectedOutput = case["output"].replace(" ", "").lower()
            #print outputOfProgram
            #print expectedOutput

            if outputOfProgram == expectedOutput:
                outputValue = 1
            else:
                if expectedOutput in outputOfProgram:
                    partialCredit += 1
                else:
                    errorVal = ""
                    try:
                        for val in case["vals"]:
                            errorVal = val.replace(" ", "")
                            expectedVal = str(val).lower().replace(" ", "")
                            outputOfProgram.index(expectedVal)
                        partialCredit += 1
                    except Exception as e:
                        #print errorVal
                        print "actual:", outputOfProgram
                        print "expected:", expectedOutput
                        #print self.compare(outputOfProgram, expectedOutput)
                        errors.append(case["input"])

            i += 1


        if 0 < len(errors) <= 1:
            raise Exception("partial credit")
        elif len(errors) > 1:
            raise Exception(str(len(errors)) + " errors: output from {" + "###".join(errors) + "} doesn't match")
        elif partialCredit > 0:
            raise Exception("partial credit")
            

    def headerCheck(self, cleanedUpName):
        f = open("sandbox/" + cleanedUpName, "r")
        code = f.read()

        classConstruction = code.index("public class")
        headerOfProgram = code[0:classConstruction]
        header_segments = ["Author", "Submission Date", "Purpose", "Academic Honesty"]
        headerValue = 0
        i = 0
        while i < len(header_segments) - 1:
            if header_segments[i] in headerOfProgram:
                headerValue = 1
            else:
                headerValue = 0
                i = len(header_segments)
            i += 1
        
        return headerValue

    def generateResults(self, ob):
        with open("results/" + self.labName + ".csv", "wb") as csvfile:
            #fieldnames = ob[1].keys() + ["error"]
            fieldnames = ob[0].keys()
            f = csv.DictWriter(csvfile, fieldnames=fieldnames)
            f.writeheader()
            for value in ob.values():
                f.writerow(value)

    def run(self):
        self.setup()
        i = 0
        results = {}
        for assignment in self.getAssignmentList():
            studentScore = {}
            studentScore["name"] = assignment.split("_")[0]

            fileName = assignment.split("_")[-1]
            fileNameValue = 1
            if "-" in fileName:
                fileName = fileName.split("-")[0] + ".java"

            if fileName != self.expected_fileName:
                fileNameValue = 0
            studentScore["file_name"] = fileNameValue

            print assignment, fileName

            compileValue = 0
            outputValue = 0
            headerValue = 0
            errorValue = 0

            try:
                self.compileCheck(assignment, fileName, i)
                compileValue = 1

                outputValue = self.outputCheck(fileName)
                outputValue = 1

                headerValue = self.headerCheck(fileName)
            except Exception as e:
                print e
                if str(e) == "partial credit":
                    compileValue = 1
                    headerValue = 1
                    outputValue = 1
                else:
                    compileValue = 0
                    headerValue = 0
                    outputValue = 0
                errorValue = str(e)


            subprocess.call("rm sandbox/*", shell=True)

            studentScore["compiling"] = compileValue
            studentScore["output"] = outputValue
            studentScore["error"] = errorValue
            studentScore["header"] = headerValue

            
            grade = 100
            if compileValue == 0 or outputValue == 0:
                grade = 0
            else: 
                if headerValue == 0:
                    grade -= 10
                if studentScore["error"] != 0:
                    grade -= 10

            studentScore["grade"] = grade

            results[i] = studentScore
            i += 1

        self.generateResults(results)

Checker(specLab).run()
