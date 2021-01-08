package com.mycompany.horstmann.chapter1.ex6;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(BigInteger.valueOf(1000)));
    }

    /**
     * Calculate factorial using {@link BigInteger}.
     * @param value value for which the factorial is calculated
     * @return calculated factorial
     */
    public static BigInteger calculateFactorial (BigInteger value) {
        if (value.compareTo(BigInteger.ONE) == 0) {
            return BigInteger.ONE;
        }
        return value.multiply(calculateFactorial(value.subtract(BigInteger.ONE)));
    }
}
