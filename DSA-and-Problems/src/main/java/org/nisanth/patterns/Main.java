package org.nisanth.patterns;

public class Main {
    public static void alphaTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            // Cast 'E' - i to char explicitly
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        alphaTriangle(n);  // You can test the function with 5 rows
    }
}