import subprocess
import time

tests = [["1", "test1"], ["p"], ["r", "2", "test3"], ["q"]]

def do(a):
    if a[0] == "1":
        p = subprocess.Popen("cd sandbox && java Bagels", stdin=subprocess.PIPE, stdout=subprocess.PIPE, universal_newlines=True, bufsize=1, shell=True)
        for param in a:
            p.stdin.write(str(param) + "\n")
            print p.stdin.read()

        i = 0
        while i < 10:
            try:
                p.stdin.write(str(i) + "\n")
                print i
                i += 1
            except:
                i = 10
        #print p.communicate()[0] 

p = subprocess.check_output("ls submissions/project3/", shell=True)
print len(p.split("\n")) / 3
print p.split("\n")[22 * 3]

def bro():
    for test in tests:
        print test
        for option in test:
            print option
            p.stdin.write(str(option) + "\n")
        if test[0] != "q":
            if test[0] == "1" or test[0] == "p":
                i = 0
                while i < 10:
                    try:
                        p.stdin.write(str(i) + "\n")
                        print i
                        i += 1
                    except:
                        i = 10
            else:
                while i < 100:
                    try:
                        p.stdin.write(str(i) + "\n")
                        print i
                        i += 1
                    except:
                        i = 100
    p.communicate()[0]
        

         



