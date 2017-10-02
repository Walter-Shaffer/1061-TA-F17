#run test cases on a java program and save out put to out.txt
#takes the name of the java class as the arg
#needs a file with the test cases stored in the current directory

import os, sys
import filecmp
import subprocess
from subprocess import PIPE, Popen

dirs = [];
for (root, dirnames, filenames) in os.walk(os.getcwd()):
	dirs.extend(dirnames)
	break


base = os.getcwd()
classN = sys.argv[1]

for d in dirs:
	path = d + '/'
	os.chdir(path)

	#open('out.txt', 'w').close()
	with open('../testCases.txt') as testCases:
		count = 0;
		for line in testCases:
			count = count + 1
			fileName = 'test' + str(count) +'.txt'
			with open(fileName, 'w') as outTxt:
				p = subprocess.Popen( ['java', classN], stdin=PIPE, stdout=outTxt)
				p.communicate(input=line)
				#outTxt.write('-----------------------------------\n')
	os.chdir(base)

