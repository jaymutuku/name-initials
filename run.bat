ECHO OFF

SET CLASSPATH=SVN_LOCAL\lib\static\junit\junit-4.12.jar;SVN_LOCAL\lib\static\junit\hamcrest-core-1.3.jar

SET BUILD_CLASS_DIR_IMPLEMENTATION=BUILD_LOCAL\implementation\build\classes

SET BUILD_CLASS_DIR_JUNIT=BUILD_LOCAL\junit\build\classes

SET RUN_CLASSPATH=%BUILD_CLASS_DIR_JUNIT%;%BUILD_CLASS_DIR_IMPLEMENTATION%;%CLASSPATH%

SET CLASS_TO_RUN=name.nameinitials.InitialsTestCase

ECHO CLASSPATH=%CLASSPATH%
ECHO BUILD_CLASS_DIR_IMPLEMENTATION=%BUILD_CLASS_DIR_IMPLEMENTATION%
ECHO BUILD_CLASS_DIR_JUNIT=%BUILD_CLASS_DIR_JUNIT%
ECHO RUN_CLASSPATH=%RUN_CLASSPATH%
ECHO CLASS_TO_RUN=%CLASS_TO_RUN%

java  -classpath %RUN_CLASSPATH% org.junit.runner.JUnitCore %CLASS_TO_RUN%

PAUSE