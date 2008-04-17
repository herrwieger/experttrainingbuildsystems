@echo off
REM -----------------------------------------------
REM Customization necessary
REM -----------------------------------------------

set JAVA_HOME=C:\Apps\Java\jdk1.6.0



REM -----------------------------------------------
REM Derived properties. NO customization necessary
REM -----------------------------------------------

set M2_HOME=%~dp0seu\maven\apache-maven-2.0.9
set M2=%M2_HOME%\bin
set PATH=%M2%;%PATH%;%JAVA_HOME%\bin
set MAVEN_OPTS="-Xmx512m"
