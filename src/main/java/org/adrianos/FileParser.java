package org.adrianos;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

/**
 * Loads a file of numeral data to be parsed into text 
 */
public class FileParser {
	
	private String[] linesArray;

	/**
	 * Load data from a file into a String array
	 * 
	 * @param filename on classpath
	 */
	public FileParser (String filename) {
		List<String> linesList;
		
		try {
			URL url = Resources.getResource("data.txt");
			linesList = Resources.readLines(url, Charsets.UTF_8);
        } catch (IOException e) {
	        throw new RuntimeException(e);
        }
		
		this.linesArray = new String[linesList.size()];
		linesList.toArray(this.linesArray);
    }

	/**
	 * Parses data from the loaded file in batches of 4 rows
	 * 
	 * @return array of strings corresponding to parsed data 
	 */
	public String[] parse() {
		List<String> resultsList = new ArrayList<>(); 
		
		for (int i = 0; i < linesArray.length; i += 4) {
			
			String[] numeralLineData = new String[4];
			numeralLineData[0] = linesArray[i];
			numeralLineData[1] = linesArray[i+1];
			numeralLineData[2] = linesArray[i+2];
			EntryParser entryParser = new EntryParser(numeralLineData);
			resultsList.add(entryParser.parse());
		}
		
		String[] resultsArray = new String[resultsList.size()];
		return resultsList.toArray(resultsArray);
	}
	

}
