package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Subtract the Product and Sum of Digits of an Integer
// Leetcode question
public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = in.nextInt();

        int ans = subtractProductAndSum(number);
        System.out.println("Subtraction of product and sum of digit: " + ans);
    }

    static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while(n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }
        return product - sum;
    }
}
