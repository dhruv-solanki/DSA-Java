package com.dhruvsolanki.Java;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number to find if Palindrome or not: ");
        int number = in.nextInt();

        System.out.println(number + " is Palindrome: " + isPalindrome(number));
    }

    static boolean isPalindrome(int n) {
        String number = "";
        int copy = n;
        while(n > 0) {
            int digit = n % 10;
            number = number + digit;
            n = n / 10;
        }
        return copy == Integer.parseInt(number);
    }
}
