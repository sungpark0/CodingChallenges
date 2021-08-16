package com.codingChallenge.BoatsToSavePeople;

import java.util.Arrays;

public class BoatsToSavePeople {

    public static int numRescueBoats(int[] people, int limit) {
        int numOfBoats = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;

        while (i <= j) {
            if (people[i] + people[j] > limit) {
                j--;
            } else {
                i++;
                j--;
            }
            numOfBoats++;
        }

        return numOfBoats;
    }

    public static int numRescueBoatsII(int[] people, int limit) {
        Arrays.sort(people);

        int boats = 0;
        int i = 0;
        int j = people.length - 1;

        while (i <= j) {
            if (people[i] + people[j] > limit) {
                j--;
            } else {
                i++;
                j--;
            }
            boats++;
        }

        return boats;
    }

    public static void main(String[] args) {

    }
}
