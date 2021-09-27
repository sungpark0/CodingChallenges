package com.codingChallenge.MaxConsectuiveOnesIII;

public class MaxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {
        int longest = 0;
        int startingIndex = 0;
        int currentIndex = 0;
        int counter = 0;

        while (currentIndex < nums.length) {
            if (nums[currentIndex] == 0) {
                while (counter + 1 > k) {
                    if (nums[startingIndex] == 0) {
                        counter--;
                    }
                    startingIndex++;
                }
                counter++;
            }
            longest = Math.max(longest, currentIndex - startingIndex + 1);
            currentIndex++;
        }

        return longest;
    }

    public static void main(String[] args) {

    }
}
