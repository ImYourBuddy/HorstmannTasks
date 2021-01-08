package com.mycompany.horstmann.chapter3.ex12;

import java.io.File;

public class Subfiles {
    public static File[] getFiles(File file, String extension) {
        String[] fileNames = file.list(((dir, name) -> name.endsWith(extension)));
        File[] files = new File[fileNames.length];
        for (int i = 0; i < fileNames.length; i++) {
            files[i] = new File(file.getParent() + "\\" + file.getName() + "\\" + fileNames[i]);
        }
        return files;
    }
}

