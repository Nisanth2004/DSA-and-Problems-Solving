package org.nisanth.patterns;

public class Main1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {

            //space
            for(int j=0;j<=i;j++)
            {
                System.out.print("1");
            }
            //star
            for(int j=n;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}