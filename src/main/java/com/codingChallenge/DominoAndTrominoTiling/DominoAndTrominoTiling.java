package com.codingChallenge.DominoAndTrominoTiling;

public class DominoAndTrominoTiling {

    public static int numTilings(int N) {
        if (N < 3) return N;

        int mod = 1000000007;
        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {
            dp[i] = ((2 * dp[i - 1]) % mod + dp[i - 3] % mod) % mod;
        }

        return dp[N];
    }

    public static void main(String[] args) {
        System.out.println(numTilings(5));
    }
}
