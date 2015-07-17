# deep
dependencies analysis

This software reads the byte code of a JAR file and calculates a degree of dependency between another JAR.

### version
1.01

### download
The latest versión can be downloaded from [here].

### how to use
```sh
java -jar deep.jar
```
1. Run it from the command line.
**The first time it is executed it will create a deep.ini (in the same path as the deep.jar) to setup the paths to jars.**
2. Edit the deep.ini with the paths to the jar of the source project [source] and the library [library]. The namespace is the threshold from were it search the class to be matched into the source project (e.g. org.apache.commons.logging).

### analysis
1. The first stage of the analysis is to survey the public classes (including abstracts and interfaces) and members (fields and methods) of the library.
2. Then it 

[here]:http://bit.ly/deep-jar
