CLASSNAME = print_numbers

all: $(CLASSNAME).class

%.class: %.java
  javac $<

# run programm
run: $(CLASSNAME).class
  java $(CLASSNAME)

# remove all .class files
clean:
  rm -f *.class
