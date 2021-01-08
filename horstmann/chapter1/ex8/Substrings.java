package com.mycompany.horstmann.chapter1.ex8;

public class Substrings {
    /**
     * Prints all of its nonempty substrings.
     * @param s
     */
    public static void printSubstrings(String s) {
        String[] substrings = s.split("[ \\n\\t\\r]");
        for (String string : substrings) {
            if (string.equals("")) {
                continue;
            } else {
                System.out.println(string);
            }
        }
    }
}
