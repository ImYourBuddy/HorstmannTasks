package com.mycompany.horstmann.chapter3.ex11;

import java.io.File;
import java.io.FileFilter;

public class Subdirectories {

    public static File[] getSubdirectoriesWithLambda(File file) {
        return file.listFiles((subdirectory) -> subdirectory.isDirectory());
    }

    public static File[] getSubdirectoriesWithAnonymous(File file) {
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        };
        return file.listFiles(filter);
    }

    public static File[] getSubdirectoriesWithClass(File file) {
        return file.listFiles(File::isDirectory);
    }
}
