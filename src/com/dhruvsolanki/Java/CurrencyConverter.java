package com.dhruvsolanki.Java;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Rupees to Convert in USD: ");
        double rupees = in.nextDouble();

        System.out.println("USD: " + rupeesToUsd(rupees));
    }

    static double rupeesToUsd(double rupees) {
        double usdPrice = 0.014;
        return rupees * usdPrice;
    }
}
