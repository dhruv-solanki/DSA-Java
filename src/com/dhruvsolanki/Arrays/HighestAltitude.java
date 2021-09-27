package com.dhruvsolanki.Arrays;

// Q: Find the Highest Altitude
// LeetCode
// There is a biker going on a road trip.
// The road trip consists of n + 1 points at different altitudes.
// The biker starts his trip on point 0 with altitude equal 0.
// You are given an integer array gain of length n
// where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n).
// Return the highest altitude of a point.
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gains = {-5, 1, 5, 0, -7};

        int highest = highestAltitude(gains);
        System.out.println("Highest Altitude: " + highest);
    }

    static int highestAltitude(int[] gains) {
        int start = 0;
        int max = start;

        for(int i=0; i<gains.length; i++) {
            int current = start + gains[i];
            start = current;

            if(max < current) {
                max = current;
            }
        }

        return max;
    }
}
