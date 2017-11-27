import subprocess

fileList = subprocess.check_output("ls submissions/project3/", shell=True)
fileList = fileList.split("\n")[0:len(fileList.split("\n")) - 1]

fileNameList = ["Bagels", "Engine", "Player"]
requiredFiles = ["Validator.java"]

#getting a list of students without duplicates
studentList = []
for f in fileList:
    name = f.split("_")[0]
    if name not in studentList:
        studentList.append(name)

#for every student, create a separate directory
for student in studentList:
    subprocess.call("mkdir holder/project3/" + student, shell=True)

    #grab all the files associated with the students, move them, and renname them correctly
    studentFiles = [x for x in fileList if student in x]
    for f in studentFiles:
        subprocess.call("cp submissions/project3/" + f + " holder/project3/" + student + "/", shell=True)
        for name in fileNameList:
            if name in f:
                subprocess.call("cd holder/project3/" + student + " && mv " + f + " " + name + ".java", shell=True)

        #copy any required files form RequiredClasse
        for reqF in requiredFiles:
            subprocess.call("cp requiredClasses/" + reqF + " holder/project3/" + student + "/", shell=True)

        #compile everything
        subprocess.call("cd holder/project3/" + student + "/ && javac *.java", shell=True)
     
