package com.rootbyos.springboot.DestinationCity;

import java.util.*;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> lis = List.of(
                List.of("B", "C"),
                List.of("D", "B"),
                List.of("C", "A"));

        System.out.println(destCity(lis));
        System.out.println(destCityII(lis));

    }

    public static String destCity(List<List<String>> paths) {

        Map<String, String> map = new HashMap<>();
        for (List<String> pathsList : paths) {
            map.put(pathsList.get(0), pathsList.get(1));
        }

        for (String pathStr : map.values()) {
            if (!map.containsKey(pathStr)) {
                return pathStr;
            }
        }

        return "";
    }

    public static String destCityII(List<List<String>> paths) {

        Set<String> str = new HashSet<>();
        for(List<String> cities :paths){
            str.add(cities.get(0));
        }
        System.out.println(str);
        for(List<String> cities : paths){
            if(!str.contains(cities.get(1))){
//                System.out.println(cities.get(0));
                return cities.get(1);
            }
        }

        return "";
    }

}
