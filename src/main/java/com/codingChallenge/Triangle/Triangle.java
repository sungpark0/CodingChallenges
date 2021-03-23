package com.codingChallenge.Triangle;

import java.util.*;

public class Triangle {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];

        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> currLevel = triangle.get(i);
            for (int j = 0; j < currLevel.size(); j++) {
                if (j == 0) {
                    dp[i][j] = currLevel.get(0) + dp[i - 1][j];
                } else if (j == currLevel.size() - 1) {
                    dp[i][j] = currLevel.get(currLevel.size() - 1) + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = currLevel.get(j) + Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                }
            }
        }

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < triangle.size(); i++) {
            result = Math.min(result, dp[triangle.size() - 1][i]);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(minimumTotal(
                List.of(
                        List.of(2),
                        List.of(3, 4),
                        List.of(6, 5, 7),
                        List.of(4, 1, 8, 3)
                )));
    }
}

