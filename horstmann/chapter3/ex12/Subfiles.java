package com.mycompany.horstmann.chapter3.ex12;

import java.io.File;

public class Subfiles {
    public static String[] getFiles(File file, String extension) {
        return file.list(((dir, name) -> name.endsWith(extension)));
    }
}

