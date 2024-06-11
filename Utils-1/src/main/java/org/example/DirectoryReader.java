package org.example;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class DirectoryReader {
    public static void readFolders(File root) {
        File[] files = root.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No elements in the current folder");
        } else {
            Arrays.sort(files, Comparator.comparing(File::getName));
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
