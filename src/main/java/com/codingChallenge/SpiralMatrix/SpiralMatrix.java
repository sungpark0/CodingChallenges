package com.codingChallenge.SpiralMatrix;

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {

//        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arrTwo = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] arrThree = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//        int[][] arrFour = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
//        System.out.println(spiralOrderII(arr) + "\n[1, 2, 3, 6, 9, 8, 7, 4, 5]");
//        System.out.println(spiralOrder(arr) + "\n[1, 2, 3, 6, 9, 8, 7, 4, 5]");
//        System.out.println(spiralOrderII(arrTwo) + "\n[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]");
//        System.out.println(spiralOrder(arrTwo) + "\n[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]");
//        System.out.println(spiralOrderII(arrThree) + "\n[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]");
//        System.out.println(spiralOrder(arrThree) + "\n[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]");
//        System.out.println(spiralOrderII(arrFour) + "\n[1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8]");
//        System.out.println(spiralOrder(arrFour) + "\n[1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8]");
        System.out.println(spiralOrderIII(arrTwo) + "\n[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]");
//        System.out.println(spiralOrderIII(arrThree) + "\n[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]");

    }


    public static List<Integer> spiralOrderIII(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int leftToRight = 0;
        int topToBottom = 0;
        int rightToLeft = matrix[0].length - 1;
        int bottomToTop = matrix.length - 1;
        while (leftToRight <= bottomToTop && topToBottom <= rightToLeft) {

            for (int i = leftToRight; i <= rightToLeft; i++) {
                result.add(matrix[topToBottom][i]);
            }
            topToBottom++;

            if (topToBottom > bottomToTop) break;
            for (int i = topToBottom; i <= bottomToTop; i++) {
                result.add(matrix[i][rightToLeft]);
            }
            rightToLeft--;

            if (leftToRight > rightToLeft) break;
            for (int i = rightToLeft; i >= leftToRight; i--) {
                result.add(matrix[bottomToTop][i]);
            }
            bottomToTop--;

            for (int i = bottomToTop; i >= topToBottom; i--) {
                result.add(matrix[i][leftToRight]);
            }
            leftToRight++;

        }

        return result;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int leftToRight = 0; //
        int topToBottom = 0; //
        int rightToLeft = matrix[0].length - 1; // 3
        int bottomToTop = matrix.length - 1; // 3

        while (result.size() != (matrix.length * matrix[0].length)) {
            for (int i = leftToRight; i <= rightToLeft; i++) {
                result.add(matrix[topToBottom][i]);
            }
            topToBottom++;//1
            if (topToBottom > bottomToTop) break;

            for (int i = topToBottom; i <= bottomToTop; i++) {
                result.add(matrix[i][rightToLeft]);
            }
            rightToLeft--;//2
            if (rightToLeft < leftToRight) break;

            for (int i = rightToLeft; i >= leftToRight; i--) {
                result.add(matrix[bottomToTop][i]);
            }
            bottomToTop--;//2
            if (topToBottom > bottomToTop) break;

            for (int i = bottomToTop; i >= topToBottom; i--) {
                result.add(matrix[i][leftToRight]);
            }
            leftToRight++;//
            if (leftToRight > rightToLeft) break;
        }

        return result;

    }

    public static List<Integer> spiralOrderII(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int leftToRight = 0;
        int rightToLeft = matrix[0].length - 1;
        int topToBottom = 0;
        int bottomToTop = matrix.length - 1;

        while (leftToRight <= rightToLeft && topToBottom <= bottomToTop) {
            for (int i = leftToRight; i <= rightToLeft; i++) {
                list.add(matrix[topToBottom][i]);
            }
            topToBottom++;
            if (topToBottom > bottomToTop) break;

            for (int i = topToBottom; i <= bottomToTop; i++) {
                list.add(matrix[i][rightToLeft]);
            }
            rightToLeft--;
            if (rightToLeft < leftToRight) break;

            for (int i = rightToLeft; i >= leftToRight; i--) {
                list.add(matrix[bottomToTop][i]);
            }
            bottomToTop--;
            for (int i = bottomToTop; i >= topToBottom; i--) {
                list.add(matrix[i][leftToRight]);
            }
            leftToRight++;
        }

        return list;
    }
}

