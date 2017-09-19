#compiles a java program in each sub dir
import os, sys

dirs = [];
for (root, dirnames, filenames) in os.walk(os.getcwd()):
	dirs.extend(dirnames)
	break


base = os.getcwd()
javaN = sys.argv[1]

for d in dirs:
	path = d + '/'
	os.chdir(path)
	os.system('javac ' + javaN )
	os.chdir(base)

