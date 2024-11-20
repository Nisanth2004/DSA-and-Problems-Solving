package org.nisanth.fileio;

import java.io.File;

public class FirstClass {
    public static void main(String[] args)
    {
        File file=new File("/Users/sujiths/Desktop/FileIO/June12/July10/August12/raja.txt");



        if(!file.exists()) {
            boolean s = file.mkdirs(); // make directory - create folder
        }
       // System.out.println(s);
    }
}
