import subprocess
import sys
import json
import csv
import re

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
        partialCreditFlag = 0.0
        partialCreditStr = ''
        formatingFlag = 0
        numOfTest = len(self.expected_output)
        while i < numOfTest:
            case = self.expected_output[i]
            caseInput = case["input"]
            if isinstance(caseInput, list):
                cmd = 'cd sandbox/ && java ' + cleanedUpName.replace(".java", "")
                p = subprocess.Popen(cmd, shell=True, stdin=subprocess.PIPE, stdout=subprocess.PIPE)
                for inputValue in caseInput:
                    p.stdin.write(inputValue + "\n")

                outputOfProgram = p.communicate()[0]
                outputOfProgram = outputOfProgram.lower().replace("enter", "").replace("\n", "").replace("\t", "").strip().replace(" ", "")
                expectedOutput = case["output"].replace(" ", "").lower()
                keyPartsOfOutput = case["keyParts"]

                print outputOfProgram

                temp = []
                for part in keyPartsOfOutput:
                    if len(str(part)) <= 2:
                        temp.append([part])
                    else: 
                        temp.append([ part - .01, part, part + .01])
                    # temp.append(part)  
                    # temp.append(part - .01)
                    # temp.append(part + .01)

                keyPartsOfOutput = temp

                if outputOfProgram == expectedOutput:
                    if partialCreditFlag != 0.0:
                        partialCreditFlag += 1.0
                    elif formatingFlag != 0:
                        formatingFlag += 1
                    else:
                        inputValue = 1
                else:
                    countOfValuesNotFound = len(keyPartsOfOutput)
                    tempStr = 'needed values: ' 
                    for value in case["keyParts"]:
                        tempStr = tempStr + ' ' + str(value)
                    print tempStr
                    print('Formatted values found')
                    ogCountOfValues = countOfValuesNotFound
                    for valueSet in keyPartsOfOutput:
                        for value in valueSet:
                            if len(str(value)) > 2:
                                value = "{0:.2f}".format(value)
                                decimalCheck = len(value[value.index('.'):])
                                if decimalCheck == 2:
                                    value = value + '0'
                                elif decimalCheck == 1:
                                    value = value + '00'
                                regex = r'\$' + value + r'(\D|$)'
                            else:
                                value = str(value)
                                regex = value + r'(\D|$)'
                            if re.search(regex, outputOfProgram):
                                print '\t' + value 
                                countOfValuesNotFound -= 1
                                break

                    if countOfValuesNotFound != 0:
                        print('Non formatted values found')
                        unformattedCountOfValuesNotFound = ogCountOfValues
                        for unformattedValueSet in keyPartsOfOutput:
                            for unformattedValue in unformattedValueSet:
                                unformattedValue = str(unformattedValue)
                                if unformattedValue in outputOfProgram:
                                    print '\t' + unformattedValue 
                                    unformattedCountOfValuesNotFound -= 1 
                                    break
       
                    if countOfValuesNotFound == 0:
                        if partialCreditFlag != 0.0:
                            partialCreditFlag += 1.0
                        else:
                            inputValue = 1
                    elif unformattedCountOfValuesNotFound <= 0:
                        formatingFlag += 1        
                        if partialCreditFlag != 0.0:
                            partialCreditFlag += 1.0
                        else:
                            inputValue = 1
                    elif unformattedCountOfValuesNotFound == countOfValuesNotFound:# and countOfValuesNotFound < ogCountOfValues:
                        if partialCreditFlag == 0.0:
                            partialCreditFlag = float(i)
                        precent = (ogCountOfValues - countOfValuesNotFound)/float(ogCountOfValues)
                        partialCreditFlag += precent
                        partialCreditStr = partialCreditStr + "partial credit on test " + str(i) + '; '
                    elif unformattedCountOfValuesNotFound != countOfValuesNotFound:
                        formatingFlag += 1 
                        if partialCreditFlag == 0.0:
                            partialCreditFlag = float(i)
                        precent = (ogCountOfValues - unformattedCountOfValuesNotFound)/float(ogCountOfValues)
                        partialCreditFlag += precent
                        partialCreditStr = partialCreditStr + "partial credit on test " + str(i) + '; '
                    elif expectedOutput in outputOfProgram:
                        raise Exception("Other partial credit")# on test " + str(i))
                        i = len(self.expectedcw_output)
                    else:
                        raise Exception("output from test " + str(i) + " doesn't match")
                        i = len(self.expectedcw_output) 

            else:
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
                        raise Exception("Partial credit")
                    else:
                        raise Exception("output from " + case["input"] + " doesn't match")
                    i = len(self.expectedcw_output)

            i += 1

        if formatingFlag != 0 and partialCreditFlag != 0.0:
            #partialCreditStr = partialCreditStr + 'partialCreditFlag= ' + str(partialCreditFlag) + ', numOfTest= ' + str(numOfTest) + '    '
            partialCreditStr = partialCreditStr + 'total credit from test cases(%):' + str(partialCreditFlag/float(numOfTest))
            fullStr = "formatting error & " + partialCreditStr
            raise Exception(fullStr)
        elif formatingFlag != 0:
            raise Exception("formatting error")
        elif partialCreditFlag != 0.0:
            partialCreditStr = partialCreditStr + 'total credit from test cases(%):' + str(partialCreditFlag/float(numOfTest))
            raise Exception(partialCreditStr) 

        #subprocess.call("rm sandbox/*", shell=True)

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
        MAX_TESTCASE_POINTS = 60
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
            headerValue = 0
            outputValue = 0
            errorValue = 0
            formatValue = 0

            print '\n' + studentScore["name"] + '---------------------------------------------------------------------------------------------------------------'

            try:
                self.compileCheck(assignment, fileName, i)
                compileValue = 1

                outputValue = self.outputCheck(fileName)
                outputValue = 1
                formatValue = 1
                headerValue = 1
            except Exception as e: 
                print e
                print '\n'
                if str(e).startswith("formatting error &") == True:
                    outputValue = float(str(e)[str(e).index(':') + 1:])
                    compileValue = 1
                    headerValue = 1
                    formatValue = 0
                elif str(e) == "formatting error":
                    compileValue = 1
                    headerValue = 1
                    outputValue = 1
                    formatValue = 0
                elif str(e).startswith("partial credit") == True:
                    outputValue = float(str(e)[str(e).index(':') + 1:])
                    compileValue = 1
                    headerValue = 1
                    formatValue = 1
                else:
                    compileValue = 0
                    headerValue = 0
                    outputValue = 0
                    formatValue = 1
                errorValue = str(e)

            try:

                self.headerCheck(fileName)
                headerValue = 1
            except:
                headerValue = 0

            deductions = ''    
            grade = 40
            if compileValue == 0 or outputValue == 0:
                grade = 0
            else:
                grade = grade + MAX_TESTCASE_POINTS * outputValue
                if outputValue != 1:
                    pointsOff = 1 - outputValue
                    pointsOff = pointsOff * MAX_TESTCASE_POINTS
                    deductions = deductions + '-' + str(pointsOff) + ' from testCases; '
                if headerValue == 0:
                    grade -= 5
                    deductions = deductions + '-5' + ' no header; '
                if fileNameValue == 0:
                    grade -= 5
                    deductions = deductions + '-5' + ' file name wrong; '
                #if studentScore["error"] != "":
                #    grade -= 10
                if formatValue == 0:
                    grade -= 10
                    deductions = deductions + '-10' + ' formatting incorrect; '

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
