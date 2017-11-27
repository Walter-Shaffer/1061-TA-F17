import subprocess
import csv

with open("lorenzo.csv", "wb") as csvfile:
    fieldnames = ["name", "grade"]
    f = csv.DictWriter(csvfile, fieldnames=fieldnames)
    f.writeheader()

    studentList = subprocess.check_output("ls holder/project3/", shell=True)
    studentList = studentList.split("\n")
    studentList = studentList[:-1]

    ob = {}
    i = 0
    for student in studentList:
        intenal_ob = {}
        intenal_ob["name"] = student
        intenal_ob["grade"] = 0
        ob[i] = intenal_ob
        i += 1

    for value in ob.values():
        f.writerow(value)

