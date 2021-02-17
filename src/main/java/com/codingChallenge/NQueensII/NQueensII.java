package com.codingChallenge.NQueensII;

public class NQueensII {

    public static int totalNQueens(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] resultult = new int[1];
        int[] column = new int[n];
        helper(resultult, 1, n, column);

        return resultult[0];
    }

    public static void helper(int[] result, int row, int n, int[] column) {
        if (row > n) {
            result[0] = result[0] + 1;
            return;
        }

        for (int i = 0; i < n; i++) {
            column[row - 1] = i;
            if (isValid(column, row - 1, i)) helper(result, row + 1, n, column);
        }
    }

    public static boolean isValid(int[] column, int i, int j) {
        for (int k = 0; k < i; k++) {
            if (column[k] == j || i - k == Math.abs(j - column[k])) return false;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
