package org.nisanth.patterns;

public class CheckForPrimeBruteForce {
    public static void main(String args[])
    {
        // time - O(n)

        int n=27;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }

        }

        if(count==2)
        {
            System.out.println("It is prime");
        }
        else
        {
            System.out.println("Not prime");
        }
    }
}
