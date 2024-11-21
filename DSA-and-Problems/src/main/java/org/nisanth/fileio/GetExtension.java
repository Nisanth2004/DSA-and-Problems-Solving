package org.nisanth.fileio;

import java.io.File;

public class GetExtension {
    public static void main(String[] args)
    {

        File file=new File("/Users/sujiths/Desktop/FileIO/June11");
        File[] f= file.listFiles();
        for(File files:f)
        {
            String filename=files.getName();
            int lastdot=filename.lastIndexOf(".");
            String extesion=filename.substring(lastdot+1); // after the dot

            if(extesion.equals("java"))
            {
            System.out.println(files+"Size: "+files.length());
        }}
    }
}
