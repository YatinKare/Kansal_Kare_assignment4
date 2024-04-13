#! /bin/bash -ex
javac -d bin src/sort/Sorting.java
javac -d bin -cp bin src/sort/SortingDriver2.java
java -cp bin sort.SortingDriver2 
