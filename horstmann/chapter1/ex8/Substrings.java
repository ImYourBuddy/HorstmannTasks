package com.mycompany.horstmann.chapter1.ex8;

public class Substrings {
    /**
     * Prints all of its nonempty substrings.
     *
     * @param s
     */
//    public static void printSubstrings(String s) {
//        String[] substrings = s.split("[ \\n\\t\\r]");
//        for (String string : substrings) {
//            if (string.equals("")) {
//                continue;
//            } else {
//                System.out.println(string);
//            }
//        }
//    }
    //second implementation
    public static void printSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!(s.substring(i, j + 1).equals("") || s.substring(i, j + 1).equals(s))) {
                    System.out.println(s.substring(i, j + 1));
                }
            }
        }
    }
}
