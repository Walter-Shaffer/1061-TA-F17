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
        subprocess.call("javac -encoding ISO-8859-1 sandbox/" + cleanedUpName, shell=True)

    def outputCheck(self, cleanedUpName):
        i = 0
        while i < len(self.expected_output) -1:
            case = self.expected_output[i]
            p = subprocess.Popen("cd sandbox/ && java " + cleanedUpName.replace(".java", ""), stdin=subprocess.PIPE, stdout=subprocess.PIPE, shell=True)
            outputOfProgram = p.communicate(case["input"])[0]
            #outputOfProgram = outputOfProgram[outputOfProgram.index(case["input"]) + len(case["input"])::]
            outputOfProgram = outputOfProgram.replace("\n", "").replace("\t", "").strip().replace(" ", "").lower()
            print outputOfProgram
            #expectedOutput = case["output"][case["output"].index(case["input"]) + len(case["input"])::]
            expectedOutput = case["output"].replace(" ", "").lower()
            print expectedOutput
            #expectedOutput = expectedOutput.replace(" ", "")

            if outputOfProgram == expectedOutput:
                outputValue = 1
            else:
                if expectedOutput in outputOfProgram:
                    raise Exception("partial credit")
                else:
                    raise Exception("output from " + case["input"] + " doesn't match")
                i = len(self.expectedcw_output)

            i += 1

        subprocess.call("rm sandbox/*", shell=True)

    def headerCheck(self, cleanedUpName):
        f = open("sandbox/" + cleanedUpName, "r")
        code = f.read()

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

    def generateResults(self, ob):
        with open("results/" + self.labName + ".csv", "wb") as csvfile:
            #fieldnames = ob[1].keys() + ["error"]
            fieldnames = ob[1].keys()
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

            compileValue = 0
            headerValue = 0
            outputValue = 0
            errorValue = 0

            try:
                self.compileCheck(assignment, fileName, i)
                compileValue = 1

                outputValue = self.outputCheck(fileName)
                outputValue = 1
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

            try:
                self.headerCheck(fileName)
                headerValue = 1
            except:
                headerValue = 0

            studentScore["compiling"] = compileValue
            studentScore["header"] = headerValue
            studentScore["output"] = outputValue
            studentScore["error"] = errorValue

            
            grade = 100
            if compileValue == 0 or outputValue == 0:
                grade = 0
            else: 
                if headerValue == 0:
                    grade -= 10
                if studentScore["error"] != "":
                    grade -= 10

            studentScore["grade"] = grade

            results[i] = studentScore
            i += 1

        self.generateResults(results)

Checker(specLab).run()
