package com.rootbyos.springboot.ShuffleTheArray;

import java.util.*;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] test = {2, 5, 1, 3, 4, 7};
        //            0  1  2  3  4  5
        System.out.println(Arrays.toString(shuffle(test, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] listX = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            listX[index] = nums[i];
            listX[index+1] = nums[i+n];
            index+=2;
        }

        return listX;
    }

//    public static int[] shuffle(int[] nums, int n) {
//        List<Integer> listX = new ArrayList<>();
//        List<Integer> listY = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                listX.add(nums[i]);
//            } else if (nums[i] % 2 != 0) {
//                listY.add(nums[i]);
//            }
//        }
//        System.out.println(listX);
//        System.out.println(listY);
//
//        return nums;
//    }
}
