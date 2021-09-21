package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Input a number and print all the factors of that number (use loops).
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number to find Factors: ");
        int number = in.nextInt();

        findFactors(number);
    }

    static void findFactors(int n) {
        int factor = 1;
        System.out.println("Factors of: " + n + " are below,");
        while(factor <= n) {
            if(n % factor == 0) {
                System.out.print(factor + ", ");
            }
            factor += 1;
        }
    }
}
