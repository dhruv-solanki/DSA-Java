package com.dhruvsolanki.Arrays;

import java.util.Arrays;

// Q: Flipping an Image
// LeetCode
public class FlipImage {
    public static void main(String[] args) {
//        int[][] image= {
//                {1, 1, 0},
//                {1, 0, 1},
//                {0, 0, 0},
//        };

        int[][] image = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 0, 1},
        };

        int[][] invertedImage = flipAndInvertImage(image);
        for(int i=0; i<invertedImage.length; i++) {
            System.out.println(Arrays.toString(invertedImage[i]));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i< image.length; i++) {
            flip(image[i]);
            invert(image[i]);
        }

        return image;
    }

    static void flip(int[] row) {
        int start = 0;
        int end = row.length - 1;

        while(start <= end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;

            start++;
            end--;
        }
    }

    static void invert(int[] row) {
        for(int i=0; i< row.length; i++) {
            if(row[i] == 0) {
                row[i] = 1;
            } else {
                row[i] = 0;
            }
        }
    }
}
