package com.rootbyos.springboot.SortingOddNumbers;

/**
 * You have an array of numbers.
 * Your task is to sort ascending odd numbers but even numbers must be on their places.
 * <p>
 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
 * <p>
 * Example
 * <p>
 * sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOddNumbers {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 3, 2, 8, 1, 4};
        System.out.println(Arrays.toString(sortOdds(arr)));


        Arrays.stream(sortOdds(arr)).forEach(v -> System.out.print(v));
    }


    public static int[] sortOdds(int[] arr) {
        if (arr.length == 0) {
            return new int[]{};
        }
//        int[] placeHolder = new int[]{1,2,3,4}; //

//        List<Integer> placeHolder = List.of(1,2,3,5);
        List<Integer> placeHolder = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 != 0) {
                placeHolder.add(arr[i]);
                indexes.add(i);
                // [0, 1, 5 ]
            }
        }

        List<Integer> sorted = placeHolder.stream().sorted().collect(Collectors.toList()); //sorting odd numbers in order nlogn

//        sorted = [1, 3, 5]
        for (int i = 0; i < indexes.size(); i++) { //replacing odd numbers
            // indexes = [0, 1, 5]
            // sorted =  [1, 3, 5]
            arr[indexes.get(i)] = sorted.get(i);
        }
//        System.out.println( Arrays.toString( arr ) ); //[1, 3, 2, 8, 5, 4]
        return arr;
    }

}
