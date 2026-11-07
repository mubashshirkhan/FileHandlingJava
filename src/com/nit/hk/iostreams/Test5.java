package com.nit.hk.iostreams;

/**
 * Listing files of a given directory
 * ====================================
 * - reading the file names and sub directory names
 * available in the given directory is called
 * listing files
 * <p>
 * - for listing files the class File has provided below methods
 * <p>
 * 1. public String[] list();			-> returns file names as String object
 * 2. public File[]   listFiles();		-> returns file names as File   object
 * <p>
 * 3. public String[] list(FilenameFilter filter);
 * 4. public File[]   listFiles(FilenameFilter filter);
 * <p>
 * // * - Below program shows listing (reading and printing) files of a given directory
 * // * 		refer the directory 'abc' the next slide
 * // *
 * //
 */
//public class Test5 {
//
//    public static void main(String[] args) {
//        ListFiles listFiles = new ListFiles();
//        //listFiles.listFiles("abc");
//        listFiles.listFiles(IO.readln("Enter directory name: "));
//    }
//}