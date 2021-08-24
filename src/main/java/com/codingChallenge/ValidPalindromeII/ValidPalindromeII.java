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
            } else
                return validPalindromeRecursive(ch, left + 1, right) || validPalindromeRecursive(ch, left, right - 1);
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

    public static boolean validPalindromeII(String s) {
        return helper(s, 0, 0, s.length() - 1);
    }

    public static boolean helper(String s, int count, int start, int end) {
        if (count > 1) return false;

        while (start < end && s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
        }

        if (start >= end) return true;

        return helper(s, count + 1, start + 1, end) || helper(s, count + 1, start, end - 1);
    }

}
