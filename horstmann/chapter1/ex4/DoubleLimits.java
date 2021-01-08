package com.mycompany.horstmann.chapter1.ex4;

public class DoubleLimits {

    /**
     * Prints the smallest and largest positive double values using {@link Math#nextUp(double)}.
     */
    public static void printLimitValues () {
        System.out.println(Math.nextUp(0.0)); //Double.MIN_VALUE
        System.out.println(Math.nextUp(Double.NEGATIVE_INFINITY ) * -1); //Double.MAX_VALUE
    }
}
