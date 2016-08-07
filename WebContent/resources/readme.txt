DEEP v1.2 (beta)
Java Dependencies Analysis

This software reads the byte code of a JAR file and calculates a degree of 
dependency between another JAR. It is a measure that can be used as a guide
to determine a level of coupling between two JAR files.

ANALYSIS
1. The first step of the analysis is to identify the public classes (including 
abstracts and interfaces) and members (fields and methods) of the library.
2. Then it searches for references to classes of the library jar in the source 
jar and displays a Quick Survey Result.
3. The third step is to build Deep Survey displaying a hierarchical tree 
visualization in a dependency tree.
4. Finally it calculates a Dependency Ratio and outputs the results.

CALCULATIONS
S: source JAR
T: target JAR
Rc: Concrete classes referenced in S
Tc: Total of concrete public classes available in T
Ra: Abstract classes referenced in S
Ta: Total of abstract public classes available in T
Ri: Interfaces referenced in S
Ti: Total of interfaces classes available in T
Rm: Members referenced in S
Tm: Total of members available in T

The Dependency Ratio(*) is: (Rc/Tc+Ra/Ta+Ri/Ti+Rm/Tm)/(quotients>0)
(*) based on the work by Robert Martin: 
http://www.objectmentor.com/resources/articles/oodmetrc.pdf
and Wang et al.:
https://ece.uwaterloo.ca/~lintan/publications/dep-mtd13.pdf

TECHNOLOGY
* Apache BCEL 5.2
* Apache Commons Collections 4.4
* Apache Log4J 1.2.14
* ANTLR 4.5
* Procyon decompiler 0.5.29
* ini4j 0.5.4
* PrimeFaces 5.2

SOURCE CODE
https://github.com/martinaguero/deep

MORE INFO (PAPER IN SPANISH)
http://conaiisi2015.utn.edu.ar/memorias/Ingenieria/118-597-1-DR.pdf

AUTHOR
Martín Agüero - aguero.martin@gmail.com