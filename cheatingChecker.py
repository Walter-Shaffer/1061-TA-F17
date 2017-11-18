import subprocess
import sys
import re
import difflib
import numpy as np

specLab = str(sys.argv[1])

class CheaterChecker():

    def __init__(self, specLab):
        self.labName = specLab

    def getAssignmentList(self):
        assignmentList = subprocess.check_output("ls submissions/" + self.labName + "/", shell=True)
        assignmentList = assignmentList.split("\n")
        assignmentList = assignmentList[0:len(assignmentList) -1]

        return assignmentList

    def removeComments(self, string):
        string = re.sub(re.compile("/\*.*?\*/",re.DOTALL ) ,"" ,string) # remove all occurance streamed comments (/*COMMENT */) from string
        string = re.sub(re.compile("//.*?\n" ) ,"" ,string) # remove all occurance singleline comments (//COMMENT\n ) from string
        return string

    def cleanup(self, string):
        uncommented_code = self.removeComments(string)
        stripped_code = " ".join(uncommented_code.split())
        stripped_code = stripped_code.replace(" ", "")

        return stripped_code

    def compare(self, stringA, stringB):    
        difference = [li for li in list(difflib.ndiff(stringA, stringB)) if li[0] != ' ']

        return len(difference) / 2

    def breakdown(self):
        assignmentList = self.getAssignmentList()
        strippedCodeList = {}
        for assignment in assignmentList:
            for other in assignmentList:
                tag1 = assignment + "---" + other
                tag2 = other + "---" + assignment
                if tag1 not in strippedCodeList.keys() and tag2 not in strippedCodeList.keys():
                    strippedCodeList[tag1] = 0

        print len(strippedCodeList.keys())
        i = 0
        for combo in strippedCodeList.keys():
            print i, "/", len(strippedCodeList.keys())
            f1 = open("submissions/" + self.labName + "/" + combo.split("---")[0], "r")
            f2 = open("submissions/" + self.labName + "/" + combo.split("---")[1], "r")

            f1_raw = f1.read()
            f2_raw = f2.read()
            f1_stripped = self.cleanup(f1_raw)
            f2_stripped = self.cleanup(f2_raw)
            comparison = self.compare(f1_stripped, f2_stripped)
            strippedCodeList[combo] = comparison
            i += 1
        
        return strippedCodeList

    def makeFile(self, ob):
        f = open("cheating/" + self.labName + ".txt", "rw")
        f.write(json.dump(ob))
        
    def run(self):
        results = self.breakdown()
        self.makeFile(results)

        #print np.mean(strippedCodeList.values())

        #for code in strippedCodeList:
        #    for other in strippedCodeList:
        #        print self.compare(code, other)

CheaterChecker(specLab).run()

