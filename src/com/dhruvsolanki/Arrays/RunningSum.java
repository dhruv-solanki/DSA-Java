package com.dhruvsolanki.Arrays;

import java.util.Arrays;

// Q: Running Sum of 1d Array
// LeetCode
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

//        int sum = 0;
//        for(int i=0; i<nums.length; i++) {
//            for(int j=0; j<=i; j++) {
//                sum += nums[j];
//            }
//            ans[i] = sum;
//            sum = 0;
//        }

//      Optimized Solution
        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i] + ans[i-1];
            }
        }

        return ans;
    }
}
