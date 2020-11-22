package com.rootbyos.springboot.IslandPerimeter;

public class IslandPerimeter {
    public static void main(String[] args) {

        int[][] test = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(islandPerimeter(test));
    }

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int[] ints : grid) { //if it is an island count +4 for each side
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] == 1) {
                    perimeter += 4;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) { //check if the immediate right and bottom is also an island. if they are -=2
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        perimeter -= 2;
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}
