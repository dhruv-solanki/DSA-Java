package com.dhruvsolanki.Java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number to find if it is Armstrong: ");
        int number = in.nextInt();

        boolean isArm = checkArmstrong(number);
        System.out.println(number + " is Armstrong: " + isArm);

        System.out.print("Enter two numbers to find Armstrong numbers in between: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        findArmstrong(n1, n2);
    }

    static void findArmstrong(int n1, int n2) {
        for(int i = n1; i <= n2; i++) {
            if(checkArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean checkArmstrong(int n) {
        int copy = n;
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, String.valueOf(copy).length());
            n = n / 10;
        }

        return copy == sum;
    }
}
