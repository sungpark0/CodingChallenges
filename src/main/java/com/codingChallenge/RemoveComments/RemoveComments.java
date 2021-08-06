package com.codingChallenge.RemoveComments;

import java.util.*;

public class RemoveComments {
    public static List<String> removeComments(String[] source) {
        List<String> sourceCode = new ArrayList<>();
        boolean check = false;
        StringBuilder sb = new StringBuilder();

        for (String str : source) {
            boolean comment = false;
            for (int j = 0; j < str.length(); j++) {
                if (!check && str.charAt(j) == '/' && j + 1 < str.length() && str.charAt(j + 1) == '/') {
                    comment = true;
                    break;
                } else if (!check && str.charAt(j) == '/' && j + 1 < str.length() && str.charAt(j + 1) == '*') {
                    check = true;
                    j++;
                } else if (check && str.charAt(j) == '*' && j + 1 < str.length() && str.charAt(j + 1) == '/') {
                    check = false;
                    j++;
                } else {
                    if (!check) sb.append(str.charAt(j));
                }
            }

            if (!check) {
                if (sb.length() > 0) {
                    sourceCode.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }

        return sourceCode;
    }

    public static void main(String[] args) {

    }
}
