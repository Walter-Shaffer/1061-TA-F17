import subprocess
import time

stuff = [56, 1]

p = subprocess.Popen("cd sandbox/ && java TemperatureConverter", stdin=subprocess.PIPE, stdout=subprocess.PIPE, shell=True)

for el in stuff:
    p.stdin.write(str(el) + "\n")

outputOfProgram = p.communicate()[0]
print outputOfProgram



