#Runs and test student projects
#Students files must already be downloaded and sorted in to own dirs
#takes name of java file and then a optional flag if test cases require multiple inputs
#there must be a testCases.txt and results.txt (copies for project 1 in waltsTest) file in the dir with all the students sub dirs
#grades are printed to grades.txt, if a student recieves less than a 100 a error.txt file will generated in their dir with more details
#ex. python ../1061-TA-F17/fullSet.py CreditCardPayOff.java False 

import time, os, sys, re
import subprocess
from subprocess import PIPE, Popen

class Student:

	def __init__(self, name, grade):
		self.Name = name
		self.Grade = grade

def getExpectedResults(resultsFile):
	expectedResults = []
	with open(resultsFile) as file:
		for line in file:
			expectedResults.append(line.split())

	return expectedResults

def checkFileForResults(fileName, values):
	count = len(values)
	ogCount = count
	tempPath = os.getcwd()
	with open(fileName.strip()) as testFile:
		temp = testFile.read()
		words = temp.split();
		for word in words:
			if word.strip() in values:
				count = count - 1

	return (ogCount - count)/float(ogCount)

def checkFileForHeader(fileName):
	header = "The following code represents my own work"
	flag = False
	with open(fileName) as file:
		for line in file:
			if header in line:
				flag = True
				break

	return flag

def compileProgram(nameOfProgarm): 
	os.system('javac ' + nameOfProgarm)

def checkJavaFileName(fileName):
	path = os.getcwd()
	path = path + '/' + fileName
	return os.path.isfile(path)

def runSingleLineTestCases(testCasesFile, className, errorFile):
	with open(testCasesFile) as testCases:
		count = 0;
		for line in testCases:
			count = count + 1
			curTestResult = 'test' + str(count) +'.txt'
			with open(curTestResult, 'w') as outTxt:
				p = subprocess.Popen( ['java', className], stdin=PIPE, stdout=outTxt, stderr=errorFile)
				p.communicate(input=line)

	return count

def runMultiLineTestCases(testCasesFile, className, errorFile):
	testCases = []
	count = 0
	with open(testCasesFile) as testCasesTxt:
		for line in testCasesTxt:
			if line == 'test\n':
				count = count + 1
				testCases.append([])
			else:
				testCases[count - 1].append(line.strip())

	count = 0
	for test in testCases:
		count = count + 1
		curTestResult = 'test' + str(count) + '.txt'
		with open(curTestResult, 'w') as outTxt:
				cmd = 'java ' + className
				p = subprocess.Popen(cmd, shell=True, stdin=subprocess.PIPE, stdout=outTxt, stderr=errorFile)
				for inputValue in test:
					p.stdin.write(inputValue + "\n")

	time.sleep(2)
	return count

def runTestCases(testCasesFile, className, singleLineTests, errorFile):
	if singleLineTests == True:
		return runSingleLineTestCases(testCasesFile, className, errorFile)
	else:
		return runMultiLineTestCases(testCasesFile, className, errorFile)

def cleanJavaFileNameIn(path, className):
	onlyfiles = [f for f in os.listdir(path) if os.path.isfile(os.path.join(path, f))]
	for fileName in onlyfiles:
		if className in fileName:
			print('chaning: ' + fileName)
			newName = re.sub('-\d+.java', '.java', fileName)
			print('to: ' + newName)
			os.system('cp ' + fileName + ' ' + newName)

students = []

programName = sys.argv[1]
className = programName[0:programName.index('.')]

areTestCasesSingleLines = True
if len(sys.argv) >= 2:
	areTestCasesSingleLines = False

expectedResults = getExpectedResults('results.txt')

dirs = []
for (root, dirnames, filenames) in os.walk(os.getcwd()):
	dirs.extend(dirnames)
	break

base = os.getcwd()

for d in dirs:
	path = d + '/'
	curGrade = 40 #Assuming For project 1: Commenting: +5, Code Indentation: +5, Input: +10, Output: +10 and header: +5, file name: +5 
	os.chdir(path) 
	error =  open('error.txt', 'w')
	if checkJavaFileName(programName) == False:
		cleanJavaFileNameIn(base + '/' + path, className)

	if checkJavaFileName(programName) == True:
		compileProgram(programName)
		numOfTest = runTestCases('../testCases.txt', className, areTestCasesSingleLines, error)

		for i in range(1, numOfTest + 1):
			curTestFile = 'test' + str(i) + '.txt'
			precent = checkFileForResults(curTestFile, expectedResults[i-1])
			if precent == 1:
				curGrade = curGrade + 12
			else:
				error.write(curTestFile + ' ' + str(precent) + '%\n')
				curGrade = curGrade + 12*precent #For project 1
				#curGrade = curGrade + (100/numOfTest)*precent

		if checkFileForHeader(programName) == False:
			#curGrade = curGrade - 10
			curGrade = curGrade - 5 #For project 1
			error.write('failed header check')

	else:
		curGrade = curGrade - 5 #For project 1
		#curGrade = curGrade - 10
		error.write('failed file name check')

	error.close()
	if os.stat("error.txt").st_size == 0:
		os.remove('error.txt')
	students.append(Student(d, curGrade))
	os.chdir(base)	

grades = open('grades.txt', 'w')
for s in students:
	grades.write(s.Name + ', ' + str(s.Grade) + '\n')

# for s in students:
# 	print('name: ' + s.Name + '\tgrade: ' + str(s.Grade))








