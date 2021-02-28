package com.codingChallenge.CountNumberOfTeams;

import java.util.*;

public class CountNumberOfTeams {
    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 4, 1};
        System.out.println(numTeams(arr));
    }

    public static int numTeams(int[] rating) {
        int counter = 0;

        for (int i = 0; i < rating.length; i++) {
            for (int j = i + 1; j < rating.length; j++) {
                for (int k = j + 1; k < rating.length; k++) {
                    if (rating[i] < rating[j] && rating[j] < rating[k]) {
                        counter++;
                    }
                    if (rating[i] > rating[j] && rating[j] > rating[k]) {
                        counter++;
                    }
                }
            }
        }

        return counter;
    }

    public int numTeamsII(int[] rating) {
        List<Integer> valueToHigh = new ArrayList<>();
        List<Integer> indexesToHigh = new ArrayList<>();
        List<Integer> valueToLow = new ArrayList<>();
        List<Integer> indexesToLow = new ArrayList<>();
        int counter = 0;
        int indexForHigh = 0;
        int indexForLow = 0;

        for (int i = 0; i < rating.length; i++) {
            for (int j = i + 1; j < rating.length; j++) {
                if (rating[i] < rating[j]) {
                    valueToHigh.add(rating[j]);
                    indexesToHigh.add(j);
                    indexForHigh++;
                } else if (rating[i] > rating[j]) {
                    valueToLow.add(rating[j]);
                    indexesToLow.add(j);
                    indexForLow++;
                }
            }
        }

        for (int i = 0; i < rating.length; i++) {
            for (int j = 0; j < valueToHigh.size(); j++) {
                if (rating[i] > valueToHigh.get(j) && i > indexesToHigh.get(j)) {
                    counter++;
                }
            }
        }

        for (int i = 0; i < rating.length; i++) {
            for (int j = 0; j < valueToLow.size(); j++) {
                if (rating[i] < valueToLow.get(j) && i > indexesToLow.get(j)) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public int numTeamsFaster(int[] rating) {
        int counter = 0;

        for (int i = 1; i < rating.length - 1; i++) {
            int leftLess = 0;
            int rightGreater = 0;
            int leftGreater = 0;
            int rightLess = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (rating[i] > rating[j]) {
                    leftLess++;
                } else {
                    leftGreater++;
                }
            }

            for (int j = i + 1; j < rating.length; j++) {
                if (rating[i] < rating[j]) {
                    rightGreater++;
                } else {
                    rightLess++;
                }
            }
            System.out.println(leftLess + " leftLess");
            System.out.println(rightGreater + " rightGreater");
            System.out.println(leftGreater + " leftGreater");
            System.out.println(rightLess + " rightLess");

            counter += (leftLess * rightGreater) + (leftGreater * rightLess);
            System.out.println(counter + " counter");
        }

        return counter;
    }
}
