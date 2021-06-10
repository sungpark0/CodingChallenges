package com.codingChallenge.MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts;

import java.util.Arrays;

public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {

    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        long maxHorizontal = horizontalCuts[0];
        long maxVertical = verticalCuts[0];

        for (int i = 1; i < horizontalCuts.length; i++) {
            maxHorizontal = Math.max(maxHorizontal, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        maxHorizontal = Math.max(maxHorizontal, h - horizontalCuts[horizontalCuts.length - 1]);

        for (int i = 1; i < verticalCuts.length; i++) {
            maxVertical = Math.max(maxVertical, verticalCuts[i] - verticalCuts[i - 1]);
        }
        maxVertical = Math.max(maxVertical, w - verticalCuts[verticalCuts.length - 1]);

        long result = (maxHorizontal * maxVertical % 1000000007);

        return (int) result;
    }

    public static void main(String[] args) {

    }
}
