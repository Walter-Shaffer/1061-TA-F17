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
	if filecmp.cmp('out.txt', '../expected.txt', shallow=True): 
		os.system('mv out.txt pass.txt')
	else:
		os.system('mv out.txt fail.txt')
	os.chdir(base)