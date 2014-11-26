package org.adrianos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class NumeralTest {

    @Test
    public void valueObject() {

        Numeral zero = new Numeral(NumeralData.ZERO.asStringArray());
        Numeral one = new Numeral(NumeralData.ONE.asStringArray());
        Numeral otherOne = new Numeral(NumeralData.ONE.asStringArray());

        assertEquals("Same numeric values are equal", one, otherOne);
        assertNotEquals("Different numeric values are unequal", one, zero);
        assertEquals("Same numeric values have same hashcode", one.hashCode(), otherOne.hashCode());

    }

    @Test
    public void stringValues() {
        assertEquals("0", new Numeral(NumeralData.ZERO.asStringArray()).toString());
        assertEquals("1", new Numeral(NumeralData.ONE.asStringArray()).toString());
        assertEquals("2", new Numeral(NumeralData.TWO.asStringArray()).toString());
        assertEquals("3", new Numeral(NumeralData.THREE.asStringArray()).toString());
        assertEquals("4", new Numeral(NumeralData.FOUR.asStringArray()).toString());
        assertEquals("5", new Numeral(NumeralData.FIVE.asStringArray()).toString());
        assertEquals("6", new Numeral(NumeralData.SIX.asStringArray()).toString());
        assertEquals("7", new Numeral(NumeralData.SEVEN.asStringArray()).toString());
        assertEquals("8", new Numeral(NumeralData.EIGHT.asStringArray()).toString());
        assertEquals("9", new Numeral(NumeralData.NINE.asStringArray()).toString());
    }

}
