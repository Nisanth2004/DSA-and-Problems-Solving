package org.nisanth.fileio;

import java.io.File;
import java.io.IOException;

public class RenameFile {
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/sujiths/Desktop/FileIO/June11/raja.txt");
      //  file.createNewFile();

        File newName=new File("/Users/sujiths/Desktop/FileIO/June11/kanisha.txt");
        file.renameTo(newName);


        // get file name
        System.out.println( file.getName());
    }
}
