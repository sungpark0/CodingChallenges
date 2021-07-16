package com.codingChallenge.DecodeWays;

public class DecodeWays {

    public static int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            int one = Integer.parseInt(s.substring(i - 1, i));
            int two = Integer.parseInt(s.substring(i - 2, i));

            if (one > 0) dp[i] += dp[i - 1];
            if (two >= 10 && two <= 26) dp[i] += dp[i - 2];
        }

        return dp[dp.length - 1];
    }

    public static void main(String[] args) {

    }
}
