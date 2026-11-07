package com.nit.hk.iostreams;

import java.io.File;

public class RetrivingFilesAndDirWithRecursiveMethods {

    static void listFiles(String dir) {
        listFiles(new File(dir));
    }

    static void listFiles(File dir) {

        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Invalid directory or unable to access directory.");
            return;
        }

        for (int i = 0; i < files.length; i++) {

            File file = files[i];

            if (file.isFile()) {
                System.out.println(file);
            } else {
                System.out.println(file);
                listFiles(file); // Method recursion
            }
        }
    }
}