import subprocess
import sys
import json
import csv
import difflib
import time
import re

class Checker():

    def __init__(self):
        self.labName = "lab8"
        txt = "CircleTester.java"
        file_name = txt.strip()
        self.expected_fileName = file_name
        self.required_file = "requiredClasses/RubricCircleTester.java"


    def getAssignmentList(self):
        assignmentList = subprocess.check_output("ls submissions/" + self.labName + "/", shell=True)
        assignmentList = assignmentList.split("\n")
        assignmentList = assignmentList[0:len(assignmentList) -1]

        pairedList = []
        i = 0
        while i < len(assignmentList):
            rawPair = [assignmentList[i], assignmentList[i + 1]]
            pairedList.append(rawPair)
            i += 2

        return pairedList

    def compileCheck(self, originalFiles):
        for f in originalFiles:
            fileName = ""
            if "Tester" in f:
                fileName = "CircleTester.java"
            else:
                fileName = "Circle.java"
            subprocess.call("cp submissions/" + self.labName + "/" + f + " sandbox/", shell=True)
            subprocess.call("mv sandbox/" + f + " sandbox/" + fileName, shell=True)
        subprocess.call("cp " + self.required_file + " sandbox/", shell=True)
        subprocess.call("javac -encoding ISO-8859-1 sandbox/*.java", shell=True)

    def compare(self, stringA, stringB):    
        difference = [li for li in list(difflib.ndiff(stringA, stringB)) if li[0] != ' ']

        return difference

    def outputCheck(self):
        results = subprocess.check_output("cd sandbox/ && java RubricCircleTester ", shell=True)
        listOfErrors = [x for x in results.split("\n") if "Test Passed: false" in x]
        numOfErrors = len(listOfErrors)
        subprocess.call("rm sandbox/*", shell=True)

        return {"numOfErrors": numOfErrors, "errorList": str(listOfErrors) }

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
        results = {}
        i = 0
        for assignment in assignmentList:
            internal_ob = {}
            try:
                self.compileCheck(assignment)
            except Exception as e:
                internal_ob["errors"] = str(e)
            try:
                internal_ob = self.outputCheck()
            except Exception as e:
                internal_ob["numOfErrors"] = 11
                internal_ob["errorList"] = str(e)
                subprocess.call("rm sandbox/*", shell=True)
            internal_ob["name"] = assignment[0].split("_")[0]
            if internal_ob["numOfErrors"] == 11:
                internal_ob["grade"] = 0
            else:
                internal_ob["grade"] = 100 - (5 * internal_ob["numOfErrors"])
            results[i] = internal_ob
            print internal_ob
            i += 1

        self.generateResults(results)

Checker().run()
