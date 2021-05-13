package com.codingChallenge.RottingOranges;

import java.util.*;

public class RottingOranges {

    public static int orangesRotting(int[][] grid) {
        int minutes = 0;
        int fresh = 0;
        Queue<int[]> rotten = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) fresh++;
                else if (grid[i][j] == 2) rotten.add(new int[]{i, j});
            }
        }

        if (fresh == 0) return 0;

        while (!rotten.isEmpty()) {
            int size = rotten.size();
            for (int i = 0; i < size; i++) {
                int[] temp = rotten.poll();
                if (temp != null && temp[1] + 1 <= grid[0].length - 1 && grid[temp[0]][temp[1] + 1] == 1) {
                    grid[temp[0]][temp[1] + 1] = 2;
                    rotten.offer(new int[]{temp[0], temp[1] + 1});
                    fresh--;
                }
                if (temp != null && temp[0] - 1 >= 0 && grid[temp[0] - 1][temp[1]] == 1) {
                    grid[temp[0] - 1][temp[1]] = 2;
                    rotten.offer(new int[]{temp[0] - 1, temp[1]});
                    fresh--;
                }
                if (temp != null && temp[1] - 1 >= 0 && grid[temp[0]][temp[1] - 1] == 1) {
                    grid[temp[0]][temp[1] - 1] = 2;
                    rotten.offer(new int[]{temp[0], temp[1] - 1});
                    fresh--;
                }
                if (temp != null && temp[0] + 1 <= grid.length - 1 && grid[temp[0] + 1][temp[1]] == 1) {
                    grid[temp[0] + 1][temp[1]] = 2;
                    rotten.offer(new int[]{temp[0] + 1, temp[1]});
                    fresh--;
                }
            }

            if (rotten.size() > 0) minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) {

    }
}
