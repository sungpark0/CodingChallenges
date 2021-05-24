package com.codingChallenge.PairsOfSongsWithTotalDurationsDivisibleBy60;

import java.util.*;

public class PairsOfSongsWithTotalDurationsDivisibleBy60 {

    public static int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int t : time) {
            result += map.getOrDefault((60 - t % 60) % 60, 0);
            map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
        }

        return result;
    }

    public int numPairsDivisibleBy60II(int[] time) {
        int[] count = new int[60];
        int result = 0;

        for (int t : time) {
            if (t % 60 == 0) result += count[0];
            else result += count[60 - t % 60];

            count[t % 60]++;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
