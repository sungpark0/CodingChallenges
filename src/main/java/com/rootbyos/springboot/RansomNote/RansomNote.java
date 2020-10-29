package com.rootbyos.springboot.RansomNote;

import java.util.*;

public class RansomNote {

    public static void main(String[] args) {

        String ransom = "aa";
        String magazine = "aab";
        canConstruct( ransom, magazine );
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        char[] ransomArr = ransomNote.toCharArray();
        char[] magArr = magazine.toCharArray();
        char[] result = new char[ransomArr.length];

        for (int i = 0; i < ransomArr.length; i++) {
            for (int j = 0; j < magArr.length; j++) {
                if (ransomArr[i] == magArr[j]) {
                    result[i] = ransomArr[i];
                    magArr[j] = 0;
                    break;
                }
            }
        }


        return Arrays.equals( result, ransomArr );
    }

    public static boolean canConstructReplaceMethod(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int magLength = magazine.length();

        for (char ele : ransomNote.toCharArray()) {
            String str = String.valueOf( ele );
            magazine = magazine.replaceFirst( str, "" );
        }

        return magLength == magazine.length() + ransomNote.length();
    }

    public static boolean canConstructTwo(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char ele : magazine.toCharArray()) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }
        }

        for (char ele : ransomNote.toCharArray()) {
            if (map.containsKey(ele)) {
                if (map.get(ele) <= 0) {
                    return false;
                }
                map.put(ele, map.get(ele) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
