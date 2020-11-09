package com.rootbyos.springboot.IntersectionOfTwoArraysII;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println( Arrays.toString( intersect( nums1, nums2 ) ) );
        System.out.println( Arrays.toString( intersectAttempTwo( nums1, nums2 ) ) );
        System.out.println( Arrays.toString( intersectFinal( nums1, nums2 ) ) );
        System.out.println( Arrays.toString( intersectII( nums1, nums2 ) ) );
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int[] temp = nums1;

        if (nums1.length > nums2.length) {
            nums1 = nums2;
            nums2 = temp;
        }//nums1 always will be smaller than nums 2
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result.add( nums1[i] );
                    break;
                }
            }
        }
        return result.stream().mapToInt( i -> i ).toArray();
    }

    public static int[] intersectFinal(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            if (!map.containsKey( num )) {
                map.put( num, 1 );

            } else {
                map.put( num, map.get( num ) + 1 );
            }
        }

        for (int num : nums2) {
            if (map.containsKey( num ) && map.get( num ) > 0) {
                result.add( num );
                map.put( num, map.get( num ) - 1 );
            }
        }
//        int[] arr = new int[result.size()]; //USING THIS METHOD RATHER THAN THE BELOW MAKES THE RUN TIME FASTER
//        for (int i = 0; i < result.size(); i++) {
//            arr[i] = result.get( i );
//        }
//        return arr;
        return result.stream().mapToInt( i -> i ).toArray();
    }

    public static int[] intersectAttempTwo(int[] nums1, int[] nums2) {
        List<Integer> smallerArr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int[] temp = nums1;

        if (nums1.length > nums2.length) {
            nums1 = nums2;
            nums2 = temp;
        }
        for (int num : nums2) {
            smallerArr.add( num );
        }

        for (int num : nums1) {
            if (smallerArr.contains( num )) {
                result.add( num );
            }
        }

        return result.stream().mapToInt( i -> i ).toArray();
    }

    public static int[] intersectII(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int[] shorterArr = nums1.length < nums2.length ? nums1 : nums2;
        int[] longerArr = nums1.length < nums2.length ? nums2 : nums1;

        for (int num : longerArr) {
            map.put( num, map.getOrDefault( num, 0 ) + 1 );
        }

        for (int num : shorterArr) {
            if (map.containsKey( num )) {
                int val = map.get( num );
                if (val == 0) {
                    map.remove( num );
                } else {
                    result.add( num );
                    map.put( num, val - 1 );
                }
            }
        }

        int[] arr = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get( i );
        }
        return arr;
    }
}
