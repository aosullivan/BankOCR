package org.adrianos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountNumberTest {

    @Test
    public void checksum() {

        AccountNumber sample = new AccountNumber("123456789");
        int expected = (1 * 9) + (2 * 8) + (3 * 7) + (4 * 6) + (5 * 5) + (6 * 4) + (7 * 3) + (8 * 2) + (9 * 1);
        assertEquals(expected, sample.checkSum());
    }

    @Test
    public void isValid() {

        AccountNumber valid1 = new AccountNumber("711111111");
        AccountNumber valid2 = new AccountNumber("123456789");
        AccountNumber valid3 = new AccountNumber("490867715");

        assertTrue(valid1.isValid());
        assertTrue(valid2.isValid());
        assertTrue(valid3.isValid());
    }

    @Test
    public void isInvalid() {

        AccountNumber invalid1 = new AccountNumber("888888888");
        AccountNumber invalid2 = new AccountNumber("490067715");
        AccountNumber invalid3 = new AccountNumber("012345678");

        assertFalse(invalid1.isValid());
        assertFalse(invalid2.isValid());
        assertFalse(invalid3.isValid());
    }

    @Test
    public void valueObject() {

        AccountNumber eq1 = new AccountNumber("711111111");
        AccountNumber eq2 = new AccountNumber("711111111");
        AccountNumber notEq = new AccountNumber("711111112");

        assertEquals("Same numeric values are equal", eq1, eq2);
        assertNotEquals("Different numeric values are unequal", eq1, notEq);
        assertEquals("Same numeric values have same hashcode", eq1.hashCode(), eq2.hashCode());

    }

    @Test
    public void stringValues() {
        assertEquals("711111112", new AccountNumber("711111112").toString());
        assertEquals("756373967", new AccountNumber("756373967").toString());
    }

}
