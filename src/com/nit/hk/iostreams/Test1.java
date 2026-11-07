package com.nit.hk.iostreams;

import java.io.File;

public class Test1 {
    static void main() {
        File file1 = new File("xyz.txt");
        System.out.println(file1);  //file1.toString(); -> xyz.txt

        File file2 = new File("pqr", "12.txt");
        System.out.println(file2); //file2.toString(); -> pqr\12.txt

        File file3 = new File("mno");
        System.out.println(file3); //file3.toString(); -> mno

        File file4 = new File(file3, "456.doc");
        System.out.println(file4); //file4.toString(); -> mno\456.doc


    }
}
