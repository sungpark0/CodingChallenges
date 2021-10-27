package com.codingChallenge.MaxAreaOfIsland;

public class MaxAreaOfIsland {

    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }

        return max;
    }

    public static int dfs(int[][] grid, int col, int row) {
        if (col < 0 || row < 0 || col >= grid.length || row >= grid[0].length || grid[col][row] == 0) return 0;

        grid[col][row] = 0;

        return 1 + dfs(grid, col + 1, row) + dfs(grid, col - 1, row) + dfs(grid, col, row + 1) + dfs(grid, col, row - 1);
    }

    public static void main(String[] args) {

    }
}
