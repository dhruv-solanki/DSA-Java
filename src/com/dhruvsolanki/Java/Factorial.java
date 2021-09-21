package com.dhruvsolanki.Java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number to find Factorial: ");
        int number = in.nextInt();

        int ans = findFactorial(number);
        System.out.println("Factorial of " + number + " is " + ans);
    }

    static int findFactorial(int n) {
        int fact = 1;
        int factorial = 1;
        while(n >= 1) {
            factorial *= n;
            n--;
        }

        return factorial;
    }
}
