package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Take integer inputs till the user enters 0 and print the largest number from all.
public class MaxOfInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0;
        System.out.println("Enter numbers to get the Max of Numbers (press 0 to stop):");
        while(true) {
            int number = in.nextInt();

            if(number == 0) {
                break;
            }

            if(max < number) {
                max = number;
            }
        }
        System.out.println("Max: " + max);
    }
}
