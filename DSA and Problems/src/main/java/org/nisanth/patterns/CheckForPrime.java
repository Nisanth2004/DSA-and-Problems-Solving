package org.nisanth.patterns;

import org.nisanth.search.Methods;

public class CheckForPrime extends Methods {
    public static void main(String args[]) {

       CheckForPrime checkForPrime=new CheckForPrime();
       checkForPrime.display();
        int n = 17;
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;

                if ((n / i) != i) count++;


            }

        }
        if (count == 2) {
            System.out.println("It is prime:");
        } else {
            System.out.println("not prime");
        }
    }
}
