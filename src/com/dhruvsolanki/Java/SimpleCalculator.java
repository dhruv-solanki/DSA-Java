package com.dhruvsolanki.Java;

import java.util.Scanner;

// Q: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Two Numbers: ");
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();

        System.out.print("Enter Operator: ");
        String operator = in.next();

        if(operator.equals("+")) {
            System.out.println("Result: " + (num1 + num2));
        } else if(operator.equals("-")) {
            System.out.println("Result: " + (num1 - num2));
        } else if(operator.equals("*")) {
            System.out.println("Result: " + (num1 * num2));
        } else if(operator.equals("/")) {
            System.out.println("Result: " + (num1 / num2));
        }
    }
}
