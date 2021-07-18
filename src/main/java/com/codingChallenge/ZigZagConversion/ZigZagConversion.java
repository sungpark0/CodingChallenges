package com.codingChallenge.ZigZagConversion;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        int index = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < s.length(); j += index) {
                sb.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + index - i < s.length()) {
                    sb.append(s.charAt(j + index - i));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
