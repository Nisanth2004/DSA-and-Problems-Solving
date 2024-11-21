package org.nisanth.fileio;

import java.io.*;

public class BufferedWrite {
    public static void main(String[] args) throws IOException {


        File file=new File("/Users/sujiths/Desktop/FileIO/preethi.txt");


        FileWriter fileWriter=new FileWriter(file);// not edit the exists content
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter); // it access file writer objet only


        // File Writing
        bufferedWriter.write("Nisanth it is me.");
        bufferedWriter.newLine();
        bufferedWriter.write("Preethika she is my best friend.");
        bufferedWriter.newLine();
        bufferedWriter.write("Kanisha she is my cutie akka.");
        bufferedWriter.flush();
        bufferedWriter.close();


        // read
        FileReader fileReader=new FileReader(file);

        // it read sentence by sentence but FileReader read char by char
        BufferedReader bufferedReader=new BufferedReader(fileReader);
       String line= bufferedReader.readLine();

       // coun the line
        int lineCount=0;
        int sentenceCount=0;
        int wordCount=0;
        int charCount=0;
       while(line!=null)
       {
          String[] sentence= line.split("[.]"); // if . means it sploit and convert to string array
          sentenceCount=sentenceCount+sentence.length;


          String[] words=line.split(" ");
          wordCount=wordCount+words.length;


           lineCount++;


           System.out.println(line);
           charCount=charCount+line.length();
           line=bufferedReader.readLine();
       }

        System.out.println("Line Count is : "+lineCount);
        System.out.println("Sentence Count is : "+sentenceCount);
        System.out.println("Word Count is : "+wordCount);
        System.out.println("Char Count is : "+charCount);


    }
}
