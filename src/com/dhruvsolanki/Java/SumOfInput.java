package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumOfInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter numbers to get the Sum (press 0 to sum):");
        while(true) {
            int number = in.nextInt();
            if(number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
