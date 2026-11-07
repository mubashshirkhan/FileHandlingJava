package com.nit.hk.iostreams;

import java.io.File;

public class Test4 {

    void listFiles(String fileName) {
        File file = new File(fileName);
        listFiles(file);
        //listFilesWithFolderStructure(file);
    }

    void listFiles(File dir) {

        System.out.println(dir);
        File[] files = dir.listFiles(); //listing all files of parent and sub folder

        for (File file : files) {

            if (file.isFile()) {
                System.out.println(file);

            } else {
                listFiles(file);    //call method for this sub folder
            }
        }

    }


    int count = 1;

    void listFilesWithFolderStructure(File dir) {

        if (count == 1) {
            System.out.println(dir.getName());
        } else {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            System.out.println("|-" + dir.getName());
        }
        count *= 2;
        File[] files = dir.listFiles();

        for (File file : files) {

            if (file.isFile()) {
                for (int i = 1; i <= count; i++)
                    System.out.print(" ");

                System.out.println("|-" + file.getName());
            } else {
                listFilesWithFolderStructure(file);
            }
        }
        count -= 4;

    }
}