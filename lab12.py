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
        self.required_file = txt["required"]
        self.expected_output = txt["output"]

    def getAssignmentList(self):
        assignmentList = subprocess.check_output("ls submissions/" + self.labName + "/", shell=True)
        assignmentList = assignmentList.split("\n")
        assignmentList = assignmentList[0:len(assignmentList) -1]

        return assignmentList
    

    def compileCheck(self, originalFiles):
        print "compileCheck"
        print originalFiles
        for f in originalFiles:
            print "f is " + f
            for fName in self.files:
                print "fName is " + fName
                cleanedUpFileName = f.split("_")[len(f.split("_")) -1]
                cleanedUpFileName = cleanedUpFileName.split("-")[0]

                if ".java" not in cleanedUpFileName:
                    cleanedUpFileName += ".java"
                print "cleanedUpFileName " + cleanedUpFileName 
                if fName in cleanedUpFileName or fName.lower() in cleanedUpFileName:
                    print "\tfName in f"
                    subprocess.call("cp submissions/" + self.labName + "/" + f + " sandbox/", shell=True)
                    subprocess.call("mv sandbox/" + f + " sandbox/" + fName, shell=True)
        
        temp = subprocess.check_output("ls sandbox", shell=True)
        print "ls sandbox\n" + str(temp)

        subprocess.call("cp requiredClasses/" + self.required_file + " sandbox/", shell=True)
        self.helperClasses()
        subprocess.call("javac -encoding ISO-8859-1 sandbox/*.java", shell=True)
        print "done compileCheck"
        
    def compare(self, stringA, stringB):    
        difference = [li for li in list(difflib.ndiff(stringA, stringB)) if li[0] != ' ']

        return difference

    def checkOutputGrade(self, output):
        #index = output.index("Grade=" ) + len("Grade=")
        index = output.index("Total:")
        grade = output[index:]
        return grade

    def outputCheck(self):
        temp = subprocess.check_output("ls sandbox", shell=True)
        print "ls sandbox\n" + str(temp)
        results = subprocess.check_output("cd sandbox/ && java " + self.required_file.replace(".java", ""), shell=True)
        results = results.replace("\n", "").replace("\t", "").strip().replace(" ", "")
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
        count = 0
        step = len(self.files)
        numOfSections = len(assignmentList) / step
        while count < numOfSections:
            section = [assignmentList[i], assignmentList[i + 1], assignmentList[i + 2]]
            assignmentList_new.append(section)
            i += step
            count += 1

        results = {}
        i = 0
        for assignment in assignmentList_new:
        #for assignment in assignmentList:
            internal_ob = {}
            aFile = str(assignment[0])
            internal_ob["name"] = aFile[:aFile.index('_')]
            print "student " + internal_ob["name"]
            #internal_ob["name"] = assignment[0].split("_")[0]
            internal_ob["output"] = ""
            internal_ob["grade"] = 0
            internal_ob["errors"] = ""
            internal_ob["errorList"] = ""

            try:
                self.compileCheck(assignment)
            except Exception as e:
                print "\tfailed compileCheck"
                internal_ob["errors"] = str(e)
            try:
                internal_ob["output"] = self.outputCheck()
                internal_ob["grade"] = str(self.checkOutputGrade(internal_ob["output"]))
            except Exception as e:
                print "\tfailed outputCheck"
                internal_ob["errorList"] = str(e)
                
            subprocess.call("rm sandbox/*", shell=True)
            results[i] = internal_ob
            i += 1

        self.generateResults(results)

Checker(specLab).run()
