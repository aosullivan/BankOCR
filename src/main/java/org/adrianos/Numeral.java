package org.adrianos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Encapsulates a 3x3 array of numeral data as a simple value object
 *
 */
public class Numeral {

	private String asString = "?";
	
    private Map<NumeralData, String> toStringMap = new HashMap<>();

    public Numeral(String[] inputArray) {

        // Initialize mappings from numerals 0 - 9 to string values
        toStringMap.put(NumeralData.ZERO, "0");
        toStringMap.put(NumeralData.ONE, "1");
        toStringMap.put(NumeralData.TWO, "2");
        toStringMap.put(NumeralData.THREE, "3");
        toStringMap.put(NumeralData.FOUR, "4");
        toStringMap.put(NumeralData.FIVE, "5");
        toStringMap.put(NumeralData.SIX, "6");
        toStringMap.put(NumeralData.SEVEN, "7");
        toStringMap.put(NumeralData.EIGHT, "8");
        toStringMap.put(NumeralData.NINE, "9");

        // Search for numeral 0 - 9 matching input data
        for (NumeralData numeral : NumeralData.values()) {
            if (Arrays.equals(inputArray, numeral.asStringArray()))
            	asString = toStringMap.get(numeral);
        }
    }
    
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result
	            + ((asString == null) ? 0 : asString.hashCode());
	    return result;
    }

	@Override
    public boolean equals(Object obj) {
	    if (this == obj)
		    return true;
	    if (obj == null)
		    return false;
	    if (getClass() != obj.getClass())
		    return false;
	    Numeral other = (Numeral) obj;
	    if (asString == null) {
		    if (other.asString != null)
			    return false;
	    } else if (!asString.equals(other.asString))
		    return false;
	    return true;
    }

	@Override
    public String toString() {
        return asString;
    }

}
