package org.adrianos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumeralEntryParserTest {

    @Test
    public void allZeroes() {
        NumeralEntryParser parser = new NumeralEntryParser(char000000000.split("\n"));
        assertEquals("000000000", parser.parse());
    }

    @Test
    public void leadingOne() {
        NumeralEntryParser parser = new NumeralEntryParser(char100000000.split("\n"));
        assertEquals("100000000", parser.parse());
    }

    @Test
    public void allFives() {
        NumeralEntryParser parser = new NumeralEntryParser(char957686868.split("\n"));
        assertEquals("957686868", parser.parse());
    }

    @Test
    public void leadingCharIsZero() {
        NumeralEntryParser parser = new NumeralEntryParser(char000000000.split("\n"));
        assertEquals('0', parser.charAt(0));
    }

    @Test
    public void leadingCharIsOne() {
        NumeralEntryParser parser = new NumeralEntryParser(char100000000.split("\n"));
        assertEquals('1', parser.charAt(0));
    }

    @Test
    public void secondCharIsOne() {
        NumeralEntryParser parser = new NumeralEntryParser(char010000000.split("\n"));
        assertEquals('1', parser.charAt(3));
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
}
