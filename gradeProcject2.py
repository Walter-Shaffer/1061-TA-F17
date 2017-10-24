import subprocess
import sys
import json
import csv
import re
import time

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

        MAX_TESTCASE_POINTS = txt["total_test_cases_Points"]
        self.MAX_TESTCASE_POINTS = MAX_TESTCASE_POINTS

        HEADER_POINTS = txt["header_Points"]
        self.HEADER_POINTS = HEADER_POINTS

        FILE_NAME_POINTS = txt["file_name_Points"]
        self.FILE_NAME_POINTS = FILE_NAME_POINTS

        FORMATTING_POINTS = txt["formatting_Points"]
        self.FORMATTING_POINTS = FORMATTING_POINTS

        test_cases = txt["test_cases"]
        self.test_cases = test_cases

        header = txt["header"].strip()
        self.expected_header = header

        file_name = txt["file_name"].strip()
        self.expected_fileName = file_name

    def compileCheck(self, originalName, cleanedUpName, num):
        subprocess.call("ln Fetch.class sandbox/Fetch.class", shell=True)
        subprocess.call("touch sandbox/" + str(num) + ".txt", shell=True)
        subprocess.call("cp submissions/" + self.labName + "/" + originalName + " sandbox/", shell=True)
        subprocess.call("mv sandbox/" + originalName + " sandbox/" + cleanedUpName, shell=True)
        subprocess.call("javac -encoding ISO-8859-1 sandbox/" + cleanedUpName, shell=True)

    def project2Check(self, cleanedUpName):
        i = 0
        earnedPoints = 0.0
        partialCreditPcentage = 0.0
        partialCreditComments = ''
        formatingFlag = 0
        numOfTest = len(self.test_cases)
        while i < numOfTest:
            case = self.test_cases[i]
            caseInput = case["input"]
            casePointValue = case["testCasePointValue"]
        
            #I am having a issue with the timing. Mainly waiting till every thing is written to outputOfProgram
            #Was thinking about trying to thread 

            cmd = 'cd sandbox/ && java ' + cleanedUpName.replace(".java", "")
            p = subprocess.Popen(cmd, shell=True, stdin=subprocess.PIPE, stdout=subprocess.PIPE)
            for inputValue in caseInput:
                p.stdin.write(inputValue + "\n")

            time.sleep(5)
            outputOfProgram = p.communicate()[0]
            formattedOutputOfProgram = outputOfProgram
            outputOfProgram = outputOfProgram.lower().replace("\n", "").replace("\t", "").strip().replace(" ", "")
            expectedOutput = case["output"].replace(" ", "").lower()

            if outputOfProgram == expectedOutput:
                earnedPoints += casePointValue
            else:
                earnedPoints += casePointValue
                keyParts = case["keyParts"]

                #print "Their outout:\n" + outputOfProgram

                totalPartCount = 0
                for part in keyParts:
                    totalPartCount += part["count"]

                for part in keyParts:
                    #doesnt matter for prject 2
                    if part["type"] == "num":
                        temp = part["value"]
                        part["value"] = [ temp - .01, temp, temp + .01]
                        #some processing logic
                    else:
                        partValue = part["value"]
                        partValue = partValue.lower().replace("\n", "").replace(" ", "")
                        missingPartCount = part["count"] - outputOfProgram.count(partValue)
                        if missingPartCount > 0:
                            print "Their outout for test case " + str(i) + ":\n" + formattedOutputOfProgram
                            count = part["count"]
                            deduction = casePointValue * (missingPartCount/float(totalPartCount))
                            earnedPoints -= deduction
                            newSegment = "-" + str(deduction) + " in test case " + str(i) + " for Missing " + partValue + ", needed " + str(count) + " occurrences, found " + str(count - missingPartCount) + ": " 
                            print newSegment + "\n"
                            partialCreditComments = partialCreditComments + newSegment
                     
            i += 1

        if partialCreditComments != '':
            partialCreditComments = partialCreditComments + "Total credit from test cases is " + str(earnedPoints) + " out of " + str(self.MAX_TESTCASE_POINTS) + ". Percent::" + str((earnedPoints/float(self.MAX_TESTCASE_POINTS)))
            partialCreditComments = "Partial credit error: " + partialCreditComments 
            raise Exception(partialCreditComments)


        # cmd = "rm sandbox/*" + cleanedUpName + "*"
        # subprocess.call( cmd, shell=True)
        subprocess.call("rm sandbox/*", shell=True)

    def headerCheck(self, cleanedUpName):
        f = open("sandbox/" + cleanedUpName, "r")
        code = f.read()

        classConstruction = code.index("public class")
        headerOfProgram = code[0:classConstruction].strip()
        header_segments = ["Author", "Submission Date", "Purpose", "Academic Honesty"]
        headerValue = 1

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


    def cleanFileName(self, originalName):
        return re.sub('-\d+.java', '.java', originalName)

    def run(self):
        self.setup()
        i = 0
        results = {}
        
        for assignment in self.getAssignmentList():
            studentScore = {}
            studentScore["name"] = assignment.split("_")[0]

            fileName = assignment.split("_")[-1]
            fileNameValue = 1
            fileName = self.cleanFileName(fileName)
            if fileName != self.expected_fileName:
                fileNameValue = 0
            studentScore["file_name"] = fileNameValue

            #nameCheck = self.cleanFileName(fileName)
            # if nameCheck != self.expected_fileName:
            #     fileNameValue = 0
            # studentScore["file_name"] = fileNameValue

            # if "-" in fileName:
            #     fileName = fileName.split("-")[0] + ".java"
            # print assignment, fileName

            compileValue = 0
            headerValue = 1
            outputValue = 0
            errorValue = 0
            formatValue = 0

            print '\n' + studentScore["name"] + '---------------------------------------------------------------------------------------------------------------'

            try:
                self.compileCheck(assignment, fileName, i)
                compileValue = 1

                #outputValue = self.outputCheck(fileName)
                self.project2Check(fileName)
                outputValue = 1
                formatValue = 1
            except Exception as e: 
                print e
                print '\n'
                if str(e).startswith("formatting error &") == True:
                    temp = str(e)[str(e).index('::') + 1:]
                    print "test temp = " + temp
                    outputValue = float(str(e)[str(e).index('::') + 1:])
                    compileValue = 1
                    formatValue = 0
                elif str(e) == "formatting error":
                    compileValue = 1
                    outputValue = 1
                    formatValue = 0
                elif str(e).startswith("Partial credit error") == True:
                    outputValue = float(str(e)[str(e).index('::') + 2:])
                    compileValue = 1
                    formatValue = 1
                else:
                    compileValue = 0
                    outputValue = 0
                    formatValue = 1
                errorValue = str(e)

            # try:

            #     self.headerCheck(fileName)
            #     headerValue = 1
            #     print "passed header check"
            # except:
            #     headerValue = 0

            deductions = ''    
            grade = 100 - self.MAX_TESTCASE_POINTS
            if compileValue == 0 or outputValue == 0:
                grade = 0
            else:
                grade = grade + self.MAX_TESTCASE_POINTS * outputValue
                if outputValue != 1:
                    pointsOff = 1 - outputValue
                    pointsOff = pointsOff * self.MAX_TESTCASE_POINTS
                    deductions = deductions + '-' + str(pointsOff) + ' from testCases; '
                if headerValue == 0:
                    grade -= self.HEADER_POINTS
                    deductions = deductions + '-' + str(self.HEADER_POINTS) + ' no header; '
                if fileNameValue == 0:
                    grade -= self.FILE_NAME_POINTS
                    deductions = deductions + '-' + str(self.FILE_NAME_POINTS) + ' file name wrong; '
                #if studentScore["error"] != "":
                #    grade -= 10
                if formatValue == 0:
                    grade -= self.FORMATTING_POINTS
                    deductions = deductions + '-' + str(self.FORMATTING_POINTS) +' formatting incorrect; '

            # cmd = "rm sandbox/*" + fileName + "*"
            # subprocess.call( cmd, shell=True)
            subprocess.call("rm sandbox/*", shell=True)

            studentScore["compiling"] = compileValue
            studentScore["header"] = headerValue
            studentScore["output"] = outputValue
            studentScore["error"] = errorValue
            studentScore["deductions"] = deductions
            studentScore["format"] = formatValue
            studentScore["grade"] = grade

            results[i] = studentScore
            i += 1

        self.generateResults(results)

Checker(specLab).run()
