package com.codingChallenge.MinimumHeightTrees;

import java.util.*;

public class MinimumHeightTrees {

    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        int[] arr = new int[n];

        if (n == 1) {
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            return temp;
        }

        List<List<Integer>> group = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            group.add(new ArrayList());
        }

        for (int[] edge : edges) {
            group.get(edge[0]).add(edge[1]);
            group.get(edge[1]).add(edge[0]);
            arr[edge[0]]++;
            arr[edge[1]]++;
        }

        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                queue.add(i);
            }
        }

        while (n > 2) {
            int qSize = queue.size();
            n -= qSize;

            while (qSize > 0) {
                int currValue = queue.remove();

                for (int i : group.get(currValue)) {
                    arr[i]--;
                    if (arr[i] == 1) {
                        queue.add(i);
                    }
                }
                qSize--;
            }
        }

        return new LinkedList(queue);
    }

    public static void main(String[] args) {

    }
}
