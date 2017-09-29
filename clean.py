#pass file name or *.type to remove all form sub dirs 
#ex. python clean *.txt

import os, sys

args = sys.argv
dirs = []
for (root, dirnames, filenames) in os.walk(os.getcwd()):
	dirs.extend(dirnames)
	break

for d in dirs:
	for arg in args:
		if arg[-8:] == 'clean.py':
			continue
		print 'removing ' + arg + ' in ' + d + '/' + arg
		os.system('rm -f ' + d + '/' + arg)
	

