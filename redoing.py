import subprocess
import os
import glob
import re
import json

def sort(assignmentName):
	cwd = os.getcwd()
	subprocess.call("unzip " + cwd + "/submissions/" + assignmentName + " -d " + cwd + "/sandbox", shell=True)
	os.chdir(cwd + "/sandbox")

	files = [];
	dirs = [];
	for (root, dirnames, filenames) in os.walk(os.getcwd()):
		files.extend(filenames)
		dirs.extend(dirnames)
		break

	for fileN in files:
		if fileN.endswith(".java"):
			dirN = fileN[0:fileN.index('_')]
			newFileN = fileN[fileN.rfind('_') + 1:]
			newFileN =  re.sub('-\d+.java', '.java', newFileN)
			
			if dirN not in dirs:
				os.system('mkdir ' + dirN)
				dirs.append(dirN)
			os.system('mv ./' + fileN + ' ./' + dirN + '/' + newFileN )
	os.chdir(cwd)
	

def compileFiles(assignmentName, errorJSON=None):
	# print "compileFiles"
	# print arg
	# for fileName in arg:
	# 	print "fileName = " + fileName
	# 	p = subprocess.Popen("javac " + str(fileName), shell=True, stdin=None, stderr=subprocess.PIPE)
	# 	error = p.communicate()[1]
	# 	if errorJSON != None and len(error) > 0:
	# 		key = "compileError_" + fileName 
	# 		errorJSON[key] = error


	p = subprocess.Popen("javac " + str(assignmentName), shell=True, stdin=None, stderr=subprocess.PIPE)
	error = p.communicate()[1]
	if errorJSON != None and len(error) > 0:
		key = "compileError_" + fileName 
		errorJSON[key] = error
		# errorJSON["compileError"] = error
		# errFile = open("error.txt", 'a')
		# errFile.write("{\"compileError\":\"")
		# errFile.write(error)
		# errFile.write("\"}")

def linker(*arg):
	for fileN in arg:
		subprocess.call("ln ../../helperClasses/" + fileN + " " + fileN, shell=True, stderr=None, stdout=None)

def runClass(className, testCaseName="output", writeOutputToFile=False, errorJSON=None, outputJSON=None):
	p = subprocess.Popen("java " + str(className), shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
	output, error = p.communicate()
	if writeOutputToFile:
		outputFile = open(testCaseName + '.txt', 'a')
		outputFile.write(output)
	if errorJSON != None and len(error) > 0:
		errorJSON["runTimeError"] = error
	if outputJSON != None:
		outputJSON[testCaseName] = output

class grader(object):
	errorJSON = {}
	outputJSON = {}


	"""docstring for grader"""
	def __init__(self, errorJSON=None, outputJSON=None):
		super(grader, self).__init__()
		if errorJSON != None:
			self.errorJSON = errorJSON
		if outputJSON != None:
			self.outputJSON = outputJSON

		#self.outputJSON.setDefault(key, []).append(value)

	def runTrack(self, func, runMultipleTimes=1, *args):
		if runMultipleTimes == 1:
			func(outputJSON=self.outputJSON, errorJSON=self.errorJSON, *args)
		else:
			for arg in args:
				func(outputJSON=self.outputJSON, errorJSON=self.errorJSON, *args)

	def runErrorTrack(self, func, runMultipleTimes=1, *args):
		if runMultipleTimes == 1:
			func(errorJSON=self.errorJSON, *args)
		else:
			for arg in args:
				func(arg, errorJSON=self.errorJSON)


	def run(self, func, runMultipleTimes=1, *args):
		if runMultipleTimes == 1:
			func(*args)
		else:
			for arg in args:
				func(arg)

def generateResults(ob):
        with open("results/" + self.labName + ".csv", "wb") as csvfile:
            #fieldnames = ob[1].keys() + ["error"]
            fieldnames = ob[0].keys()
            f = csv.DictWriter(csvfile, fieldnames=fieldnames)
            f.writeheader()
            for value in ob.values():
                f.writerow(value)
		
def walker(func, *arg):
	baseDir = os.getcwd()
	sandbox = baseDir + "/sandbox"
	dirs = [];
	for (root, dirnames, filenames) in os.walk(sandbox):
		dirs.extend(dirnames)
		break

	for directory in dirs:
		
		os.chdir(sandbox + "/" + directory)
		for var in arg:
		 	func(var)
		
		os.chdir(sandbox)

	os.chdir(baseDir)


#def checkOutput(testCaseName, outputJSON, expectedOutputJSON, resultsJSON=None):


		
# def runner(testerClass):
# 	outout = subprocess.check_output("java " + testerClass, shell=True)
# 	return outout



# class writer():
# 	testCaseCount = 0
# 	studentName

# 	def __init__(self, studentName):
# 		self.studentName = studentName

# 	def testCase(output):
#linker "RubricCircleTester.java"
# sort("lab8")
# walker(linker, "RubricCircleTester.java")
# print "start"
# e = {}
# o = {}
# print "e " + json.dumps(e)
# g = grader(errorJSON=e, outputJSON=o)
# g.referenceTest()
# print "e after " + json.dumps(e)
# print "o after " + json.dumps(o)
#walker(compileFiles, "Circle.java", "CircleTester.java", "RubricCircleTester.java")

#walker(runClass, "CircleTester.java", "theirTest", True)
print "start"


#walker(compileFiles, "Circle.java", "CircleTester.java", "RubricCircleTester.java")
print "done"

# def grader():


# def runner():
