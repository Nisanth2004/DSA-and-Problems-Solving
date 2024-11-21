package org.nisanth.fileio;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/sujiths/Desktop/FileIO");

        /*if(file.exists())
        {
            file.delete();
        }*/

        file.createNewFile();
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        System.out.println( file.getAbsolutePath());
        String[] s=file.list();

        for(int i=0;i<s.length;i++)
        {
            if(s[i].charAt(0)=='J')
            System.out.println(s[i]);
        }

    }
}
