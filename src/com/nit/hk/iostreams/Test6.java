package com.nit.hk.iostreams;

import java.io.File;

public class Test6 {
    static void main() {
        File dir = new File("abc");
        File[] filelist = dir.listFiles();//only top level

        for (int i = 0; i < filelist.length; i++) {
            File file1 = filelist[i];
            if (file1.isFile()) {
                System.out.println(file1);
            } else {
                System.out.println(file1);
                File[] filelist2 = file1.listFiles();//only top level

                for (int j = 0; j < filelist2.length; j++) {
                    File file2 = filelist2[j];
                    if (file2.isFile()) {
                        System.out.println(file2);
                    } else {
                        System.out.println(file2);

                        File[] filelist3 = file2.listFiles();
                        for (int k = 0; k < filelist3.length; k++) {
                            File file3 = filelist3[k];
                            if (file3.isFile()) {
                                System.out.println(file3);
                            } else {
                                System.out.println(file3);

                            }
                        }
                    }
                }
            }
        }
    }
}