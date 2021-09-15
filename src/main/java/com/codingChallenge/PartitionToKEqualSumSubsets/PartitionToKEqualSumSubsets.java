package com.codingChallenge.PartitionToKEqualSumSubsets;

public class PartitionToKEqualSumSubsets {

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;

        for (int num : nums) sum += num;

        if (sum % k != 0) return false;

        int targetSum = sum / k;
        boolean[] visited = new boolean[nums.length];

        return backtrack(nums, visited, 0, k, 0, targetSum);
    }

    public static boolean backtrack(int[] arr, boolean[] visited, int index, int k, int currSum, int targetSum) {
        if (k == 0) return true;

        if (targetSum == currSum) return backtrack(arr, visited, 0, k - 1, 0, targetSum);

        for (int i = index; i < arr.length; i++) {
            if (!visited[i] && currSum + arr[i] <= targetSum) {
                visited[i] = true;

                if (backtrack(arr, visited, i + 1, k, currSum + arr[i], targetSum)) return true;

                visited[i] = false;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
