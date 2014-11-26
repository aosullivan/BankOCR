package org.adrianos;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CharacterTest {
	
	@Test
	public void valueObject(){
		
		Character zero = new Character(PipeNumeral.ZERO.data());
		Character one = new Character(PipeNumeral.ONE.data());
		Character otherOne = new Character(PipeNumeral.ONE.data());
		
		assertEquals("Same numeric values are equal", one, otherOne);
		assertNotEquals("Different numeric values are unequal", one, zero);
		assertEquals("Same numeric values have same hashcode", one.hashCode(), otherOne.hashCode());
		
	}

	@Test
	public void stringValues(){
		assertEquals("0", new Character(PipeNumeral.ZERO.data()).toString());
		assertEquals("1", new Character(PipeNumeral.ONE.data()).toString());
		assertEquals("2", new Character(PipeNumeral.TWO.data()).toString());
		assertEquals("3", new Character(PipeNumeral.THREE.data()).toString());
		assertEquals("4", new Character(PipeNumeral.FOUR.data()).toString());
		assertEquals("5", new Character(PipeNumeral.FIVE.data()).toString());
		assertEquals("6", new Character(PipeNumeral.SIX.data()).toString());
		assertEquals("7", new Character(PipeNumeral.SEVEN.data()).toString());
		assertEquals("8", new Character(PipeNumeral.EIGHT.data()).toString());
		assertEquals("9", new Character(PipeNumeral.NINE.data()).toString());
	}

}
