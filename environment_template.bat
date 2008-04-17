@echo off
REM -----------------------------------------------
REM Customization necessary
REM -----------------------------------------------

set JAVA_HOME=C:\Apps\Java\jdk1.6.0



REM -----------------------------------------------
REM Derived properties. NO customization necessary
REM -----------------------------------------------

set PATH=%PATH%;%~dp0\seu\maven\maven-2.0.9\bin;%JAVA_HOME%\bin
set MAVEN_OPTS="-Xmx512m"
