package org.nisanth.patterns;

public class CountDigits {
    public static void main(String[] args)
    {
        int N=7789;
        int count=0;
        while(N>0)
        {
            int lastDigit=N%10;
            System.out.print(lastDigit);
            N=N/10;
            count++;

        }
        System.out.println();
        System.out.println("Number os Digits: "+count);
    }
}
