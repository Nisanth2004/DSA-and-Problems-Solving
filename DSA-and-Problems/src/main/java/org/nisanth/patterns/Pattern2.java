package org.nisanth.patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {

            // space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }


            // star
            for(int j=n;j>i;j--)
            {
                System.out.print("*");
            }

            //space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
