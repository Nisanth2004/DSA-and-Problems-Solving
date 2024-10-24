package org.nisanth.patterns;
public class SumOfDigits {
    public static void main(String[] args) {
        int N=123;
        int sum=0;
        while(N>0)
        {
            sum=sum+(N%10);
            N=N/10;

        }

        System.out.println("Sum of Digits: "+sum);
    }
}
