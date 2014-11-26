package org.adrianos;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EntryParserTest {
	
	@Test
	public void allZeroes(){
		EntryParser parser = new EntryParser(char000000000.split("\n"));
		assertEquals("000000000", parser.parse());
	}
	
	@Test
	public void leadingOne(){
		EntryParser parser = new EntryParser(char100000000.split("\n"));
		assertEquals("100000000", parser.parse());
	}
	
	@Test
	public void allFives(){
		EntryParser parser = new EntryParser(char957686868.split("\n"));
		assertEquals("957686868", parser.parse());
	}
	
	@Test
	public void leadingCharIsZero(){
		EntryParser parser = new EntryParser(char000000000.split("\n"));
		assertEquals('0', parser.charAt(0));
	}
	
	@Test
	public void leadingCharIsOne(){
		EntryParser parser = new EntryParser(char100000000.split("\n"));
		assertEquals('1', parser.charAt(0));
	}
	
	@Test
	public void secondCharIsOne(){
		EntryParser parser = new EntryParser(char010000000.split("\n"));
		assertEquals('1', parser.charAt(3));
	}
	
	@Test
	public void thirdCharIsTwo(){
		EntryParser parser = new EntryParser(char002000000.split("\n"));
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
