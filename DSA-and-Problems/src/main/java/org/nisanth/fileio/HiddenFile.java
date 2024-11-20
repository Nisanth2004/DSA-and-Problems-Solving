package org.nisanth.fileio;

import java.io.File;

public class HiddenFile {
    public static void main(String[] args)
    {
        File file=new File("/Users/sujiths/Desktop/FileIO/June12");
        File[] f= file.listFiles();
        for(int i=0;i<f.length;i++)
        {
            if(f[i].isHidden())
            {
                System.out.println(f[i]);
            }}
    }
    }

