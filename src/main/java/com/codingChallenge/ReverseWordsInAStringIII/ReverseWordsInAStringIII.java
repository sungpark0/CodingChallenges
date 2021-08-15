package com.codingChallenge.ReverseWordsInAStringIII;

public class ReverseWordsInAStringIII {

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        for (String str : s.split(" ")) {
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }

            sb.append(' ');
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
