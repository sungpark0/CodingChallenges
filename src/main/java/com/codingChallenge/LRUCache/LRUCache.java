package com.codingChallenge.LRUCache;

import java.util.*;

public class LRUCache {

    public LinkedHashMap<Integer, Integer> map;
    public int cap;

    public LRUCache() {}

    public LRUCache(int capacity) {
        this.map = new LinkedHashMap<Integer, Integer>(capacity);
        this.cap = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        int value = map.get(key);
        map.remove(key);
        map.put(key, value);
        return map.get(key);
    }

    public void put(int key, int val) {
        map.remove(key);
        map.put(key, val);

        if (map.size() > cap) map.remove(map.entrySet().iterator().next().getKey());
    }

    public static void main(String[] args) {

    }
}
