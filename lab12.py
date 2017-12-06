import subprocess
import sys
import json
import csv
import difflib
import time
import re
import time

specLab = "lab12"

class Checker():

    def __init__(self, specLab):
        self.labName = specLab

        f = open("tests/" + self.labName + ".txt", "r")
        txt = json.loads(f.read())
        self.files = txt["files"]
        self.required_file = txt["required"][0]
        self.expected_output = txt["output"]

    def getAssignmentList(self):
        assignmentList = subprocess.check_output("ls submissions/" + self.labName + "/", shell=True)
        assignmentList = assignmentList.split("\n")
        assignmentList = assignmentList[0:len(assignmentList) -1]

        return assignmentList
    

    def compileCheck(self, originalFiles):
        if self.files[0].replace(".java", "") in originalFiles:
            cleanedUpFileName = originalFiles.split("_")[-1]

            if cleanedUpFileName != self.files[0]:
                cleanedUpFileName = self.files[0]

            if ".java" not in cleanedUpFileName:
                cleanedUpFileName += ".java"

            subprocess.call("cp submissions/" + self.labName + "/" + originalFiles + " sandbox/", shell=True)
            subprocess.call("mv sandbox/" + originalFiles + " sandbox/" + self.files[0], shell=True)
        
            subprocess.call("cp requiredClasses/" + self.required_file + " sandbox/", shell=True)
            subprocess.call("javac -encoding ISO-8859-1 sandbox/*.java", shell=True)
        
    def outputCheck(self):
        results = ""
        try:
            results = subprocess.check_output("cd sandbox/ && java " + self.required_file.replace(".java", ""), shell=True)
            results = results.split("\n")
            results = results[:-1]
            results = results[-1]
            results = ["score", results]
        except Exception as e:
            results = ["error", str(e)]

        return results

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
            internal_ob["name"] = assignment.split("_")[0]
            print internal_ob["name"]
            internal_ob["output"] = ""
            internal_ob["grade"] = 0
            internal_ob["errors"] = ""
            internal_ob["errorList"] = ""

            try:
                self.compileCheck(assignment)
            except Exception as e:
                internal_ob["errors"] = "failed compileCheck"

            output = self.outputCheck()

            if output[0] == "score":
                internal_ob["output"] = output[1]
                print internal_ob["output"]
                internal_ob["grade"] = internal_ob["output"].split("/")[0].replace("Total:", "").strip()
                print internal_ob["grade"]
            else:
                internal_ob["errorList"] = output[1]
                
            subprocess.call("rm sandbox/*", shell=True)
            results[i] = internal_ob
            i += 1

        self.generateResults(results)

Checker(specLab).run()
