# deep
Java Dependencies Analysis

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


[here]:http://bit.ly/deep-jar
