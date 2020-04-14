#!/bin/sh

#a shell script which downloads a project via url and runs evosuite against it

#downloads project via name of zip file given via argument
DIR=$1
ZIP=$2
EVOSUITE='java -jar evosuite.jar'

# unzip 'ReplicationProjects/'$ZIP -d 'ReplicationProjects/'$DIR

echo 'Running EvoSuite'
$EVOSUITE -listClasses -target 'ReplicationProjects/'$DIR

# $EVOSUITE -target 'ReplicationProjects/'$DIR -projectCP 'target/classes'
