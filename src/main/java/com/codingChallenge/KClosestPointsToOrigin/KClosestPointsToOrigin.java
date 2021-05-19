package com.codingChallenge.KClosestPointsToOrigin;

import java.util.*;

public class KClosestPointsToOrigin {

    public static int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));

        Collections.addAll(heap, points);

        int index = 0;

        while(!heap.isEmpty() && index < k){
            int[] arr = heap.remove();
            result[index][0] = arr[0];
            result[index][1] = arr[1];
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
