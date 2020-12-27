package com.codingChallenge.LargestSubstringBetweenTwoEqualCharacters;

import java.util.*;


public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
        String s = "mgntdygtxrvxjnwksqhxuxtrv";
        System.out.println(maxLengthBetweenEqualCharacters(s));
        System.out.println(maxLengthBetweenEqualCharactersOptimal(s));

    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        char[] ch = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        int bigNumb = Integer.MIN_VALUE;

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && bigNumb < j - i) {
                    bigNumb = j - i;
                    list.clear();
                    list.add(i);
                    list.add(j);
                }
            }
        }

        if (list.isEmpty()) {
            return -1;
        }

        return (list.get(1)-list.get(0))-1;
    }

    public static int maxLengthBetweenEqualCharactersOptimal(String s) {

        int result = -1;
        for (int i = 0; i < s.length()-1; i++) {
            int lastIndex = s.lastIndexOf(s.charAt(i));
            result = Math.max(result, lastIndex - i);
        }

        return result - 1;
    }
}
