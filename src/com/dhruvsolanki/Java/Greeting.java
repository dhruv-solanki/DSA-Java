package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Take name as input and print a greeting message for that name.
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = in.next();

        greet(name);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + " welcome to the world of Dev!");
    }
}
