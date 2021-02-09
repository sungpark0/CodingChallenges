package com.codingChallenge.SumOfUniqueElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfUniqueElements {

    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int result = 0;

        for (int num : nums) {
            if (map.containsKey( num )) {
                map.put( num, map.get( num ) + 1 );
            } else {
                map.put( num, 1 );
            }
        }

        list = map.entrySet()
                .stream()
                .filter( entry -> entry.getValue() == 1 )
                .map( Map.Entry::getKey ).collect(Collectors.toList());

        for (Integer integer : list) {
            result += integer;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,2};

        System.out.println(sumOfUnique(arr));
    }
}
