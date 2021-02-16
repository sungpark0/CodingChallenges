package com.codingChallenge.SearchA2DMatrixII;

public class SearchA2DMatrixII {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) return true;
            if (matrix[row][column] < target) row++;
            else if (matrix[row][column] > target) column--;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30},};
        searchMatrix(matrix, 5);
    }
}
