package com.codingChallenge.WordPattern;

import java.util.*;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        char[] patternChar = pattern.toCharArray();
        String[] strArr = s.split(" ");

        if (patternChar.length != strArr.length) return false;

        Map<String, Character> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            if (map.containsKey(strArr[i])) {
                if (map.get(strArr[i]) != (patternChar[i])) return false;
            } else if (map.containsValue(patternChar[i])) return false;

            map.put(strArr[i], patternChar[i]);
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
