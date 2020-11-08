package com.rootbyos.springboot.IntersectionOfTwoArraysII;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println( Arrays.toString( intersect( nums1, nums2 ) ) );
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> smallerArr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int[] temp = nums1;

        if (nums1.length > nums2.length) {
            nums1 = nums2;
            nums2 = temp;
        }
        for(int num : nums2){
            smallerArr.add(num);
        }

        for(int num : nums1){
            if(smallerArr.contains(num)){
                result.add(num);
            }
        }
        System.out.println(result);
        return result.stream().mapToInt( i -> i ).toArray();
    }
}
