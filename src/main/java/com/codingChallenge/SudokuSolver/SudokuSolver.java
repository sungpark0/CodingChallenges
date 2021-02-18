package com.codingChallenge.SudokuSolver;

public class SudokuSolver {
    public static void solveSudoku(char[][] board) {

        if (board == null) return ;

        solve(board);
    }

    //
    public static boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (validChecker(board, i, j, num)) {
                            board[i][j] = num;
                            if (solve(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    //Recursion for checking if the num is valid through row, column and small 3*3 box
    public static boolean validChecker(char[][] board, int row, int column, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) return false;
            if (board[i][column] == num) return false;
            if (board[(row / 3) * 3 + i % 3][(column / 3) * 3 + i / 3] == num) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
