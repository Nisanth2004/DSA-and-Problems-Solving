package org.nisanth.patterns;

import java.util.ArrayList;

public class FindDivisors {
    public static void main(String args[])
    {

        ArrayList arrayList=new ArrayList();
        int N=12;
        int sum=0;
        for(int i=1;i<=N;i++)
        {
            if(N%i==0)
            {
                arrayList.add(i);
                sum+=i;
            }
        }

        System.out.println(arrayList);
        System.out.println(sum);
    }
}
