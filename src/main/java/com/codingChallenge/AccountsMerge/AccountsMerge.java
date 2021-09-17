package com.codingChallenge.AccountsMerge;

import java.util.*;

public class AccountsMerge {

    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, TreeSet<String>> union = new HashMap<>();
        int[] parent = new int[accounts.size()];

        for (int i = 0; i < accounts.size(); i++) parent[i] = i;

        for (int i = 0; i < accounts.size(); i++) {
            List<String> acc = accounts.get(i);
            for (int j = 1; j < acc.size(); j++) {
                String email = acc.get(j);
                if (map.containsKey(email)) {
                    int temp = search(parent, map.get(email));
                    parent[temp] = i;
                }
                map.put(email, i);
            }
        }

        for (String email : map.keySet()) {
            int index = search(parent, map.get(email));
            TreeSet<String> set = union.getOrDefault(index, new TreeSet<>());
            set.add(email);
            union.put(index, set);
        }

        List<List<String>> accountsList = new ArrayList<>();

        for (int index : union.keySet()) {
            List<String> list = new ArrayList<>();
            list.add(accounts.get(index).get(0));
            list.addAll(union.get(index));
            accountsList.add(list);
        }

        return accountsList;
    }

    public static int search(int[] parent, int x) {
        if (parent[x] == x) return x;

        parent[x] = search(parent, parent[x]);

        return parent[x];
    }

    public static void main(String[] args) {

    }
}
