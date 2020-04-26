#!/bin/sh

# a shell script which downloads a project via url and runs evosuite against it

# takes desired name of parent directory and name of zipped project as args
DIR=$1
ZIP=$2
EVOSUITE='java -jar ../../../evosuite.jar'

# unzip zip file into ReplicationProjects directory
# unzip 'ReplicationProjects/'$ZIP -d 'ReplicationProjects/'$DIR

# move into unzipped project's parent directory
cd 'ReplicationProjects/'$DIR
# get name of unzipped directory and move into it
PROJECT=$(ls | head -n 1)
cd $PROJECT

#compiles the project with mvn
mvn 'compile'
#run evosuite against ALL newly compiled classes
$EVOSUITE -prefix '' -projectCP 'target/classes'
#move statistics file to results directory
mv 'evosuite-report/statistics.csv' '../../../ReplicationResults/'$DIR'_statistics.csv'
# $EVOSUITE -listClasses -target 'C:\Users\ryanm\OneDrive\Desktop\CS520\EvosuiteReplication\ReplicationProjects\Tutorial_Stack\Tutorial_Stack\src'
