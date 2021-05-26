package com.codingChallenge.InsertDeleteGetRandom;

import java.util.*;

public class InsertDeleteGetRandom {

    Map<Integer, Integer> map;
    List<Integer> list;
    Random random;
    /** Initialize your data structure here. */
    public InsertDeleteGetRandom() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;

        int index = list.size();
        list.add(val);
        map.put(val, index);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        list.set(map.get(val), list.get(list.size() - 1));
        map.put(list.get(list.size() - 1), map.get(val));
        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {

    }

//    First attempt
//
//    Set<Integer> set;
//    Random random;
//    /** Initialize your data structure here. */
//    public RandomizedSet() {
//        set = new HashSet<>();
//        random = new java.util.Random();
//    }
//
//    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
//    public boolean insert(int val) {
//        if(set.contains(val)) return false;
//
//        set.add(val);
//        return true;
//    }
//
//    /** Removes a value from the set. Returns true if the set contained the specified element. */
//    public boolean remove(int val) {
//        if(!set.contains(val)) return false;
//
//        set.remove(val);
//        return true;
//    }
//
//    /** Get a random element from the set. */
//    public int getRandom() {
//        Integer[] temp = set.toArray(new Integer[0]);
//        return temp[random.nextInt(set.size())];
//    }
}
