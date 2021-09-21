package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Write a program to print the sum of negative numbers,
// sum of positive even numbers and
// the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sumNegative = 0;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.print("Enter numbers (press 0 to terminate) : ");
        while(true) {
            int number = in.nextInt();
            if(number == 0) {
                break;
            }

            if(number < 0) {
                sumNegative += number;
            } else if(number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println("Sum of Negative Numbers: " + sumNegative);
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
    }
}
