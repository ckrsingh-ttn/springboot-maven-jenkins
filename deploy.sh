#!/bin/bash
export BUILD_ID=dontKillMe
app_id=$(ps -ef | grep 'springboot-maven-jenkins-0.0.1-SNAPSHOT.jar' | grep -v 'grep' | awk '{ printf $2 }')
kill -9 $app_id
nohup java -jar ./target/springboot-maven-jenkins-0.0.1-SNAPSHOT.jar &
