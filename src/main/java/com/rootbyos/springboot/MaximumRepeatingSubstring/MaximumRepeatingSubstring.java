package com.rootbyos.springboot.MaximumRepeatingSubstring;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {

        String c = "ababc";
        String d = "ab";
        System.out.println(maxRepeating(c, d));
    }

    public static int maxRepeating(String sequence, String word) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();

        while (sequence.contains(sb)) {
            sb.append(word);
            counter++;
        }

        return counter - 1;
    }

}
