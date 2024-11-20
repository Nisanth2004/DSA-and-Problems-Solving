package org.nisanth.fileio;

import java.io.File;

public class ListFiles {
    public static void main(String[] args)
    {
        File file=new File("/Users/sujiths/Desktop/FileIO/June12");
       File[] f= file.listFiles();
       for(int i=0;i<f.length;i++)
       {
           if(f[i].isFile())
           {
           System.out.println(f[i]);
       }}
    }
}
