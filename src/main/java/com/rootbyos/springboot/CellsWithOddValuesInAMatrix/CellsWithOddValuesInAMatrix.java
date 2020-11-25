package com.rootbyos.springboot.CellsWithOddValuesInAMatrix;

import java.util.*;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {

        int n = 2;
        int m = 3;
        int[][] indices = {{0, 1}, {1, 1}};
        System.out.println(oddCells(n, m, indices));
    }

    public static int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        int count = 0;
        for (int[] index : indices) {// rows first [[0][1]]
            for (int j = 0; j < m; j++) {
                matrix[index[0]][j] += 1; //++ doesnt work. +=1.
            }
            System.out.println(Arrays.deepToString(matrix));
        }
        for (int[] index : indices) { //columns [[1][1]]
            for (int j = 0; j < n; j++) {
                matrix[j][index[1]] += 1;
            }
            System.out.println(Arrays.deepToString(matrix));
        }

        for (int i = 0; i < n; i++) {//finding odd elements and incrementing by 1
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count += 1;
                }
            }
        }

        return count;
    }

}
