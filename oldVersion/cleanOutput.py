import sys, os
import re

dirs = [];
for (root, dirnames, filenames) in os.walk(os.getcwd()):
	dirs.extend(dirnames)
	break

base = os.getcwd()

for d in dirs:
	path = d + '/'
	os.chdir(path)

	temp = open('temp.txt', 'a')
	with open('out.txt') as output:
		for line in output:
			if(line != '\n'):
				line = re.sub('\s+', '', line)
				temp.write(line.lower() + '\n')
	os.system('rm -f out.txt')
	os.system('mv temp.txt out.txt')
	os.chdir(base)

