package com.rootbyos.springboot.MinimumAbsoluteDifference;

import java.util.*;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {

        int[] test = {4, 2, 1, 3};

        System.out.println( minimumAbsDifference( test ) );
    }


    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();
        int absMin = Integer.MAX_VALUE;
        Arrays.sort( arr );

        for (int i = 0; i < arr.length - 1; i++) {
            absMin = Math.min(absMin, Math.abs(arr[i + 1] - arr[i]));
        }

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j + 1] - arr[j] == absMin) {
                result.add( Arrays.asList( arr[j], arr[j + 1] ) );
            }
        }

        return result;
    }
}
