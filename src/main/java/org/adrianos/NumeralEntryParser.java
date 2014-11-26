package org.adrianos;

/**
 * Parses 3 lines of data with formats specified by {@link NumeralData}
 * 
 */
public class NumeralEntryParser {

    private String[] numeralData;

    /**
     * @param numeralData three lines of numeral data to be parsed
     */
    public NumeralEntryParser(String[] numeralData) {
        this.numeralData = numeralData;
    }

    /**
     * @return parse the arraydata to return the account number
     */
    public AccountNumber parse() {

        StringBuilder response = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            response.append(charAt(i * 3));
        }
        return new AccountNumber(response.toString());
    }

    /**
     * @param startPos  start position of the numeral within the string
     * @return char representing the numeral at index i
     */
    protected char charAt(int startPos) {

        String[] numeralArray = new String[3];
        numeralArray[0] = threeCharsFrom(numeralData[0], startPos);
        numeralArray[1] = threeCharsFrom(numeralData[1], startPos);
        numeralArray[2] = threeCharsFrom(numeralData[2], startPos);

        return new Numeral(numeralArray).toString().charAt(0);
    }

    private String threeCharsFrom(String str, int i) {
        return str.substring(i, i + 3);
    }

}
