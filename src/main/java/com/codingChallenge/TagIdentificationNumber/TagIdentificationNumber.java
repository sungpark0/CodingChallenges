package com.codingChallenge.TagIdentificationNumber;

import java.util.Stack;

/**
 * A company identifies its employees using a Tag Identification Number(TID) that is 11 digits long and fits the
 * pattern "8xxxxxxxxxx" where each "x" is replaced by a digit. Determine the maximum number of TIDs that can be
 * simultaneously formed from a pool of n digits. if no TIDs can be generated, return 0.
 * <p>
 * Note that TIDs do not have to be unique and do not have to be formed in the same order of digits given in the pool.
 * For example, "8111111111181111111111" can make two TIDs, each being "81111111111".
 */

public class TagIdentificationNumber {

    public static int numOfIds(String pool) {
        if (pool.length() < 11) return 0;

        Stack<Character> stack = new Stack<>();

        for (char ch : pool.toCharArray()) {
            if (ch == '8') stack.add(ch);
        }

        int leftOverLength = pool.length() / 11;

        if (stack.isEmpty()) return 0;
        else if (stack.size() > leftOverLength) return leftOverLength;

        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(numOfIds("31434343535"));
        System.out.println(numOfIds("888888555555555555555"));
        System.out.println(numOfIds("0011223344556677889988"));
    }
}
