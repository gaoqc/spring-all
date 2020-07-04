#!/bin/bash
#java -jar ureka-serv2-0.0.1-SNAPSHOT.jar --spring.profiles.active = 1 
#java -jar -Dspring.config.location=./application-p1.yml euk-ser.jar
#java -jar -Dspring.config.location=./application-p2.yml euk-ser.jar
java -jar -Dspring.config.location=./app1.yml euk-ser.jar >logs/log1.log &
java -jar -Dspring.config.location=./app2.yml euk-ser.jar >logs/log2.log &
java -jar -Dspring.config.location=./app3.yml euk-ser.jar >logs/log3.log &
