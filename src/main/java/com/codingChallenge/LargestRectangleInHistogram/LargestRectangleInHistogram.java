package com.codingChallenge.LargestRectangleInHistogram;

import java.util.*;

public class LargestRectangleInHistogram {

    public static int largestRectangleArea(int[] heights) {
        int maxValue = 0;
        Stack<Integer> leftSide = new Stack<>();
        Stack<Integer> rightSide = new Stack<>();
        int[] width = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            while (!leftSide.isEmpty() && heights[leftSide.peek()] >= heights[i]) {
                leftSide.pop();
            }

            if (leftSide.isEmpty()) width[i] = i + 1;
            else width[i] = i - leftSide.peek();

            leftSide.push(i);
        }

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!rightSide.isEmpty() && heights[rightSide.peek()] >= heights[i]) {
                rightSide.pop();
            }

            if (rightSide.isEmpty()) width[i] += heights.length - i - 1;
            else width[i] += rightSide.peek() - i - 1;

            rightSide.push(i);
        }

        for (int i = 0; i < heights.length; i++) {
            int rectArea = heights[i] * width[i];
            maxValue = Math.max(rectArea, maxValue);
        }
        return maxValue;
    }

    public static void main(String[] args) {

    }
}
