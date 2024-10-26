package org.nisanth.patterns;

public class Pattern4 {
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
