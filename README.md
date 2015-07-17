# deep
dependencies analysis

This software reads the byte code of a JAR file and calculates a degree of dependency between another JAR.

### version
1.01

### download
The latest versión can be downloaded from [here].

### how to use
1. Compile it or download the JAR and run it from the command line:
```sh
java -jar deep.jar
```
_The first time it is executed it will create a deep.ini (in the same path as the deep.jar) to setup the paths to jars._

2. Edit the deep.ini with the paths to the jar of the project [source] and the library [library]. The namespace is the 
threshold from were it search the class to be matched into the source project (e.g. org.apache.commons.logging).


[here]:http://bit.ly/deep-jar
