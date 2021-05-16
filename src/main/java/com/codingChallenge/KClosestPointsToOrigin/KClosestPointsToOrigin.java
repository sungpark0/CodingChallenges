package com.codingChallenge.KClosestPointsToOrigin;

import java.util.*;

public class KClosestPointsToOrigin {

    public static int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        PriorityQueue<int[]> priorityQ = new PriorityQueue<>((a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));

        Collections.addAll(priorityQ, points);

        int index = 0;

        while(!priorityQ.isEmpty() && index < k){
            int[] arr = priorityQ.remove();
            result[index][0] = arr[0];
            result[index][1] = arr[1];
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
