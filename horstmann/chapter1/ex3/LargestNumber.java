package com.mycompany.horstmann.chapter1.ex3;

public class LargestNumber {
    /**
     * Finds and prints the largest value of three int values using conditional operators.
     * @param x1
     * @param x2
     * @param x3
     */
    public static void largest1 (int x1, int x2, int x3) {
        int[] numbers = new int[]{x1, x2, x3};
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }

    /**
     * Finds and prints the largest value of three int values using {@link Math#max(int, int)}.
     * @param x1
     * @param x2
     * @param x3
     */
    public static void largest2 (int x1, int x2, int x3) {
        int[] numbers = new int[]{x1, x2, x3};
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            max = Math.max(number, max);
        }
        System.out.println(max);
    }
}
