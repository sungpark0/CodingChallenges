package com.codingChallenge.VerifyingAnAlienDictionary;

public class VerifyingAnAlienDictionary {

    public static boolean isAlienSorted(String[] words, String order) {

        for (int i = 0; i < words.length - 1; i++) {
            boolean check = true;

            String curr = words[i];
            String next = words[i + 1];

            for (int j = 0; j < Math.min(curr.length(), next.length()); j++) {
                if (curr.charAt(j) != next.charAt(j)) {
                    check = false;
                    if (order.indexOf(next.charAt(j)) < order.indexOf(curr.charAt(j))) return false;

                    break;
                }
            }
            if (check && curr.length() > next.length()) return false;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
