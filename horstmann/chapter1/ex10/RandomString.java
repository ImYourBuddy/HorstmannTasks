package com.mycompany.horstmann.chapter1.ex10;

import java.util.Random;

public class RandomString {
    /**
     * Generating a random string  by generating a random long value and printing it in base 36.
     */
    public static void printRandomString () {
        long randomValues = new Random().nextLong();
        System.out.println(Long.toString(randomValues, 36));
    }

}
