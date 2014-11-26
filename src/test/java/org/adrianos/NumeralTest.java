package org.adrianos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class NumeralTest {

    @Test
    public void valueObject() {

        Numeral zero = new Numeral(NumeralData.ZERO.data());
        Numeral one = new Numeral(NumeralData.ONE.data());
        Numeral otherOne = new Numeral(NumeralData.ONE.data());

        assertEquals("Same numeric values are equal", one, otherOne);
        assertNotEquals("Different numeric values are unequal", one, zero);
        assertEquals("Same numeric values have same hashcode", one.hashCode(), otherOne.hashCode());

    }

    @Test
    public void stringValues() {
        assertEquals("0", new Numeral(NumeralData.ZERO.data()).toString());
        assertEquals("1", new Numeral(NumeralData.ONE.data()).toString());
        assertEquals("2", new Numeral(NumeralData.TWO.data()).toString());
        assertEquals("3", new Numeral(NumeralData.THREE.data()).toString());
        assertEquals("4", new Numeral(NumeralData.FOUR.data()).toString());
        assertEquals("5", new Numeral(NumeralData.FIVE.data()).toString());
        assertEquals("6", new Numeral(NumeralData.SIX.data()).toString());
        assertEquals("7", new Numeral(NumeralData.SEVEN.data()).toString());
        assertEquals("8", new Numeral(NumeralData.EIGHT.data()).toString());
        assertEquals("9", new Numeral(NumeralData.NINE.data()).toString());
    }

}
