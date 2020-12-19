package com.codingChallenge.ShuffleString;

import java.util.*;

public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indic = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(str, indic));
    }

    public static String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        char[] shuffled = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = ch[i];
        }
//        return Arrays.toString(result); //doesnt work because its still in array format
        return new String(shuffled);
    }

}
