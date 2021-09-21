package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Fibonacci Series program in JAVA
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number for Fibonacci Series: ");
        int number = in.nextInt();

        fibonacci(number);
    }

    static void fibonacci(int n) {
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2);

        for(int i=2; i<n; i++) {
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
            System.out.print(" " + next);
        }
    }
}
