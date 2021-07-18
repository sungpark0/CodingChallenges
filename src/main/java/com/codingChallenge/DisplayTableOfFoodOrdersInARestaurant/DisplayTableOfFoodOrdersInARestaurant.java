package com.codingChallenge.DisplayTableOfFoodOrdersInARestaurant;

import java.util.*;

public class DisplayTableOfFoodOrdersInARestaurant {

    public static List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> dispTable = new ArrayList<>();
        TreeMap<Integer, Map<String, Integer>> map = new TreeMap<>();
        TreeSet<String> set = new TreeSet<>();

        for (List<String> order : orders) {
            String menu = order.get(2);
            set.add(menu);
            Integer table = Integer.parseInt(order.get(1));
            map.putIfAbsent(table, new HashMap<>());
            if (map.get(table).containsKey(menu)) {
                Map<String, Integer> temp = map.get(table);
                temp.put(menu, temp.getOrDefault(menu, 0) + 1);
            } else {
                map.get(table).put(menu, 1);
            }
        }

        List<String> firstRow = new ArrayList<>();
        firstRow.add("Table");
        firstRow.addAll(set);
        dispTable.add(firstRow);

        for (Map.Entry<Integer, Map<String, Integer>> entry : map.entrySet()) {
            List<String> list = new ArrayList<>();
            list.add(entry.getKey() + "");
            Map<String, Integer> temp = entry.getValue();

            for (String menu : set) {
                if (temp.containsKey(menu)) {
                    list.add(temp.get(menu) + "");
                } else {
                    list.add("0");
                }
            }

            dispTable.add(list);
        }

        return dispTable;
    }

    public static void main(String[] args) {

    }
}
