package com.mycompany.horstmann.chapter1.ex5;

/**
 * Testing what happens if cast a double to an int that is larger than the largest possible int value.
 */
public class IncorrectDoubleToInt {
    public static void main(String[] args) {
        double x1 = Integer.MAX_VALUE + 100;
        int x2 = (int) x1;
        System.out.println(x2);
    }
}
