package com.codingChallenge.AllPathsFromSourceToTarget;

import java.util.*;

public class AllPathsFromSourceToTarget {

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);

        dfs(graph, 0, list, paths);

        return paths;
    }

    public static void dfs(int[][] graph, int index, List<Integer> list, List<List<Integer>> paths) {
        if (index == graph.length - 1) {
            paths.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = 0; i < graph[index].length; i++) {
            list.add(graph[index][i]);
            dfs(graph, graph[index][i], list, paths);
            list.remove(list.size() - 1);
        }
    }


    public static void main(String[] args) {

    }
}
