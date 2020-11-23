package com.rootbyos.springboot.MatrixDiagonalSum;

public class MatrixDiagonalSum {
    public static void main(String[] args) {

        int[][] test = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(diagonalSum(test));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int end = mat.length - 1;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }

        int k = mat.length - 1;
        for (int[] ints : mat) {
            sum += ints[k--];
        }

        if (mat.length % 2 != 0) {
            sum -= mat[(end / 2)][end / 2];
        }
        return sum;
    }
}
