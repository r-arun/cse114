import sys
import os

def getStudentName(_dir):
	return os.listdir(_dir)

def createProject(student, srcName, srcProject, submissionDir):
	os.mkdir(student)
	os.chdir(student)
	os.mkdir("bin")
	#print os.path.join(submissionDir,student)
	os.system("cp -r %s src" %(os.path.join(submissionDir,student)))
	os.system("cp -r %s/.settings ." %(srcProject))
	os.system("cp  %s/.classpath ." %(srcProject))
	os.system('sed "s/%s/%s/" %s/.project > .project' %(srcName, student, srcProject))

destDir = sys.argv[1]
srcProject = sys.argv[2]
srcName = os.path.basename(srcProject)
submissionDir = sys.argv[3]


print destDir, srcProject, srcName, submissionDir

destFiles = getStudentName(submissionDir)

print destFiles

for _file in destFiles:
	os.chdir(destDir)
	if os.path.exists(_file):
		print "Exists "+_file
		continue
	print "Creating new project %s" %(_file)
	createProject(_file, srcName, srcProject, submissionDir)
