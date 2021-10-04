package com.dhruvsolanki.Arrays;

// Q: Matrix Diagonal Sum
public class MatrixDiagonalSum {
    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2},
//                {3, 4},
//        };

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int sum = diagonalSum(matrix);
        System.out.println("Sum: " + sum);
    }

    static int diagonalSum(int[][] matrix) {
        int sum = 0;
        int j = 0;
        for(int i=0; i<matrix.length; i++) {
            sum = sum + matrix[i][j];
            j++;
        }

        j = matrix.length - 1;
        for(int i=0; i< matrix.length; i++) {
            if (i == j) {
                j--;
            } else {
                sum = sum + matrix[i][j];
                j--;
            }

        }

        return sum;
    }
}
