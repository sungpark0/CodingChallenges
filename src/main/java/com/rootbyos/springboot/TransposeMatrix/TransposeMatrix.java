package com.rootbyos.springboot.TransposeMatrix;

import java.util.*;

public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(transpose(arr)));

    }

    public static int[][] transpose(int[][] A) {
        int row = A.length;
        int column = A[0].length;
        int[][] result = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}
