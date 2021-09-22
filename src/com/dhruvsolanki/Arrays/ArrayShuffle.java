package com.dhruvsolanki.Arrays;

import java.util.Arrays;

// Q: Shuffle the Array
// LeetCode
public class ArrayShuffle {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int p1 = 0;
        int p2 = n;

        for(int i=0; i<nums.length; i++) {
            if(i % 2 == 0) {
                ans[i] = nums[p1];
                p1++;
            } else {
                ans[i] = nums[p2];
                p2++;
            }
        }

        return ans;
    }
}
