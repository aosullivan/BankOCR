package org.adrianos;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * Represents a 9-character account number with validation and printing logic
 */
public class AccountNumber {

    private String accountNumber;

    public AccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return is valid if checksum divisible by 11
     */
    public boolean isValid() {
        return checkSum() % 11 == 0;
    }

    /**
     * @return sum of each numeric value in the account number multiplied by 9 -
     *         its position (with the string indexed 1 - 9) - see unit tests for
     *         example
     */
    protected int checkSum() {
        IntUnaryOperator f = (pos) -> {
            return pos * Character.getNumericValue(accountNumber.charAt(9 - pos));
        };
        return IntStream.rangeClosed(1, 9).map(f).sum();
    }

    private boolean isIllegible() {
        return accountNumber.indexOf('?') != -1;
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return accountNumber.equals(obj.toString());
    }

    @Override
    public String toString() {
        return accountNumber;
    }

    public String print() {
        return accountNumber + (isIllegible() ? " ILL" : (isValid() ? "" : " ERR"));
    }

}
