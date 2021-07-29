package com.codingChallenge.RomanToInteger;

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {

        String se = "MC"; //should be 1994 output 2214
        System.out.println(romanToInt(se));
        System.out.println(romanToIntII(se));
    }

    public static int romanToInt(String s) {
        int total = 0;
        char[] ch = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000); // Initializing each roman letters to #'s

        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(ch[i]) < map.get(ch[i + 1])) {
                total -= map.get(ch[i]);
            } else total += map.get(ch[i]);
        }

        return total + map.get(ch[s.length() - 1]);
    }

    public static int romanToIntII(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
            i++;
        }

        return sum;
    }

    public static int romanToIntIII(String s) {
        Map<Character, Integer> map = new HashMap<>(
                Map.of(
                        'I', 1,
                        'V', 5,
                        'X', 10,
                        'L', 50,
                        'C', 100,
                        'D', 500,
                        'M', 1000
                ));

        int intValue = map.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            intValue += map.get(s.charAt(i));
            if (map.get(s.charAt(i - 1)) < map.get(s.charAt(i)) && (s.charAt(i - 1) == 'I' || s.charAt(i - 1) == 'X' || s.charAt(i - 1) == 'C')) {
                intValue -= (map.get(s.charAt(i - 1)) * 2);
            }
        }

        return intValue;
    }


}

