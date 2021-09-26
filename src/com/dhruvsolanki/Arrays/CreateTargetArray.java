package com.dhruvsolanki.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Q: Create Target Array in the Given Order
// LeetCode : Unable to solve by myself need to check Discussion section.
public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<Integer>(nums.length);

        for(int i=0; i<nums.length; i++) {
            arr.add(index[i], nums[i]);
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<ans.length; i++) {
            ans[i] = arr.get(i);
        }

        return ans;


//        for(int i=0; i<nums.length; i++) {
//            if(ans[i] == 0) {
//                ans[index[i]] = nums[i];
//            } else {
//                for(int j=ans.length-2; j>index[i]; j--) {
//                    ans[j+1] = ans[j];
//                    System.out.println(ans[j]);
//                }
//
//                ans[index[i]] = nums[i];
//            }
//        }
        
//        return ans;
    }
}
