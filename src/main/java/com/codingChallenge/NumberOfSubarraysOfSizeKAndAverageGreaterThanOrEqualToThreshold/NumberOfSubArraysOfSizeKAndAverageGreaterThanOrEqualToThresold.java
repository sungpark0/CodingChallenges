package com.codingChallenge.NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold;

public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThresold {

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int counter = 0;
        int startingIndex = 0;
        int currentIndex = 0;
        int sum = 0;

        while (currentIndex < arr.length) {
            sum += arr[currentIndex];

            if (currentIndex - startingIndex + 1 >= k) {
                counter = sum / k >= threshold ? counter + 1 : counter;
                sum -= arr[startingIndex];
                startingIndex++;
            }

            currentIndex++;
        }

        return counter;
    }

    public static void main(String[] args) {

    }
}
