package org.adrianos;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankOCRTest {

    BankOCR parser = new BankOCR("data.txt");

    @Test
    public void fiveRowTest() {
        String[] output = parser.parse();
        assertArrayEquals(expected, output);
    }

    @Test
    public void fiveHundredRowTest() {
        for (int i = 0; i < 100; i++) {
            parser.parse();
        }
    }

    private final String[] expected = { "000000000", "010000000", "957686868", "002000000", "100000000" };

}
