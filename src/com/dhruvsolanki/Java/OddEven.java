package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Write a program to print whether a number is even or odd, also take input.
public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number to check Even or Odd: ");
        int number = Integer.parseInt(in.next());

        System.out.println("The Number: " + number + " is " + isEvenOrOdd(number));
    }

    static String isEvenOrOdd(int number) {
        if(number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
