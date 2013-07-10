import sys
import os

def getStudentName(_dir):
	student_name = os.listdir(_dir)	
	return [ i+'.xls' for i in student_name]	

destDir = sys.argv[1]
srcFile = sys.argv[2]
submissionDir = sys.argv[3]

destFiles = getStudentName(submissionDir)

print destFiles

os.chdir(destDir)

for _file in destFiles:
	if os.path.exists(_file):
		print "Exists "+_file
		continue
	print "Copying %s %s" %(srcFile, _file)
	os.system("cp %s %s" %(srcFile, _file))
