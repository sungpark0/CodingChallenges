package com.codingChallenge.SetMatrixZeroes;

public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {
        int[] col = new int[matrix.length];
        int[] row = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    col[i] = 1;
                    row[j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (col[i] == 1 || row[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
