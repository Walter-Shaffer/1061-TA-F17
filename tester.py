import os
import sys
import subprocess
import json


def single(arg1, arg2=None):
	print "arg1 = " + arg1
	if arg2 != None:
		arg2["beta"] = "sinlge"
		# arg2 = "four"
		# print "arg2 = " + arg2

# # var1 = "three"
# # list1 = ["1", "2"]
# dic = {"one": "one", "two": "two"}
# # single("one")
# single("two", dic)
# var1 = "sdoij oitj w[oitw  \n dkdk"
# dic["alpha"] = var1
# for e in dic:
# 	print "\te = " + dic[e]
# print "josn"
# print json.dumps(dic)
#print "var1 = " + var1

dic = {}
dic.setdefault(key, [])
dic["a"] = "one"
print dic["a"]
print "test " + dic["v"] + " end"