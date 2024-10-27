package org.nisanth.patterns;

public class DownTriangle extends Thread{
    public static void main(String args[])
    {
        for(int row=1;row<=3;row++)
        {
            for(int space=1;space<row;space++)
            {
                System.out.print(" ");
            }
            for(int no1=3;no1>=row;no1--)
            {
                System.out.print("*");
            }
            for(int no2=2;no2>=row;no2--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
