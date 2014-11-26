package org.adrianos;

/**
 * Encodes raw data for representing numerals 1 - 9 
 * as pipes and underscores
 *
 */
public enum PipeNumeral {

	ZERO (" _ ", 
	      "| |", 
	      "|_|"),
	ONE ("   ", 
	     "  |", 
		 "  |"),
	TWO (" _ ", 
	     " _|", 
	     "|_ "),
	THREE (" _ ", 
	       " _|", 
	       " _|"),
	FOUR ("   ", 
	      "|_|", 
		  "  |"),
	FIVE (" _ ", 
	      "|_ ", 
		  " _|"),
	SIX (" _ ", 
	     "|_ ", 
	     "|_|"),
	SEVEN (" _ ", 
	       "  |", 
	       "  |"),
	EIGHT (" _ ", 
	       "|_|", 
	       "|_|"),
	NINE (" _ ", 
	      "|_|", 
	      " _|");
	
	private String[] data;
	
	PipeNumeral(String... data) {
		this.data = data;
	}

	public String[] data(){
		return data;
	}

}
