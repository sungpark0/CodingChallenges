package com.codingChallenge.DIStringMatch;

public class DIStringMatch {

    public static int[] diStringMatch(String s) {
        int[] arr = new int[s.length() + 1];

        int max = s.length();
        int min = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') arr[i] = min++;
            else arr[i] = max--;
        }

        arr[s.length()] = min;

        return arr;
    }

    public static void main(String[] args) {

    }
}
