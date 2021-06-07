package com.codingChallenge.PointPuzzle;

import java.util.*;

/**
 * An escape game requires that players solve various puzzles to obtain objects that will aid them in escaping. In one
 * such puzzle, players are given an array of integers and a set of rules to follow in order. Here are the instructions
 * given to the players: "Given an array of integer values, maximize the points earned using the following method:
 * 1. Choose a value v. Delete all elements of that value and add their sum to the points.
 * 2. Delete all elements equal to v + 1 or v - 1 for no points
 * 3. Repeat steps 1 and 2 until there are no more elements in the array
 * <p>
 * Calculate the maximum number of points that can be achieved by following these rules for an array of values.
 * <p>
 * Example:
 * elements = [5, 6, 6, 4, 11]
 * Delete 11 for 11 points. Since there are no elements equal to 11 - 1 = 10 or 11 + 1 = 12, proceed with the remaining
 * elements: [5, 6, 6, 4]. Delete the two 6's for 12 more points. Delete any elements equal to 6 - 1 = 5 or 6 + 1 = 7.
 * Then proceed with the remaining elements: [4].
 * Finally delete the 4 and add 4 points for total points 11 + 12 + 4 = 27
 */
public class PointPuzzle {

    public static long maxPoints(List<Integer> elements) {
        long result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer element : elements) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        Collections.sort(elements);
        Set<Integer> set = new HashSet<>(elements);

        int[] arr = new int[set.size()];
        int i = set.size() - 1;
        for (int k : set) {
            arr[i] = k;
            i--;
        }

        for (int j = 0; j < arr.length - 1; j++) {
            result = result + ((long) map.get(arr[j]) * arr[j]);
            if (arr[j + 1] == arr[j] - 1) j++;
        }

        result = result + ((long) map.get(arr[arr.length - 1]) * arr[arr.length - 1]);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> caseOne = new ArrayList<>();
        caseOne.add(5);
        caseOne.add(6);
        caseOne.add(6);
        caseOne.add(4);
        caseOne.add(11);
        System.out.println(maxPoints(caseOne));
        List<Integer> caseTwo = new ArrayList<>();
        caseTwo.add(3);
        caseTwo.add(3);
        caseTwo.add(4);
        caseTwo.add(2);
        System.out.println(maxPoints(caseTwo));
    }
}
