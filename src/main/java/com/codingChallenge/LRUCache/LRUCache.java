package com.codingChallenge.LRUCache;

import java.util.*;

public class LRUCache {

    Map<Integer, Integer> map = new HashMap<>();
    Queue<Integer> queue = new LinkedList<>();
    int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
    }

    public LRUCache() {}

    public int get(int key) {
        if(!map.containsKey(key)) return -1;

        queue.remove(key);
        queue.offer(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) queue.remove(key);
        else if (queue.size() == cap) map.remove(queue.poll());

        queue.offer(key);
        map.put(key, value);
    }

    public static void main(String[] args) {

    }
}
