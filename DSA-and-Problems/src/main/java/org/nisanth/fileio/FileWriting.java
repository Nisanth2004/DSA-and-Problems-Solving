package org.nisanth.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/sujiths/Desktop/FileIO/June11/preethika.txt");
        file.createNewFile();

        // write the file
        FileWriter writer=new FileWriter(file);
        writer.write(65);
        writer.write("Hi Preethika");
        writer.flush();
        writer.close();


        // read the file
        FileReader fileReader=new FileReader(file);
        int output=fileReader.read();
        while(output!=-1)
        {
            System.out.print((char)output);
            output=fileReader.read();
        }



    }
}
