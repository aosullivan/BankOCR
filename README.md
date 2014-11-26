BankOCR
=======

Text file parser for Pipe and Underscore representations of numerals. 

Numerals 0 - 9 are accepted in the following format:

<pre>
  _    _  _     _  _  _  _  _ <br>
 | | | _| _||_||_ |_   ||_||_|<br>
 |_| ||_  _|  | _||_|  ||_| _|<br>
                          <br>
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


## Build and Installation Instructions

### To build:

Ensure Java 8 JDK is installed and that your JAVA_HOME is set to this, and the JDK's bin folder is on your system path.

Clone the github repository

Open a command prompt under the top level project folder, and execute

> gradlew installApp

### To install:

Copy \build\install\Outpace-BankOCR and all of its contents from the project folder to a location where you wish to run it 

Add the Outpace-BankOCR\bin folder to your system PATH

### To run

At a command prompt, enter:

> Outpace-BankOCR &lt;input filename&gt;

The application will execute and write the output to the current folder, under a unique filename.
