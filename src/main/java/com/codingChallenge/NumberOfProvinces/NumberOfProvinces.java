package com.codingChallenge.NumberOfProvinces;

public class NumberOfProvinces {

    public static int findCircleNum(int[][] isConnected) {
        int result = 0;
        int[] visited = new int[isConnected.length];

        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i] == 0) {
                dfsHelper(isConnected, visited, i);
                result++;
            }
        }

        return result;
    }

    public static void dfsHelper(int[][] isConnected, int[] visited, int current) {
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[current][i] == 1 && visited[i] == 0) {
                visited[current] = 1;
                dfsHelper(isConnected, visited, i);
            }
        }
    }

    public static void main(String[] args) {

    }
}
