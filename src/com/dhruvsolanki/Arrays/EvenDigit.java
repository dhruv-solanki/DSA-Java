package com.dhruvsolanki.Arrays;

// Q: Find Numbers with Even Number of Digits
public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {437, 315, 322, 431, 686, 264, 442};

        int digits = findNumbers(nums);
        System.out.println("Even Digit: " + digits);
    }

    static int findNumbers(int[] nums) {
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            int n = nums[i];
            if(checkEven(n)) {
                sum++;
            }
        }

        return sum;
    }

    static boolean checkEven(int n) {
        int count = 0;
        while(n > 0) {
            n = n / 10;
            count++;
        }

        if(count % 2 == 0) {
            return true;
        }

        return false;
    }
}
