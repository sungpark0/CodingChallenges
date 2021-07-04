package com.codingChallenge.LicenseKeyFormatting;

public class LicenseKeyFormatting {

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder formatted = new StringBuilder();
        char[] sChar = s.toUpperCase().toCharArray();
        int counter = 0;

        for (int i = sChar.length - 1; i >= 0; i--) {
            if (sChar[i] == '-') continue;
            if (counter == k) {
                formatted.append('-');
                counter = 0;
            }
            formatted.append(sChar[i]);
            counter++;
        }

        return formatted.reverse().toString();
    }

    public static void main(String[] args) {

    }
}
