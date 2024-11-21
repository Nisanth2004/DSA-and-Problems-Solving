package org.nisanth.fileio;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        InputStream input=new FileInputStream("/Users/sujiths/Desktop/Screenshot 2024-08-24 at 9.16.36 PM.png");
        OutputStream output=new FileOutputStream("/Users/sujiths/Desktop/ppp.jpg");

        int content=input.read();
        while(content!=-1)
        {
            output.write(content);
        }
        output.flush();


    }
}
