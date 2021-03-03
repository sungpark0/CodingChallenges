package com.codingChallenge.MinimumAbsoluteDifference;

import java.util.*;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {

        int[] test = {-14, -10, -4, 3, 8, 19, 23, 27};

        System.out.println(minimumAbsDifference(test));
        System.out.println(minimumAbsDifferenceII(test));
    }

    public static List<List<Integer>> minimumAbsDifferenceII(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int minimumDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            minimumDiff = Math.min(minimumDiff, (arr[i + 1] - arr[i]));
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minimumDiff) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return result;
    }


    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();
        int absMin = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            absMin = Math.min(absMin, Math.abs(arr[i + 1] - arr[i]));
        }

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j + 1] - arr[j] == absMin) {
                result.add(Arrays.asList(arr[j], arr[j + 1]));
            }
        }

        return result;
    }
}
