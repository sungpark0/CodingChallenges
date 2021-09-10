package com.codingChallenge.ReconstructItinerary;

import java.util.*;

public class ReconstructItinerary {

    static List<String> itinerary = new ArrayList<>();

    public static List<String> findItinerary(List<List<String>> tickets) {
        Map<String, List<String>> map = new HashMap<>();

        for (List<String> list : tickets) {
            if (!map.containsKey(list.get(0))) {
                map.put(list.get(0), new ArrayList<>());
            }

            map.get(list.get(0)).add(list.get(1));
        }

        for (String str : map.keySet()) {
            Collections.sort(map.get(str));
        }

        dfs(map, "JFK");

        return itinerary;
    }

    public static void dfs(Map<String, List<String>> map, String currentDestination) {
        List<String> list = map.getOrDefault(currentDestination, new ArrayList<>());

        while (list.size() > 0) {
            String arrival = list.remove(0);
            dfs(map, arrival);
        }

        itinerary.add(0, currentDestination);
    }

    public static void main(String[] args) {

    }
}
