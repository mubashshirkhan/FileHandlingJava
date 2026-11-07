
package com.nit.hk.iostreams;

public class MainUsingRetrivingFiles {

    static void main() {

        System.out.print("Enter directory name: ");

        String dir = IO.readln();

        RetrivingFilesAndDirWithRecursiveMethods.listFiles(dir);
    }
}