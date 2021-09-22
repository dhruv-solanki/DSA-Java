package com.dhruvsolanki.Arrays;

import java.util.Arrays;

// Q: Richest Customer Wealth
// LeetCode
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
        };

        int rich = maximumWealth(accounts);
        System.out.println("Richest Man's Wealth: " + rich);
    }

    static int maximumWealth(int[][] accounts) {
        int[] sumWealth = new int[accounts.length];
        int max = 0;

        for(int i=0; i<accounts.length; i++) {
            for(int j=0; j<accounts[i].length; j++) {
                sumWealth[i] += accounts[i][j];
            }

            if(max < sumWealth[i]) {
                max = sumWealth[i];
            }
        }
//        int j = 0;
//        for(int i=0; i<accounts.length; i++) {
//            if(i == 0) {
//                j = 0;
//            }
//            sumWealth[i] += accounts[i][j];
//            j++;
//        }

//        for(int i=0; i<sumWealth.length; i++) {
//            if(max < sumWealth[i]) {
//                max = sumWealth[i];
//            }
//            System.out.println(sumWealth[i]);
//        }

        return max;
    }
}
