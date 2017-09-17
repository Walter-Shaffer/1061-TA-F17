#Run to compile and then execute Java programs that do not require any arguments
#Will save out put from executing to out.txt file in student sub dir
#Will then compare out.txt to the expected.txt file 
#expected.txt needs to be stored in the cur lab dir or one dir higher than the student dirs
#If out.txt matches the expected out put out.txt will be renamed pass.txt, if does not match out.txt will be renamed fail.txt


import os, sys
import filecmp

dirs = [];
for (root, dirnames, filenames) in os.walk(os.getcwd()):
	dirs.extend(dirnames)
	break


base = os.getcwd()

for d in dirs:
	path = d + '/'
	os.chdir(path)
	os.system('javac ' + sys.argv[1] )
	os.system('java HelloWorld > out.txt')
	if filecmp.cmp('out.txt', '../expected.txt', shallow=True): 
		os.system('mv out.txt pass.txt')
	else:
		os.system('mv out.txt fail.txt')
	os.chdir(base)

