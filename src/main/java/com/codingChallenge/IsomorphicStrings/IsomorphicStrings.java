package com.codingChallenge.IsomorphicStrings;

import java.util.*;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
//        Map<Character, Integer> sMap = new HashMap<>();
//        Map<Character, Integer> tMap = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            int sValue = sMap.getOrDefault(s.charAt(i), i);
//            int tValue = tMap.getOrDefault(t.charAt(i), i);
//
//            if (!Objects.equals(sMap.getOrDefault(s.charAt(i), i), tMap.getOrDefault(t.charAt(i), i))) return false;
//
//            sMap.put(s.charAt(i), i);
//            tMap.put(t.charAt(i), i);
//        }
//
//        return true;
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) return false;
                else map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

    }
}
