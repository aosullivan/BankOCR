package org.adrianos;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * Encapsulates a 3x3 array of numeral data as a simple value object
 *
 */
public class Character {
	
	private PipeNumeral array;

	private Map<PipeNumeral, String> toStringMap = new HashMap<>();

	public Character(String[] array) {
		
		//Initialize mappings from numerals 0 - 9 to string values
		toStringMap.put(PipeNumeral.ZERO, "0");
		toStringMap.put(PipeNumeral.ONE,  "1");
		toStringMap.put(PipeNumeral.TWO,  "2");
		toStringMap.put(PipeNumeral.THREE,"3");
		toStringMap.put(PipeNumeral.FOUR, "4");
		toStringMap.put(PipeNumeral.FIVE, "5");
		toStringMap.put(PipeNumeral.SIX,  "6");
		toStringMap.put(PipeNumeral.SEVEN,"7");
		toStringMap.put(PipeNumeral.EIGHT,"8");
		toStringMap.put(PipeNumeral.NINE, "9");
		
		//Search for numeral 0 - 9 matching input data
		for (PipeNumeral numeral : PipeNumeral.values()){
			if (Arrays.equals(array, numeral.data()))
				this.array = numeral;
		}
	}

	@Override
	public String toString(){
		return toStringMap.get(array);
	}

	@Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((array == null) ? 0 : array.hashCode());
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
	    Character other = (Character) obj;
	    if (array != other.array)
		    return false;
	    return true;
    }

}
