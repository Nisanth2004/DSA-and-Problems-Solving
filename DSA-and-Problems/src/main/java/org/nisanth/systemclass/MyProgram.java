package org.nisanth.systemclass;

import java.util.Scanner;

public class MyProgram {
    static StringDemo sd;
    public static void main(String[] args)
    {


        Scanner sc=new Scanner(System.in);

        System.out.println();
        /*
        System - class
        out - object name (PrintStream  class)
        println() - method

         */

        //MyProgram class will refer to StringDemo class object
       MyProgram.sd.test();

    }
}
