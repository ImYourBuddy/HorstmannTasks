package com.mycompany.horstmann.chapter3.ex13;

import java.io.File;
import java.util.Arrays;

public class FileSort {
    public static void sort(File[] files) {
        Arrays.sort(files, (f1, f2) -> {
            if (f1.isDirectory()) {
                if (f2.isFile()) {
                    return -1;
                }
                if (f2.isDirectory()) {
                    return f1.compareTo(f2);
                }
            }
//            else if (f1.isFile()) {
//                if (f2.isDirectory()) {
//                    return 1;
//                }
//                if (f2.isFile()) {
//                    return f1.compareTo(f2);
//                }
//            }
            if (f2.isDirectory()) {
                return 1;
            }
            return f1.compareTo(f2);
        });
    }
}
