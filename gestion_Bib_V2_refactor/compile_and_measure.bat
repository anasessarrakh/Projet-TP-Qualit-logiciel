@echo off
REM Placer ckjm-1.8.jar dans ce dossier (https://www.spinellis.gr/sw/ckjm/)
if not exist bin mkdir bin
javac -source 1.8 -target 1.8 -d bin src\library\app\*.java src\library\model\*.java src\library\service\*.java src\library\util\*.java
java -cp bin library.app.LibraryApp
java -cp bin;ckjm-1.8.jar -jar ckjm-1.8.jar bin\library\app\LibraryApp.class bin\library\model\AbstractLendable.class bin\library\model\Book.class bin\library\model\DigitalBook.class bin\library\model\Lendable.class bin\library\service\Customer.class bin\library\service\Library.class bin\library\util\NumberClassifier.class > metrics.txt
type metrics.txt
