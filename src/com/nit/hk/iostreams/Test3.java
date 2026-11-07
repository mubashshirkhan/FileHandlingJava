package com.nit.hk.iostreams;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException, InterruptedException {

        File file = new File("abc.txt");
        //File file = new File("ebc");
        //File file = new File("dbc\\ebc");
        //File file = new File("a1\\a2");
        //File file = new File(IO.readln("Enter file/dir name: "));

        System.out.println(file.exists());
        System.out.println();

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println();

        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println();

        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
        System.out.println();

        file.setReadOnly();
        System.out.println();

        System.out.println(file.length() + " bytes");
        System.out.println(new java.sql.Timestamp(file.lastModified()));
        System.out.println();

        file = new File("xyz.txt");
        System.out.println(file.delete());
        System.out.println(file.exists());
        System.out.println();

        file = new File("def.txt");
        file.deleteOnExit();
        System.out.println(file.exists());

        file = new File("efg.txt");
        file.deleteOnExit();  //used for delete temp file or cache files created by this program backgroup
        System.out.println(file.exists());

        System.out.println("program exeuction is pasued");
        Thread.sleep(5000);
        System.out.println("program exeuction is resumed");
        System.out.println("program exeuction is completed");
    }
}