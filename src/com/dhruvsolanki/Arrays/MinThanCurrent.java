package com.dhruvsolanki.Arrays;

import java.util.Arrays;

// Q: How Many Numbers Are Smaller Than the Current Number
// LeetCode : 15ms -> Need to Optimize
public class MinThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        int[] ans = smallerNumsThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] smallerNumsThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[i] > nums[j] && nums[i] != nums[j]) {
                    ans[i] += 1;
                }
            }
        }

        return ans;
    }
}
