package com.rootbyos.springboot.IntersectionOfTwoArrays;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println( Arrays.toString(intersection( arr1, arr2 )) );
        System.out.println( Arrays.toString(intersectionI( arr1, arr2 )) );
        System.out.println( Arrays.toString(intersectionII( arr1, arr2 )) );
        System.out.println( Arrays.toString(intersectionIII( arr1, arr2 )) ); //fastest MAP
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> firstArr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums1){
            firstArr.add(num);
        }

        for(int num : nums2 ){
            if(firstArr.contains(num)){
                result.add(num);
            }
        }

        return result.stream().distinct().mapToInt( i ->i ).toArray();
    }

    public static int[] intersectionI(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1)
                .distinct()
                .filter(num -> Arrays.stream(nums2).anyMatch(v -> v == num))
                .toArray();
    }

    public static int[] intersectionII(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int[] distinctArr = Arrays.stream(nums1).distinct().toArray();

        for (int num : distinctArr) {
            if (Arrays.stream(nums2).anyMatch(v -> v == num)) {
                result.add(num);
            }
        }

        int[] arr = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;

//        return result.stream().mapToInt(i -> i).toArray();
    }


    public static int[] intersectionIII(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num)) {
                result.add(num);
                map.remove(num);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

}

