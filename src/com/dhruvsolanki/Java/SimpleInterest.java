package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("P = Principle Amount");
        System.out.println("R = Annual Interest Rate");
        System.out.println("T = Time in Years");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter P: ");
        float p = in.nextFloat();

        System.out.print("Enter R: ");
        float r = in.nextFloat();

        System.out.print("Enter T: ");
        float t = in.nextFloat();

        float i = simpleInterest(p, r, t);
        System.out.println("Interest Earned: " + i);
    }

    static float simpleInterest(float p, float r, float t) {
        float i = (p * r * t) / 100;
        return i;
    }
}
