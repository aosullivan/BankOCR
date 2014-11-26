BankOCR
=======

Text file parser for Pipe and Underscore representations of numerals. 

Numerals are accepted in the following format:

 >   _  _     _  _  _  _  _  
 > | _| _||_||_ |_   ||_||_|  
 > ||_  _|  | _||_|  ||_| _|   
                           
Each entry in the input file should be 4 lines long, and each line should have 27 characters. The first 3 lines of each entry contain an account number written using pipes and underscores, and the fourth line is blank.

Each account number should have 9 digits, all of which should be in the range 0-9. A normal file contains around 500 entries.

e.g.

> _  _  _  _  _  _  _  _  _ 
>|_||_   ||_ |_||_ |_||_ |_|
> _| _|  ||_||_||_||_||_||_|

will resolve to "957686868"


Build Instructions
------------------

Ensure Java 8 JDK is installed and your JAVA_HOME system variable is set to this.
Then, from the root of the project director, run:

> gradlew build
> gradlew run <filename>
