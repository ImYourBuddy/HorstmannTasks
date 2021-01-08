package com.mycompany.horstmann.chapter1.ex1;

public class Converter {
    public static void convert (int number) {
        String binary = "0b" + Integer.toBinaryString(number);
        String octal = "0" + Integer.toOctalString(number);
        String hex = "0x" + Integer.toHexString(number);
        System.out.println("Decimal to binary: " + binary);
        System.out.println("Decimal to octal: " + octal);
        System.out.println("Decimal to hex: " + hex);
    }

}
