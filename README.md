# deep
**Java Dependencies Analysis**

This software reads the byte code of a JAR file and calculates a degree of dependency between another JAR.

### version
1.01

### download
The latest compiled version can be downloaded from [here].

### how to use
```sh
java -jar deep.jar
```
1. Run it from the command line.
**The first time it is executed it will create a deep.ini (in the same path as the deep.jar) to setup the paths to jars.**
2. Edit the deep.ini with the paths to the jar of the source project [source] and the library [library]. The namespace is the threshold from were it search the class to be matched into the source project (e.g. org.apache.commons.logging).

### analysis
1. The first step of the analysis is to identify the public classes (including abstracts and interfaces) and members (fields and methods) of the library.
2. Then it search for references to classes of the library jar in the source jar and display a Quick Survey Result.
3. The thirt step is to build Deep Survey displaying a **_hierarchical tree visualization_** in a dependency tree.
4. Finally it calculates a Dependency Ratio and outputs the results.

### calculations
The partial results are this proportions:
* total of public *class files* available at librery JAR / total of *referenced class files* by the source JAR
* total of public *concrete* classes available / total of referenced *concrete* classes (A)
* total of public *abstract* classes available / total of referenced *abstract* classes (B)
* total of public *interfaces* available / total of referenced *interfaces* (C)
* total of public *members* available / total of referenced *members* (D)

###### The Dependency Ratio is: `( A + B + C + D ) / 4`

### screens
Screens of [**hibernate-core-4.3.10.Final.jar** -> **dom4j-1.6.1.jar**] analysis

Library profile:

![alt text](https://dl.dropboxusercontent.com/u/13410677/deep/img/lib-profile-scr.jpg "Library profile")

Hierarchical tree visualization:

![alt text](https://dl.dropboxusercontent.com/u/13410677/deep/img/tree-scr.jpg "Tree view")

Tree summary:

![alt text](https://dl.dropboxusercontent.com/u/13410677/deep/img/tree-sum-scr.jpg "Tree summary")

Dependency ratio:

![alt text](https://dl.dropboxusercontent.com/u/13410677/deep/img/dep-ratio-scr.jpg "Dependency ratio")

### technology
* Apache BCEL 5.2
* Apache Commons Collections 4.4
* ANTLR 4.5
* Procyon decompiler 0.5.29
* ini4j 0.5.4

### author
Martín Agüero is professor at [Universidad de Palermo] located in Buenos Aires, Argentina

### contact
Questions, errors and suggestions are welcome at `aguero.martin@gmail.com`

[here]:http://bit.ly/deep-jar
[Universidad de Palermo]: http://www.palermo.edu
