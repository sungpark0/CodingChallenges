package com.rootbyos.springboot.LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"cir", "car"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        if (strs.length == 1) return strs[0];

        char[] firstWordArr = strs[0].toCharArray();
        int minValue = Integer.MAX_VALUE;

        int shortest = shortestLength(strs);

        for (int i = 1; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            int counter = 0;

            for (int j = 0; j < shortest; j++) {
                if (firstWordArr[j] == temp[j] && minValue > counter) counter++;
                else break;
            }

            minValue = Math.min(minValue, counter);
        }

        return minValue > shortest? "" : strs[0].substring(0, minValue);
    }

    public static int shortestLength(String[] strs) {
        int shortest = strs[0].length();

        for (String str : strs) {
            shortest = Math.min(str.length(), shortest);
        }

        return shortest;
    }
}
