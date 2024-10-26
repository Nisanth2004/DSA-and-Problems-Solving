package org.nisanth.patterns;

public class GCD {
    public static void main(String args[])

    {
        // time complexity - O(min(n1,n1)) - worst case
        int gcd=1;
        int n=100;
        int n1=3;
        int n2=12;
        int n3=Integer.min(n1,n2);
        for(int i=n3;i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd=i;
                System.out.println("GCD in loop: "+gcd);
                break;

            }
        }

        System.out.println("GCD is : "+gcd);
    }
}
