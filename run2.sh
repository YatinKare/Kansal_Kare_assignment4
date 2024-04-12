#! /bin/bash -ex
javac -d bin src/sort/Sorting.java
javac -d bin -cp bin src/sort/SortingDriver.java
javac -d bin -cp bin src/sort/SortingDriver.java
java -cp bin sort.SortingDriver $1
