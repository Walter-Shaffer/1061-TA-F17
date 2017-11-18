import subprocess
import sys
import json
import csv
import difflib
import time
import re

specLab = sys.argv[1]

class Checker():

    def __init__(self, specLab):
        self.labName = specLab

        f = open("tests/" + self.labName + ".txt", "r")
        txt = json.loads(f.read())
        self.files = txt["files"]
        self.required_file = txt["required"]
        self.expected_output = txt["output"]

    def getAssignmentList(self):
        assignmentList = subprocess.check_output("ls submissions/" + self.labName + "/", shell=True)
        assignmentList = assignmentList.split("\n")
        assignmentList = assignmentList[0:len(assignmentList) -1]

        return assignmentList
    

    def compileCheck(self, originalFiles):
        for f in originalFiles:
            for fName in self.files:
                cleanedUpFileName = f.split("_")[len(f.split("_")) -1]
                cleanedUpFileName = cleanedUpFileName.split("-")[0]
                if ".java" not in cleanedUpFileName:
                    cleanedUpFileName += ".java"
                if fName in f:
                    subprocess.call("cp submissions/" + self.labName + "/" + f + " sandbox/", shell=True)
                    subprocess.call("mv sandbox/" + f + " sandbox/" + fName, shell=True)
        subprocess.call("cp requiredClasses/" + self.required_file + " sandbox/", shell=True)
        subprocess.call("javac -encoding ISO-8859-1 sandbox/*.java", shell=True)

    def compare(self, stringA, stringB):    
        difference = [li for li in list(difflib.ndiff(stringA, stringB)) if li[0] != ' ']

        return difference

    def outputCheck(self):
        results = subprocess.check_output("cd sandbox/ && java " + self.required_file.replace(".java", ""), shell=True)
        #listOfErrors = [x for x in results.split("\n") if "Failed" in x]
        #numOfErrors = len(listOfErrors)
        subprocess.call("rm sandbox/*", shell=True)

        return results
        #return {"numOfErrors": numOfErrors, "errorList": str(listOfErrors) }

    def generateResults(self, ob):
        with open("results/" + self.labName + ".csv", "wb") as csvfile:
            #fieldnames = ob[1].keys() + ["error"]
            fieldnames = ob[0].keys()
            f = csv.DictWriter(csvfile, fieldnames=fieldnames)
            f.writeheader()
            for value in ob.values():
                f.writerow(value)

    def run(self):
        assignmentList = self.getAssignmentList()
        assignmentList_new = []
        i = 0
        while i < len(assignmentList) / len(self.files):
            section = [assignmentList[i], assignmentList[i + 1]]
            assignmentList_new.append(section)
            i += 2
        results = {}
        i = 0
        for assignment in assignmentList_new:
            internal_ob = {}
            internal_ob["name"] = assignment[0].split("_")[0]
            try:
                self.compileCheck(assignment)
            except Exception as e:
                internal_ob["errors"] = str(e)
            try:
                internal_ob["output"] = self.outputCheck()
            except Exception as e:
                internal_ob["errorList"] = str(e)
                subprocess.call("rm sandbox/*", shell=True)
            results[i] = internal_ob
            print internal_ob
            i += 1

        self.generateResults(results)

Checker(specLab).run()
