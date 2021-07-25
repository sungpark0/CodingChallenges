package com.codingChallenge.StringCompression;

public class StringCompression {

    public static int compress(char[] chars) {
        if (chars.length == 1) return 1;

        int index = 0;
        int counter = 0;

        while (index < chars.length) {
            int curr = index;
            while (curr < chars.length && chars[index] == chars[curr]) {
                curr++;
            }
            chars[counter] = chars[index];
            counter++;
            if (curr - index > 1) {
                String count = String.valueOf(curr - index);
                for (char ch : count.toCharArray()) {
                    chars[counter] = ch;
                    counter++;
                }
            }

            index = curr;
        }

        return counter;
    }

    public static void main(String[] args) {

    }
}
