package org.nisanth.patterns;

public class GCDOpti {
    public static void main(String args[])

    {
        int a=5;int b=10;
        int n1=a;
        int n2=b;
        int gcd=0;
        while(a>0 && b>0)
        {
            if(a>b)
            {
                a=a%b;
            }
            else {
                b=b%a;
            }
            if(a==9)
            {
                gcd=b;
            }
            else {
                gcd=a;
            }
        }
        System.out.println("GCD IS : "+gcd);

        System.out.println();
        int ans=(n1*n2)/gcd;


        System.out.println("LCM IS :"+ans);
    }
}
