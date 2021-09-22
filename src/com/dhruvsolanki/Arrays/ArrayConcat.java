package com.dhruvsolanki.Arrays;

import java.util.Arrays;

// Q: Concatenation of Array
// LeetCode Question
public class ArrayConcat {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        int j = 0;
        for(int i=0; i<ans.length; i++) {
            if(j >= nums.length) {
                j = 0;
            }

            ans[i] = nums[j];
            j++;
        }

        return ans;
    }
}
