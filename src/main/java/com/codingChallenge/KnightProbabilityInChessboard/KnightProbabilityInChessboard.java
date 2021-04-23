package com.codingChallenge.KnightProbabilityInChessboard;

public class KnightProbabilityInChessboard {

    public static double knightProbability(int N, int K, int r, int c) {
        int[][] possibleMoves = new int[][]{{-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}};
        double[][] dp = new double[N][N];
        double result = 0.0;
        double factor = 8.0;
        dp[r][c] = 1;

        for (int i = 0; i < K; i++) {
            double[][] temp = new double[N][N];
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    if (dp[row][col] > 0.0) {
                        for (int[] possibleMove : possibleMoves) {
                            int nRow = row + possibleMove[0];
                            int nCol = col + possibleMove[1];
                            if (nRow >= 0 && nRow < N && nCol >= 0 && nCol < N) {
                                temp[nRow][nCol] += dp[row][col] / factor;

                            }
                        }
                    }
                }
            }
            dp = temp;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) result += dp[i][j];
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
