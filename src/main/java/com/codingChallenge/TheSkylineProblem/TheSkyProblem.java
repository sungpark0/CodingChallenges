package com.codingChallenge.TheSkylineProblem;


import java.util.*;

public class TheSkyProblem {

    public static List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> result = new ArrayList<>();
        List<int[]> heights = new ArrayList<>();

        for(int[] building : buildings){
            heights.add(new int[]{building[0],-building[2]});
            heights.add(new int[]{building[1],building[2]});
        }

        heights.sort((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        pq.offer(0);
        int prev = 0;

        for(int[] h : heights){
            if(h[1] < 0) pq.offer(-h[1]);
            else pq.remove(h[1]);

            int currValue = pq.peek();
            if(prev != currValue){
                List<Integer> temp = new ArrayList<>();
                temp.add(h[0]);
                temp.add(currValue);
                result.add(new ArrayList<>(temp));
                prev = currValue;
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
