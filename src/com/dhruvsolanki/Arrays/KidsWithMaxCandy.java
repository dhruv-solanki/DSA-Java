package com.dhruvsolanki.Arrays;

import java.util.ArrayList;
import java.util.List;

// Q: Kids With the Greatest Number of Candies
// There are n kids with candies.
// You are given an integer array candies,
// where each candies[i] represents the number of candies the ith kid has,
// and an integer extraCandies, denoting the number of extra candies that you have.
//Return a boolean array result of length n,
// where result[i] is true if, after giving the ith kid all the extraCandies,
// they will have the greatest number of candies among all the kids, or false otherwise.
//Note that multiple kids can have the greatest number of candies.
// LeetCode
public class KidsWithMaxCandy {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> isKidsHaveMax = kidsWithCandies(candies, extraCandies);
        System.out.println(isKidsHaveMax);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> isKidsHaveMax = new ArrayList<Boolean>(candies.length);

        int[] sum = new int[candies.length];
        int max = 0;

        for(int i=0; i<candies.length; i++) {
            if(max < candies[i]) {
                max = candies[i];
            }
        }

        for(int i=0; i<candies.length; i++) {
            sum[i] = candies[i] + extraCandies;

            if(sum[i] >= max) {
                isKidsHaveMax.add(true);
            } else {
                isKidsHaveMax.add(false);
            }
        }

        return isKidsHaveMax;
    }
}
