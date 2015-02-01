JAVAC=javac
sources = $(wildcard *.java)
classes = $(sources:.java=.class)
testclass = KomplexTest
junit = -cp /usr/share/java/junit4.jar:
junitcore = org.junit.runner.JUnitCore

all: 
	$(classes)

clean:
	rm -f *.class

compileTest:
	$(JAVAC) $(junit) $(sources)

runTest:
	java $(junit) $(junitcore) $(testclass)

%.class : %.java
	$(JAVAC) $<
