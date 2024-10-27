package org.nisanth;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Hello world!");
    }
}