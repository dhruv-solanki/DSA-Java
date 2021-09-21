package com.dhruvsolanki.Algorithm.Searching;

// What if we don't know that array is sorted in Ascending or Descending order
// Then check for order type and then do binary search

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {-5, -1, 2, 3, 3, 4, 5, 6, 9, 12, 15, 18, 21};
        int target1 = 5;

        int[] arr2 = {33, 21, 17, 14, 10, 5, 3, 1, -1, -2, -2};
        int target2 = -2;

        int ans1 = orderAgnosticBS(arr1, target1);
        System.out.println("Ascending order element at, " + ans1);

        int ans2 = orderAgnosticBS(arr2, target2);
        System.out.println("Descending order element at, " + ans2);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//        check if array is in Ascending or Descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
//          find middle element in better way
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

//          if array is sorted in Ascending order then apply below code
            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
//          if array is sorted in Descending order then apply below code
            else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

