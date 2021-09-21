package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Reverse A String In Java
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter String to Reverse: ");
        String name = in.next();

        char[] r = reverseString(name);
        System.out.print("Reversed String is, ");
        System.out.println(r);
    }

    static char[] reverseString(String name) {
        char[] copy = name.toCharArray();

        int start = 0;
        int end = copy.length - 1;
        while(start <= end) {
            char temp = copy[start];
            copy[start] = copy[end];
            copy[end] = temp;

            start++;
            end--;
        }

        return copy;
    }

//    static void swap(char c1, char c2) {
//        char temp = c1;
//        c1 = c2;
//        c2 = temp;
//
//        System.out.println(c1 + " " + c2);
//    }
}
