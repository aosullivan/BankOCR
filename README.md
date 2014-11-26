BankOCR
=======

Text file parser for Pipe and Underscore representations of numerals. 

Numerals 0 - 9 are accepted in the following format:

<pre>
  _    _  _     _  _  _  _  _ <br/>
 | | | _| _||_||_ |_   ||_||_|<br/>
 |_| ||_  _|  | _||_|  ||_| _|<br/>
                          <br/>
</pre>
Each entry in the input file should be 4 lines long, and each line should have 27 characters. The first 3 lines of each entry contain an account number written in the above format, and the fourth line is blank.

Each account number should have 9 digits, all of which should be in the range 0-9. 

e.g.
 
<pre>
 _  _  _  _  _  _  _  _  _ <br/>
|_||_   ||_ |_||_ |_||_ |_|<br/>
 _| _|  ||_||_||_||_||_||_|<br/>
                           <br/>
</pre>
will resolve to "957686868"


Build Instructions
------------------

Ensure Java 8 JDK is installed and your JAVA_HOME system variable is set to this.

Then, from the root of the project director:

To run:

> gradlew run <input filename>  <br/>

