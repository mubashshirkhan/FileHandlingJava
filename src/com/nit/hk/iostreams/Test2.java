package com.nit.hk.iostreams;

import java.io.File;
import java.io.IOException;

public class Test2 {
    static void main() throws IOException {

        File file1 = new File("xyz.txt");
        boolean created = file1.createNewFile();
        System.out.println(created);

        File file2 = new File("mno.txt");
        System.out.println(file2.createNewFile());

        File file3 = new File("pqr");
        System.out.println(file3.mkdir());

        File file4 = new File("pqr", "stv");
        System.out.println(file4.mkdir());

        File file5 = new File("pqr", "ijk.doc");
        System.out.println(file5.createNewFile());

        File file6 = new File("a1", "a2");
        System.out.println(file6.mkdirs());

        File file7 = new File(file6, "a3");
        System.out.println(file7.mkdirs());

        File file8 = new File("a1\\a2", "a4.ppt");
        System.out.println(file8.createNewFile());


        File file9 = new File("bbc", "cbc.txt");
        System.out.println(file9.createNewFile());	//RE: IOE cuz the parent dir not exists
        System.out.println(file9.mkdir());			//false
        System.out.println(file9.mkdirs());
    }
}
