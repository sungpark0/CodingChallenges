package com.codingChallenge.GreatestCommonDivisorOfStrings;

public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {

        String strOne = "ABCDABCDABCD";
        String strTwo = "ABCD";
        System.out.println(gcdOfStrings(strOne, strTwo));
    }

    public static String gcdOfStrings(String str1, String str2) {
        //GCD must exist. str2 should be sub string of str1. str1 must be a multiple of str2
        //return substring of str2 0 to GCD value. str1 ABABAB str2 ABAB -> answer AB because gcd is 2

        int gcdVal = gcd(str1.length(), str2.length());

        if (!(str1 + str2).equals(str2 + str1)) return "";
        return str2.substring(0, gcdVal);
    }

    public static int gcd(int x, int y) {
        //recursion to get the greatest common divisor. (6, 4) = 2
        if (x == 0) {
            return y;
        }
        return gcd(y % x, x);
    }

    public static String gcdOfStringsII(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";

        return str2.substring(0, gcdII(str1.length(), str2.length()));
    }

    public static int gcdII(int x, int y) {
        if (x == 0) return y;
        return gcd(y % x, x);
    }
}
