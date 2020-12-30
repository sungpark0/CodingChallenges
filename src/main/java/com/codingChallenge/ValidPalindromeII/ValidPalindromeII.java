package com.codingChallenge.ValidPalindromeII;

public class ValidPalindromeII {
    public static void main(String[] args) {
        String str = "aba";
        String fStr = "eeccccbebaeeabebccceea";
        System.out.println(validPalindrome(fStr));
    }

    public static boolean validPalindrome(String s) {
        if (s.length() == 1) return true;
        int left = 0;
        int right = s.length() - 1;
        char[] ch = s.toCharArray();
        while (left < right) {
            if (ch[left] == ch[right]) {
                left++;
                right--;
            } else return validPalindromeRecursive(ch, left + 1, right) || validPalindromeRecursive(ch, left, right - 1);
        }

        return true;
    }

    public static boolean validPalindromeRecursive(char[] sChar, int left, int right) {
        while (left < right) {
            if (sChar[left] == sChar[right]) {
                left++;
                right--;
            } else return false;
        }
        return true;
    }
}
