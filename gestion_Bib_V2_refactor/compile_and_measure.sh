#!/bin/sh
# Placer ckjm-1.8.jar dans ce dossier. Necessite un JDK (javac) ; le bytecode est genere en Java 8 pour CKJM.
mkdir -p bin
javac -source 1.8 -target 1.8 -d bin src/library/app/*.java src/library/model/*.java src/library/service/*.java src/library/util/*.java
java -cp bin library.app.LibraryApp
java -cp "bin:ckjm-1.8.jar" -jar ckjm-1.8.jar $(find bin -name '*.class') > metrics.txt
cat metrics.txt
