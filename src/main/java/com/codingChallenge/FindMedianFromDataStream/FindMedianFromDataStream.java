package com.codingChallenge.FindMedianFromDataStream;

import java.util.*;

public class FindMedianFromDataStream {

    static PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> b - a);
    static PriorityQueue<Integer> min = new PriorityQueue<>((a, b) -> a - b);

    public static void addNum(int num) {
        if (max.isEmpty() || max.peek() >= num) max.add(num);
        else min.add(num);

        if (max.size() > min.size() + 1) min.add(max.remove());
        if (max.size() < min.size()) max.add(min.remove());
    }

    public static double findMedian() {
        return max.size() == min.size() ? (max.peek() + min.peek()) / 2.0 : max.peek();
    }

    public static void main(String[] args) {

    }
}
