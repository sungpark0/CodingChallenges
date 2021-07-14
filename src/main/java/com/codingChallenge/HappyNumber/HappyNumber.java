package com.codingChallenge.HappyNumber;

import java.util.*;

public class HappyNumber {

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (true) {
            int happyNum = convert(n);
            n = happyNum;
            if (happyNum == 1) return true;
            if (set.contains(n)) break;
            else set.add(n);
        }

        return false;
    }

    public static Integer convert(int n) {
        int sum = 0;

        while (n > 0) {
            sum = sum + (n % 10) * (n % 10);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
