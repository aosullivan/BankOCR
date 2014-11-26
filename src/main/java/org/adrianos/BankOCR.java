package org.adrianos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.io.Files;

/**
 * Loads a file of numeral data to be parsed into text
 */
/**
 * @author java
 *
 */
public class BankOCR {

    private String[] linesArray;

    /**
     * Load data from a file into a String array
     * 
     * @param filename on classpath
     */
    public BankOCR(String filename) {
        List<String> linesList = load(filename);
        this.linesArray = new String[linesList.size()];
        linesList.toArray(this.linesArray);
    }

    private List<String> load(String filename) {
        try {
            return Files.readLines(new File(filename), Charsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Parses data from the loaded file in batches of 4 rows
     * 
     * @return array of strings corresponding to parsed data
     */
    public String[] parse() {
        List<String> resultsList = new ArrayList<>();

        for (int i = 0; i < linesArray.length; i += 4) {

            String[] entryArray = new String[4];
            entryArray[0] = linesArray[i];
            entryArray[1] = linesArray[i + 1];
            entryArray[2] = linesArray[i + 2];
            NumeralEntryParser entryParser = new NumeralEntryParser(entryArray); //tight coupling, I'd refactor this if there were more than one parsing strategy
            resultsList.add(entryParser.parse().print());
        }

        String[] resultsArray = new String[resultsList.size()];
        return resultsList.toArray(resultsArray);
    }

    /**
     * Main loop: validate input args and terminate or continue
     */
    public static void main(String... args) {
        if (null == args || args.length == 0 || Strings.isNullOrEmpty(args[0])){
            System.out.println("Please pass in the inputfile filename.");
        } else {
            run(args[0]);
        }
    }

    
    /**
     * Parse input file and write output to file
     */
    private static void run(String filename) {
        String[] output = new BankOCR(filename).parse();
        String out = Joiner.on("\r\n").join(Arrays.asList(output));
        try {
            File outFile = File.createTempFile(BankOCR.class.getName(), ".txt", new File(System.getProperty("user.dir")));
            Files.write(out.getBytes(), outFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
