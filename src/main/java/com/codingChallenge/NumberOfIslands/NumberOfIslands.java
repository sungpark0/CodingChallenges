package com.codingChallenge.NumberOfIslands;

public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    helper(grid, i, j);
                    result++;
                }
            }
        }

        return result;
    }

    public static void helper(char[][] grid, int col, int row) {
        if (col < 0 || col >= grid.length || row < 0 || row >= grid[0].length) return;

        if (grid[col][row] == '0') return;

        grid[col][row] = '0';
        helper(grid, col, row + 1);
        helper(grid, col + 1, row);
        helper(grid, col, row - 1);
        helper(grid, col - 1, row);
    }

    public static void main(String[] args) {

    }
}
