JFLAGS = -g
JCC = javac

.SUFFIXES: .java .class

.java.class :
	$(JCC) $(JFLAGS) $*.java

CLASSES = \
	Bit.java

default : classes run

classes : $(CLASSES:.java=.class)

clean:
	$(RM) *.class

run: 
	java Bit < input.txt
