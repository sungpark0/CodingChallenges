package com.codingChallenge.SearchA2DMatrix;

public class SearchA2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int col = 0;
        int row = matrix[0].length - 1;

        while (col < matrix.length && row >= 0) {
            if (matrix[col][row] == target) return true;
            if (matrix[col][row] < target) col++;
            else if (matrix[col][row] > target) row--;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
