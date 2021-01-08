package com.mycompany.horstmann.chapter1.ex9;

public class CompareStrings {
    public static void main(String[] args) {
        String s = "chap";
        s += "ter";
        System.out.println("chapter" == s);
        System.out.println("chapter".equals(s));
    }
}
