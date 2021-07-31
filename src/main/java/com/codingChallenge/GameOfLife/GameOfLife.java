package com.codingChallenge.GameOfLife;

public class GameOfLife {
    public static void gameOfLife(int[][] board) {
        int col = board.length, row = board[0].length;
        int[][] state = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                state[i][j] = helper(board, i, j, col, row);
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (board[i][j] == 1) {
                    if (state[i][j] < 2) board[i][j] = 0;
                    else if (state[i][j] > 3) board[i][j] = 0;
                } else if (state[i][j] == 3) board[i][j] = 1;
            }
        }

    }

    public static int helper(int[][] board, int x, int y, int col, int row) {
        int count = 0;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {-1, 1}, {-1, -1}, {1, -1}, {1, 1}};

        for (int[] dir : dirs) {
            int x1 = x + dir[0];
            int y1 = y + dir[1];
            if (x1 >= 0 && x1 < col && y1 >= 0 && y1 < row && board[x1][y1] == 1) count++;
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
