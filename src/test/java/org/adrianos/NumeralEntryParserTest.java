package org.adrianos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumeralEntryParserTest {

    @Test
    public void allZeroes() {
        NumeralEntryParser parser = new NumeralEntryParser(char000000000.split("\n"));
        assertEquals("000000000", parser.parse().toString());
    }

    @Test
    public void leadingOne() {
        NumeralEntryParser parser = new NumeralEntryParser(char100000000.split("\n"));
        assertEquals("100000000", parser.parse().toString());
    }

    @Test
    public void allFives() {
        NumeralEntryParser parser = new NumeralEntryParser(char957686868.split("\n"));
        assertEquals("957686868", parser.parse().toString());
    }

    @Test
    public void invalidNumbersReportERR() {
        NumeralEntryParser parser = new NumeralEntryParser(char888888888.split("\n"));
        assertEquals("888888888 ERR", parser.parse().print());
    }

    @Test
    public void illegibleNumbersReportILL() {
        NumeralEntryParser parser = new NumeralEntryParser(char88888ii88.split("\n"));
        assertEquals("88888??88 ILL", parser.parse().print());
    }

    @Test
    public void thirdCharIsTwo() {
        NumeralEntryParser parser = new NumeralEntryParser(char002000000.split("\n"));
        assertEquals('2', parser.charAt(6));
    }

    String char000000000 = 
                    " _  _  _  _  _  _  _  _  _ \n" +
                    "| || || || || || || || || |\n" +
                    "|_||_||_||_||_||_||_||_||_|\n" +
                    "                           \n";
    
    String char100000000 =
                    "    _  _  _  _  _  _  _  _ \n" +
                    "  || || || || || || || || |\n" +
                    "  ||_||_||_||_||_||_||_||_|\n" +
                    "                           \n";
    
    String char010000000 =
                    " _     _  _  _  _  _  _  _ \n" +
                    "| |  || || || || || || || |\n" +
                    "|_|  ||_||_||_||_||_||_||_|\n" +
                    "                           \n";    
    
    String char002000000 =
                    " _  _  _  _  _  _  _  _  _ \n" +
                    "| || | _|| || || || || || |\n" +
                    "|_||_||_ |_||_||_||_||_||_|\n" +
                    "                           \n";    
    
    String char957686868 =
                    " _  _  _  _  _  _  _  _  _ \n" +
                    "|_||_   ||_ |_||_ |_||_ |_|\n" +
                    " _| _|  ||_||_||_||_||_||_|\n" +
                    "                           \n";    
    
    String char888888888 = 
                   " _  _  _  _  _  _  _  _  _ \n" +
                   "|_||_||_||_||_||_||_||_||_|\n" +
                   "|_||_||_||_||_||_||_||_||_|\n" +
                   "                           \n";
    
    String char88888ii88 = 
                   " _  _  _  _  _  _  _  _  _ \n" +
                   "|_||_||_||_||_||_| _||_||_|\n" +
                   "|_||_||_||_||_||_ |_||_||_|\n" +
                   "                           \n";        
}
