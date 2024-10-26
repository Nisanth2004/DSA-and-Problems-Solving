package org.nisanth.patterns;

class SumOfAllDivOPTI{
 public static void main(String args[])
 {
        // code here
        long sum=0;
        int N=4;
        for(int i=1;i<=N;i++)
        {


            sum+=i*(N/i);
            System.out.println(sum);

        }
     System.out.println();
     System.out.println(sum);
    }
}