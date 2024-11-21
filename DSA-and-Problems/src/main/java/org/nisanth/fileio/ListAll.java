package org.nisanth.fileio;

import java.io.File;

public class ListAll {
    public static void main(String[] args)
    {
        File file=new File("/Users/sujiths/Desktop");

       String[] allFolders= file.list();
       for(String s:allFolders)
       {
           System.out.println(s);
       }
    }
}
