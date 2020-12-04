package com.rootbyos.springboot.CountNumberOfTeams;

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
}
