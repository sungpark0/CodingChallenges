package com.codingChallenge.LongestPalindromeSubstring;

public class LongestPalindromeSubstring {

    public static String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j >= 0; j--){
                if(i == j) dp[i][j] = true;
                else if(s.charAt(i) == s.charAt(j)){
                    if(i - j == 1 || dp[i - 1][j + 1]) dp[i][j] = true;
                }

                if (dp[i][j] && (i - j > end - start)) {
                    end = i;
                    start = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    public String longestPalindromeII(String s) {
        if(s.length() <= 1) return s;

        String result = "";
        for(int i = 0; i < s.length(); i++){
            String odd = pivotMiddle(s, i, i);
            String even = pivotMiddle(s, i, i + 1);
            if(odd.length() > result.length()) result = odd;
            if(even.length() > result.length()) result = even;
        }

        return result;
    }

    public String pivotMiddle(String s, int left, int right){

        String temp = s;

        while(left >= 0 && right <s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return temp.substring(left + 1, right);
    }
    public static void main(String[] args) {

    }
}
