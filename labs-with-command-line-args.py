import subprocess
import sys
import json
import csv
import difflib
import time
import re
import time

specLab = sys.argv[1]

class Checker():

    def __init__(self, specLab):
        self.labName = specLab

        f = open("tests/" + self.labName + ".txt", "r")
        txt = json.loads(f.read())
        self.files = txt["files"]
        self.commandLineArgs = txt["commandLineArgs"]
        self.expected_output = txt["output"]

    def getAssignmentList(self):
        assignmentList = subprocess.check_output("ls submissions/" + self.labName + "/", shell=True)
        assignmentList = assignmentList.split("\n")
        assignmentList = assignmentList[0:len(assignmentList) -1]

        return assignmentList
    

    def compileCheck(self, originalFiles):
        for fName in self.files:
            cleanedUpFileName = originalFiles[originalFiles.rfind('_') + 1:]
            if ".java" not in cleanedUpFileName:
                cleanedUpFileName += ".java"
            if fName in originalFiles:
                subprocess.call("cp submissions/" + self.labName + "/" + originalFiles + " sandbox/", shell=True)
                subprocess.call("mv sandbox/" + originalFiles + " sandbox/" + fName, shell=True)
                sandbox = subprocess.check_output("ls ~/Documents/1061/1061-TA-F17/sandbox/", shell=True)
        subprocess.call("javac -encoding ISO-8859-1 sandbox/*.java ", shell=True)

    def compare(self, stringA, stringB):    
        difference = [li for li in list(difflib.ndiff(stringA, stringB)) if li[0] != ' ']
        return difference

    def outputCheck(self, commandLineArgs, expectedOutput):
        #print "\t\tstarting"
        output = 'null'
        for fName in self.files:
            fName = fName[:fName.rfind(".java")]
            sandbox = subprocess.check_output("ls ~/Documents/1061/1061-TA-F17/sandbox/", shell=True)
            output = subprocess.check_output("cd sandbox/ && java " + fName + " " + commandLineArgs, shell=True)
            #print "\t\toutput " + output
            outputCleaned = output.replace("\n", "").replace("\t", "").strip().replace(" ", "")
            #print "\t\toutput 2 " + output
            expectedOutputCleaned = expectedOutput.replace("\n", "").replace("\t", "").strip().replace(" ", "")
            if expectedOutputCleaned == outputCleaned:
                return output, True
            else:
                output = output + ":FAILED, expectedOutput is '" + expectedOutput + "'"
                return output, False

        return output, False
        
    def generateResults(self, ob):
        with open("results/" + self.labName + ".csv", "wb") as csvfile:
            fieldnames = ob[0].keys()
            f = csv.DictWriter(csvfile, fieldnames=fieldnames)
            f.writeheader()
            for value in ob.values():
                f.writerow(value)
             

    def run(self):
        assignmentList = self.getAssignmentList()
        results = {}
        i = 0
        for assignment in assignmentList:
            
            internal_ob = {}
            internal_ob["name"] = assignment[:assignment.index('_')]
            internal_ob["output"] = ""
            internal_ob["grade"] = 0
            internal_ob["errors"] = ""
            internal_ob["errorList"] = ""

            grade = 0
            outputDic = {}

            try:
                self.compileCheck(assignment)
            except Exception as e:
                internal_ob["errors"] = str(e)
            try:
                j = 0
                numOfTest = len(self.commandLineArgs)
                
                while j < numOfTest:
                    output, passed = self.outputCheck(self.commandLineArgs[j], self.expected_output[j])
                    if passed == True:
                        grade += 100/numOfTest
                    key = "test " + str(j)
                    outputDic[key] = json.dumps(output, sort_keys=False)
                    j += 1
                internal_ob["output"] = str(outputDic)
                internal_ob["grade"] += grade
            except Exception as e:
                internal_ob["errorList"] += str(e)
                subprocess.call("rm sandbox/*", shell=True)
            results[i] = internal_ob
            i += 1

        resultsLen = len(results)

        self.generateResults(results)

Checker(specLab).run()
