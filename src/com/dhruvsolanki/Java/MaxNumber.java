package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Take 2 numbers as input and print the largest number.
public class MaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Two Numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("The Max Number: " + maxNumber(num1, num2));
    }

    static int maxNumber(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
