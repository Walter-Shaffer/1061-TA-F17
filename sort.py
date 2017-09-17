#Used to sort student submissions, does sorting based on observed Canvas naming format
#Will make a dir for each student and move their files into it

import os
import glob

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
		if dirN not in dirs:
			os.system('mkdir ' + dirN)
			dirs.append(dirN)
		os.system('mv ./' + fileN + ' ./' + dirN + '/' + newFileN )
