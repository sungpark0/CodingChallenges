package com.codingChallenge.LuckyNumbersInAMatrix;

import java.util.*;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {

        int[][] test = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        System.out.println(luckyNumbers(test));
        System.out.println(luckyNumbersII(test));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> results = new ArrayList<>();
        Map<Integer, Integer> tempMap = new HashMap<>(); // just a placeholder

        // Finding min values Indexes for each row
        for (int row = 0; row < matrix.length; row++) {
            int minValue = Integer.MAX_VALUE;
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] < minValue) {
                    minValue = matrix[row][col];
                    tempMap.put(row, col);
                }
            }
        }

        //elements(values) of those min values indexes
        int[] minIndexes = tempMap.values().stream().mapToInt(i -> i).toArray();
        int[] minNumbers = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            minNumbers[i] = (matrix[i][minIndexes[i]]);
        }

        //clear the map. Find max values indexes for each column
        tempMap.clear();
        for (int i = 0; i < matrix[0].length; i++) { //4
            int maxV = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) { //3
                if (maxV < matrix[j][i]) {
                    maxV = matrix[j][i];
                    tempMap.put(i, j);
                }
            }
        }

        //elements(values) of those max values indexes
        int[] maxIndexes = tempMap.values().stream().mapToInt(i -> i).toArray();
        int[] maxNumbers = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            maxNumbers[i] = (matrix[maxIndexes[i]][i]);
        }

        //Inputting minNumbers and maxNumbers to a map. If more than one put 1 as value otherwise 0.
        //True = 1/False = 0
        tempMap.clear();
        for (int num : minNumbers) {
            if (!tempMap.containsKey(num)) {
                tempMap.put(num, 0);
            } else {
                tempMap.put(num, 1);
            }
        }
        for (int num : maxNumbers) {
            if (!tempMap.containsKey(num)) {
                tempMap.put(num, 0);
            } else {
                tempMap.put(num, 1);
            }
        }

        //check if its true(value==1) to array
        int[] temp = tempMap.entrySet()
                .stream()
                .filter(v -> v.getValue() == 1)
                .map(Map.Entry::getKey)
                .mapToInt(i -> i)
                .toArray();

        //add the values of the array to list
        for (int num : temp) {
            results.add(num);
        }
        return results;
    }

    public static List<Integer> luckyNumbersII(int[][] matrix) {

        int col = 0;
        int result = Integer.MIN_VALUE;

        while (col < matrix.length) {
            int minRowIndex = 0;
            int maxColVal = Integer.MIN_VALUE;

            for (int rowIndex = 0; rowIndex < matrix[0].length; rowIndex++) {
                if (matrix[col][minRowIndex] > matrix[col][rowIndex]) {
                    // 0
                    minRowIndex = rowIndex;
                }
            }

            for (int[] ints : matrix) {
                maxColVal = Math.max(maxColVal, ints[minRowIndex]);
            }

            if (maxColVal == matrix[col][minRowIndex]) {
                result = maxColVal;
            }

            col++;
        }

        return result == Integer.MIN_VALUE ? List.of() : List.of(result);
    }
}
