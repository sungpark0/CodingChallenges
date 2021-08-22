package com.codingChallenge.CourseSchedule;

import java.util.*;

public class CourseSchedule {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        int[] visited = new int[numCourses];
        int[] check = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] arr : prerequisites) {
            list.get(arr[1]).add(arr[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (cycle(i, visited, check, list)) return false;
            }
        }

        return true;
    }

    public static boolean cycle(int i, int[] visited, int[] check, List<List<Integer>> list) {
        visited[i] = 1;
        check[i] = 1;

        for (int num : list.get(i)) {
            if (visited[num] == 0) {
                if (cycle(num, visited, check, list)) return true;
            } else if (check[num] == 1) return true;
        }

        check[i] = 0;

        return false;
    }

    public static void main(String[] args) {

    }
}
