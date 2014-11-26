package org.adrianos;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankOCRTest {

    private static final String DATA_TXT = "src\\test\\resources\\data.txt";

    @Test
    public void main() {
        BankOCR.main(DATA_TXT);
    }
    
    @Test
    public void fiveRowTest() {
        BankOCR parser = new BankOCR(DATA_TXT);
        String[] output = parser.parse();
        assertArrayEquals(expected, output);
    }

    @Test
    public void fiveHundredRowTest() {
        BankOCR parser = new BankOCR(DATA_TXT);
        for (int i = 0; i < 100; i++) {
            parser.parse();
        }
    }

    private final String[] expected = { "000000000", "010000000 ERR", "957686868 ERR", "002000000 ERR", "100000000 ERR" };

}
