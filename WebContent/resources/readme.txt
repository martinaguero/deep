DEEP v1.01 (beta)
Java Dependencies Analysis

This software reads the byte code of a JAR file and calculates a degree of 
dependency between another JAR. It is a measure that can be used as a guide
to determine a level level of coupling between two JAR files.

Analysis
1. The first step of the analysis is to identify the public classes (including 
abstracts and interfaces) and members (fields and methods) of the library.
2. Then it searches for references to classes of the library jar in the source 
jar and displays a Quick Survey Result.
3. The thirt step is to build Deep Survey displaying a **_hierarchical tree 
visualization_** in a dependency tree.
4. Finally it calculates a Dependency Ratio and outputs the results.

Calculations
The partial results are this proportions:
* total of *referenced class files* by the source JAR / 
	total of public *class files* available at library JAR
* total of referenced *concrete* classes / total of public *concrete*
	classes available (A)
* total of referenced *abstract* classes / total of public *abstract* 
	classes available (B)
* total of referenced *interfaces* / total of public *interfaces* available (C)
* total of referenced *members* / total of public *members* available (D)

The Dependency Ratio(*) is: ( A + B + C + D ) / 4
(*) based this work by Robert Martin: 
http://www.objectmentor.com/resources/articles/oodmetrc.pdf

Technology
* Apache BCEL 5.2
* Apache Commons Collections 4.4
* ANTLR 4.5
* Procyon decompiler 0.5.29
* ini4j 0.5.4
* Prime Faces 5.2

Author
Martín Agüero is professor at Universidad de Palermo located in 
Buenos Aires, Argentina

Contact
Questions, issues or suggestions are welcome at aguero.martin@gmail.com

Source code
https://github.com/martinaguero/deep