import sys, os

class Student:

	def __init__(self, name, grade):
		self.Name = name
		self.Grade = grade

def getExpectedResults(fileName):
	expectedResults = []
	with open(fileName) as file:
		for line in file:
			expectedResults.append(line.split())

	return expectedResults

def checkFileForResults(fileName, values):
	count = len(values)
	with open(fileName) as file:
		for line in file:
			line = line.replace(':', ' ')
			words = line.split()
			for word in words:
				if word in values:
					count = count - 1

	if count == 0:
		return True

	return False

def getTestCaseNames(num):
	tests = []
	for i in range(1, num + 1):
		tests.append('test' + str(i) + '.txt')
	return tests


numOfTest = int(sys.argv[1])
resultsFile = sys.argv[2]

students = []
results = getExpectedResults(resultsFile)
tests = getTestCaseNames(numOfTest)

dirs = []
for (root, dirnames, filenames) in os.walk(os.getcwd()):
	dirs.extend(dirnames)
	break

base = os.getcwd()

for d in dirs:
	path = d + '/'
	curGrade = 0
	os.chdir(path)
	for i in range(0, numOfTest):
		if checkFileForResults(tests[i], results[i]):
			curGrade = curGrade + 100/numOfTest
		# else:
		# 	print(d + ' failed ' + tests[i])	
	students.append(Student(d, curGrade))
	os.chdir(base)

for s in students:
	print('name: ' + s.Name + '\tgrade: ' + str(s.Grade))
