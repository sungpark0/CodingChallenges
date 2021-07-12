package com.codingChallenge.SortColors;

import java.util.*;

public class SortColors {

    public static void sortColors(int[] nums) {
        List<Integer> red = new ArrayList<>();
        List<Integer> white = new ArrayList<>();
        List<Integer> blue = new ArrayList<>();

        for (int num : nums) {
            if (num == 0) red.add(0);
            else if (num == 1) white.add(1);
            else blue.add(2);
        }

        int index = 0;

        while (index < red.size()) {
            nums[index] = red.get(index);
            index++;
        }

        int whiteIndex = 0;

        while (whiteIndex < white.size()) {
            nums[index] = white.get(whiteIndex);
            whiteIndex++;
            index++;
        }

        int blueIndex = 0;

        while (blueIndex < blue.size()) {
            nums[index] = blue.get(blueIndex);
            blueIndex++;
            index++;
        }
    }

    public static void main(String[] args) {

    }
}
