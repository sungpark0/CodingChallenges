package com.codingChallenge.CustomSortedArray;

import java.util.Arrays;
import java.util.List;

/**
 * In an array, elements at any two indices can be swapped in a single operation called a move. For example,
 * if the array is arr = [17, 4, 8], swap arr[0]= 17 and arr[2] = 8 to get arr' = [8, 4, 17] in a single move.
 * Determine the minimum number of moves required to sort an array such that all of the even elements are at the
 * beginning of the array and al of the odd elements are at the end of the array.
 * <p>
 * Example:
 * arr = [6, 3, 4, 5]
 * <p>
 * The following four arrays are valid custom-sorted arrays:
 * a = [6, 4, 3, 5]
 * a = [4, 6, 3, 5]
 * a = [6, 4, 5, 3]
 * a = [4, 6, 5, 3]
 * <p>
 * The most efficient sorting required 1 move: swap the 4 and the 3.
 */
public class CustomSortedArray {

    public static int moves(List<Integer> arr) {
        int evens = 0;
        int odds = 0;
        int mid = arr.size() / 2;

        for (int i = 0; i < mid; i++) {
            if (arr.get(i) % 2 != 0) odds++;
        }
        for (int i = mid; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) evens++;
        }

        return (odds + evens) / 2;
    }

    public static void main(String[] args) {
        System.out.println(moves(List.of(6, 3, 4, 5)));
        System.out.println(moves(List.of(4, 13, 10, 21, 20)));
        System.out.println(moves(List.of(5, 8, 5, 11, 4, 6)));
    }
}
