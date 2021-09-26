package com.dhruvsolanki.Arrays;

// Q: Number of Good Pairs
// Given an array of integers nums, return the number of good pairs.
//A pair (i, j) is called good if nums[i] == nums[j] and i < j
// LeetCode
public class GoodPairs {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 1, 1, 3};
        int[] nums = {1, 1, 1, 1};

        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }

                if(j == nums.length-1) {
                    break;
                }
            }
        }

        return count;
    }
}
