package org.adrianos;

/**
 * Parses 3 lines of data with formats specified by {@link NumeralData}
 * 
 */
public class NumeralEntryParser {

    private String[] numeralData;

    /**
     * @param numeralData
     *            Pass in three lines of numeral data to be parsed
     */
    public NumeralEntryParser(String[] numeralData) {
        this.numeralData = numeralData;
    }

    /**
     * Parse the nine numerals in the three rows of data
     * 
     * @return
     */
    public String parse() {

        StringBuilder response = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            response.append(charAt(i * 3));
        }
        return response.toString();
    }

    /**
     * @param i
     *            index of the horizontal start position of the numeral within
     *            the string
     * @return char correponding to the numeral at the index
     */
    protected char charAt(int i) {

        String[] singleNumeralData = new String[3];
        singleNumeralData[0] = threeCharsFrom(numeralData[0], i);
        singleNumeralData[1] = threeCharsFrom(numeralData[1], i);
        singleNumeralData[2] = threeCharsFrom(numeralData[2], i);

        return new Numeral(singleNumeralData).toString().charAt(0);
    }

    private String threeCharsFrom(String str, int i) {
        return str.substring(i, i + 3);
    }

}
