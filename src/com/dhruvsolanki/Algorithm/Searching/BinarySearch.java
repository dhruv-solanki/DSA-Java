package com.dhruvsolanki.Algorithm.Searching;

// Binary Search Algorithm is very efficient at searching an element in sorted list.
// The Time Complexity for this Algorithm is O(log[n])

public class BinarySearch {
    public static void main(String[] args) {
        // Ascending order - sorted array on which we can do searching
        int[] arr = {-7, -2, 0, 3, 6, 12, 32, 45, 78, 90};
        // target element that we can find in array
        int target = 45;

        // calling method that will return index if element present in array otherwise returns -1
        int ans = binarySearch(arr, target);
        System.out.println("Target found at, " + ans);
    }

    // the binary search method that will return index
    static int binarySearch(int[] arr, int target) {

        // start will become 0
        int start = 0;
        // end will become array's length - 1
        int end = arr.length - 1;

        // loop through till start is less than or equal to end
        while (start <= end) {
            // set mid = (start + end) / 2
            // this just efficient way of doing it so that int range don't exceed in java
            int mid = start + (end - start) / 2;

            // if target present in left side of array
            if (target < arr[mid]) {
                end = mid - 1;
            }
            // if target present in right side of array
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            // else target is found so return mid
            else {
                return mid;
            }
        }
        // finally if target is not present in array then return -1
        return -1;
    }
}
