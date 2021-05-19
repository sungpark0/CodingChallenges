package com.codingChallenge.MaximumUnitsOnATruck;

import java.util.*;

public class MaximumUnitsOnATruck {

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((b, a) -> a[1] - b[1]);
        Collections.addAll(heap, boxTypes);
        int result = 0;

        while(!heap.isEmpty()){
            int[] temp = heap.remove();
            if(truckSize >= temp[0]) {
                result += (temp[0] * temp[1]);
                truckSize -= temp[0];
            } else {
                result += (temp[1] * truckSize);
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
