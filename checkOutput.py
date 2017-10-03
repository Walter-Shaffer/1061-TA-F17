import subprocess
import sys
import json
import csv

specLab = str(sys.argv[1])

class Checker():

    def __init__(self, specLab):
        self.labName = specLab

    def getAssignmentList(self):
        assignmentList = subprocess.check_output("ls submissions/" + self.labName + "/", shell=True)
        assignmentList = assignmentList.split("\n")
        assignmentList = assignmentList[0:len(assignmentList) -1]

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
        compileValue = 0
        try:
            subprocess.call("javac sandbox/" + cleanedUpName, shell=True)
            compileValue = 1
        except Exception as e:
            print "doesn't compile"

        return compileValue

    def outputCheck(self, cleanedUpName):
        outputValue = 0
        for case in self.expected_output:
            try:
                try:
                    p = subprocess.Popen("cd sandbox/ && java " + cleanedUpName.replace(".java", ""), stdin=subprocess.PIPE, stdout=subprocess.PIPE, shell=True)
                except Exception as e:
                    raise Exception(str(e))
                    break
                outputOfProgram = p.communicate(case["input"])[0]
                #outputOfProgram = outputOfProgram[outputOfProgram.index(case["input"]) + len(case["input"])::]
                outputOfProgram = outputOfProgram.replace("\n", "").replace("\t", "").strip().replace(" ", "")
                print outputOfProgram
                #expectedOutput = case["output"][case["output"].index(case["input"]) + len(case["input"])::]
                expectedOutput = case["output"].replace(" ", "")
                print expectedOutput
                expectedOutput = expectedOutput.replace(" ", "")

                if outputOfProgram == expectedOutput:
                    outputValue = 1
                else:
                    raise Exception("output from " + case["input"] + " doesn't match")
            except Exception as e:
                 outputValue = [0, str(e)]

        subprocess.call("rm sandbox/*", shell=True)
        return outputValue 

    def headerCheck(self, cleanedUpName):
        f = open("sandbox/" + cleanedUpName, "r")
        code = f.read()
        try:
            classConstruction = code.index("public class")
            headerOfProgram = code[0:classConstruction].strip()
            header_segments = ["Author", "Submission Date", "Purpose", "Academic Honesty"]
            i = 0
            while i < len(header_segments) - 1:
                try:
                    headerOfProgram.index(header_segments[i])
                    headerValue = 1
                except:
                    headerValue = 0
                    i = len(header_segments)
                i += 1

            print headerValue
            #if headerOfProgram == self.expected_header:
            #    headerValue = 1
        except:
            headerValue = 0

        return headerValue

    def generateResults(self, ob):
        with open(self.labName + ".csv", "wb") as csvfile:
            fieldnames = ob[1].keys() + ["error"]
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
            if fileName != self.expected_fileName:
                fileNameValue = 0
            studentScore["file_name"] = fileNameValue

            if "-" in fileName:
                fileName = fileName.split("-")[0] + ".java"
            print assignment, fileName

            compileValue = self.compileCheck(assignment, fileName, i)
            studentScore["compiling"] = compileValue

            headerValue = self.headerCheck(fileName)
            studentScore["header"] = headerValue

            outputValue = self.outputCheck(fileName)
            if type(outputValue) is list:
                studentScore["output"] = outputValue[0]
                studentScore["error"] = outputValue[1]
            else:
                studentScore["output"] = outputValue

            
            grade = 100
            if compileValue == 0:
                grade = 0
            elif studentScore["output"] == 0:
                grade = 0
            else:
                if headerValue == 0:
                    grade -= 10
            studentScore["grade"] = grade

            results[i] = studentScore
            i += 1

        self.generateResults(results)

Checker(specLab).run()
