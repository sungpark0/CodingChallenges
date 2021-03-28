package com.codingChallenge.TwoKeysKeyboard;

import java.util.Arrays;

public class TwoKeysKeyboard {

    public static int minSteps(int n) {
        if (n == 1) return 0;

        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = i / 2; j > 1; j--) {
                if (i % j == 0) {
                    dp[i] = dp[j] + (i / j);
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(minSteps(6));
    }
}
