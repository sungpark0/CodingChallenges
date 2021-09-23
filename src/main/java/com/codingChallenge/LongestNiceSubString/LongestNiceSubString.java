package com.codingChallenge.LongestNiceSubString;

import java.util.*;

public class LongestNiceSubString {

    public static String longestNiceSubstring(String s) {
        if (s.length() <= 1) return "";

        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (set.contains(Character.toLowerCase(ch)) && set.contains(Character.toUpperCase(ch))) continue;

            String str1 = longestNiceSubstring(s.substring(0, i));
            String str2 = longestNiceSubstring(s.substring(i + 1));

            return str1.length() >= str2.length() ? str1 : str2;
        }

        return s;
    }
// public String longestNiceSubString(String s) {
//    String longestStr = "";
//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i; j <= s.length(); j++) {
//                 if (isNice(s.substring(i, j))) {
//                     longestStr = longestStr.length() < j - i ? s.substring(i, j) : longestStr;
//                 }
//             }
//         }

//         return longestStr;
//     }

//     public boolean isNice(String str) {
//         int[] upperCase = new int[26];
//         int[] lowerCase = new int[26];

//         for (char ch : str.toCharArray()) {
//             if (Character.isUpperCase(ch)) {
//                 upperCase[Character.toLowerCase(ch) - 'a']++;
//             } else lowerCase[ch - 'a']++;
//         }

//         for (int i = 0; i < upperCase.length; i++) {
//             if ((upperCase[i] > 0 && lowerCase[i] > 0) || (upperCase[i] == 0 && lowerCase[i] == 0)) continue;
//             else return false;
//         }

//         return true;
//     }

//    public String longestNiceSubString(String s) {
//         if (s.length() <= 1) return "";

//         String str = "";
//         String temp = "";

//         int startingIndex = 0;
//         int endingIndex = 0;

//         while (endingIndex < s.length() - 1) {
//             char ch = s.charAt(startingIndex);

//             if (Character.isLowerCase(ch)) {
//                 while (ch == Character.toLowerCase(s.charAt(endingIndex)) && endingIndex < s.length() - 1) {
//                     temp += s.charAt(endingIndex);
//                     endingIndex++;
//                 }

//                 if (temp.contains(Character.toUpperCase(ch) + "")) {
//                     str = str.length() < temp.length() ? temp : str;
//                 }

//             } else {
//                 while (ch == Character.toUpperCase(s.charAt(endingIndex)) && endingIndex < s.length() - 1) {
//                     temp += s.charAt(endingIndex);
//                     endingIndex++;
//                 }

//                 if (temp.contains(Character.toLowerCase(ch) + "")) {
//                     str = str.length() < temp.length() ? temp : str;
//                 }
//             }

//             temp = "";
//             startingIndex++;
//         }

//         System.out.println(endingIndex + " " + s.length() + " " + startingIndex);

//         return str;
//}

    public static void main(String[] args) {

    }
}
