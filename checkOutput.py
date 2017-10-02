import subprocess
import sys
import json

specLab = str(sys.argv[1])

class Checker():

    def __init__(self, specLab):
        self.labName = specLab

    def getAssignmentList(self):
        assignmentList = subprocess.check_output("ls submissions/" + self.labName + "/", shell=True)
        assignmentList = assignmentList.split("\n")
        assignmentList = assignmentList[0:len(assignmentList) -1]

        return assignmentList

    def getExpectedOutput(self):
        f = open("tests/" + self.labName + ".txt", "r")
        txt = json.loads(f.read())
        expectedOutput = txt["output"].strip()
        
        return expectedOutput

    def getExpectedHeader(self):
        f = open("tests/" + self.labName + ".txt", "r")
        txt = json.loads(f.read())
        header = txt["header"].strip()
        
        return header

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
        expectedOutput = self.getExpectedOutput().strip()
        outputOfProgram = subprocess.check_output("cd sandbox/ && java " + cleanedUpName.replace(".java", ""), shell=True)
        outputOfProgram = outputOfProgram.strip()
        outputValue = 0
        if outputOfProgram == expectedOutput:
            #print "output matches"
            outputValue = 1
        else:
            print "error:", outputOfProgram, expectedOutput

        subprocess.call("rm sandbox/*", shell=True)
        return outputValue 

    def headerCheck(self, cleanedUpName):
        f = open("sandbox/" + cleanedUpName, "r")
        code = f.read()
        classConstruction = code.index("public class")
        headerOfProgram = code[0:classConstruction].strip()

        headerValue = 0
        if headerOfProgram == self.getExpectedHeader():
            headerValue = 1

        return headerValue

    def generateResults(self):
        f = open(self.labName, "rw")


    def run(self):
        i = 0
        results = {}
        for assignment in self.getAssignmentList():
            studentScore = {}
            studentScore["name"] = assignment.split("_")[0]

            fileName = assignment.split("_")[-1]
            if "-" in fileName:
                fileName = fileName.split("-")[0] + ".java"
            print assignment, fileName

            compileValue = self.compileCheck(assignment, fileName, i)
            studentScore["compiling"] = compileValue

            headerValue = self.headerCheck(fileName)
            studentScore["header"] = headerValue

            outputValue = self.outputCheck(fileName)
            studentScore["output"] = outputValue

            print studentScore
            i += 1

Checker(specLab).run()
