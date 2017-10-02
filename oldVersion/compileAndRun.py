#Will compile and then execute Java programs that do not require any arguments
#Will save out put from executing the java class to out.txt file in student sub dir
#Will then compare out.txt to the expected.txt file 
#expected.txt needs to be stored in the cur lab dir or one dir higher than the student dirs
#If out.txt matches the expected out put out.txt will be renamed pass.txt, if does not match out.txt will be renamed fail.txt

#ex. python compileAndRun.py HelloWorld.java

import os, sys
import filecmp

dirs = [];
for (root, dirnames, filenames) in os.walk(os.getcwd()):
	dirs.extend(dirnames)
	break


base = os.getcwd()
javaN = sys.argv[1]
classN = javaN[0:javaN.index('.')]

for d in dirs:
	path = d + '/'
	os.chdir(path)
	os.system('javac ' + javaN )
	os.system('java ' + classN + ' > out.txt')
	if filecmp.cmp('out.txt', '../expected.txt', shallow=True): 
		os.system('mv out.txt pass.txt')
	else:
		os.system('mv out.txt fail.txt')
	os.chdir(base)

