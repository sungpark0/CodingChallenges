package com.codingChallenge.FindIfPathExistsInGraph;

import java.util.*;

public class FindIfPathExistsInGraph {

    public static boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        return dfs(graph, visited, start, end);
    }

    public static boolean dfs(List<List<Integer>> graph, boolean[] visited, int start, int end) {
        if (start == end) return true;

        visited[start] = true;

        for (int num : graph.get(start)) {
            if (!visited[num]) {
                if (dfs(graph, visited, num, end)) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
