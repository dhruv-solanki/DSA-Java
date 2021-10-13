package com.dhruvsolanki.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

// Q: Matrix Transpose
public class MatrixTranspose {
    public static void main(String[] args) {
//        int[][] matrix = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
        };

//        int[][] matrix = {
//                {1, 2},
//                {3, 4},
//                {5, 6},
//        };

        int[][] transpose = matrixTranspose(matrix);
        for(int i=0; i<transpose.length; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }
    }

    static int[][] matrixTranspose(int[][] mat) {
        int[][] matCopy = new int[mat[0].length][mat.length];

        for(int i=0; i<matCopy.length; i++) {
            for(int j=0; j<matCopy[i].length; j++) {
                matCopy[i][j] = mat[j][i];
            }
        }

        return matCopy;
    }
}
