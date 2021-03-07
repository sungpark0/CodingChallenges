package com.codingChallenge.SubsetSum;


import java.util.Arrays;

/**
 * Problem:
 * Given a set of positive numbers, determine if
 * there exists a subset whose sum is equal to a given number ‘S’.
 * <p>
 * Example 1.
 * Input: {1, 2, 3, 7}, S = 6
 * Output: True
 * The given set has a subset whose sum is '6': {1, 2, 3}
 * <p>
 * Example 2.
 * Input: {1, 2, 7, 1, 5}, S=10
 * Output: True
 * The given set has a subset whose sum is '10': {1, 2, 7}
 * <p>
 * Example 3.
 * Input: {1, 3, 4, 8}, S=6
 * Output: False
 * The given set does not have any subset whose sum is equal to '6'.
 */

public class SubsetSum {
    public static void main(String[] args) {
        int[] numsI = new int[]{1, 2, 3, 7};
        int[] numsII = new int[]{1, 2, 7, 1, 5};
        int[] numsIII = new int[]{1, 3, 4, 8};

        System.out.println(subsetSum(numsI, 6)); //true
//        System.out.println(subsetSum(numsII, 10)); //true
//        System.out.println(subsetSum(numsIII, 6)); //false
    }

    public static boolean subsetSum(int[] nums, int sum) {
//        nums = [1,2,3,7]
//        sum = 6
//        dp
//     row =   0, 1, 2, 3, 4, 5, 6
//      1    [ T  T  F  F  F  F  F ]
//      2    [ T  T  T  T  T       ]
//      3    [ T                   ]
//      7    [ T                   ]
//            0     1     2     3       4     5       6
//      1  [true, true, false, false, false, false, false]
//      2  [true, true, true,  true,  false, false, false]
//      3  [true, true, true,  true,  true,  true,  true]
//      7  [true, true, true,  true,  true,  true,  true]

        int numsLength = nums.length;
        boolean[][] dp = new boolean[numsLength][sum + 1];

        for (int i = 0; i < numsLength; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= sum; i++) {
            dp[0][i] = (nums[0] == i);
        }

        for (int i = 1; i < numsLength; i++) {
            for (int j = 1; j <= sum; j++) {
                // if we can get sum == j without nums[i]
                // assign
//                i-1 = 0
//                j = 4
                if (dp[i - 1][j]) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j >= nums[i]) {
                    dp[i][j] = dp[i - 1][j - nums[i]];
                }
                // if we need to include nums[i]
                // assign
            }
        }

        for (boolean[] j : dp) {
            System.out.println(Arrays.toString(j));
        }
        return dp[numsLength - 1][sum];
    }
}
