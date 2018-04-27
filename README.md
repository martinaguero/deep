# deep
**Java Dependencies Analysis**

This software reads the byte code of a JAR file and calculates a degree of dependency between another JAR. 
It is a measure that can be used as a guide to determine a level level of coupling between two JAR files.

### version
1.01 (July 17 2015)

### web app
http://trimatek.org/deep

### how to use from command line
```sh
java -jar deep.jar
```
1. Run it from the command line.
**The first time it is executed it will create a deep.ini (in the same path as the deep.jar) to setup the paths to jars.**
2. Edit the deep.ini with the paths to the jar of the source project [source] and the library [library]. The namespace is the threshold from were it search the class to be matched into the source project (e.g. org.apache.commons.logging).

### analysis
1. The first step of the analysis is to identify the public classes (including abstracts and interfaces) and members (fields and methods) of the library.
2. Then it searches for references to classes of the library jar in the source jar and displays a Quick Survey Result.
3. The thirt step is to build Deep Survey displaying a **_hierarchical tree visualization_** in a dependency tree.
4. Finally it calculates a Dependency Ratio and outputs the results.

### calculations
The partial results are this proportions:
* total of *referenced class files* by the source JAR / total of public *class files* available at library JAR
* total of referenced *concrete* classes / total of public *concrete* classes available (A)
* total of referenced *abstract* classes / total of public *abstract* classes available (B)
* total of referenced *interfaces* / total of public *interfaces* available (C)
* total of referenced *members* / total of public *members* available (D)

##### The Dependency Ratio(*) is: `( A + B + C + D ) / 4`
###### (*) based on [this] work by Robert Martin

### technology
* Apache BCEL 5.2
* Apache Commons Collections 4.4
* ANTLR 4.5
* Procyon decompiler 0.5.29
* ini4j 0.5.4

### contact
Questions, issues or suggestions are welcome at `aguero.martin@gmail.com`

[here]:http://bit.ly/deep-jar
[Universidad Tecnológica Nacional]: http://www.utn.edu.ar/
[this]:http://www.objectmentor.com/resources/articles/oodmetrc.pdf
[MartÃ­n AgÃ¼ero]:https://ar.linkedin.com/in/martinaguero
