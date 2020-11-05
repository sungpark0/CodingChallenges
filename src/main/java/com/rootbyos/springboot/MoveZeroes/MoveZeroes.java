package com.rootbyos.springboot.MoveZeroes;

import java.util.*;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] test = {0, 1, 0, 3, 12};
        moveZeroes( test );
    }

    public static void moveZeroes(int[] nums) {

        List<Integer> list = new ArrayList<>();

//        int count = 0;
//        for (int num : nums) {
//            if (num == 0) {
//                count++;
//            }
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                list.add( nums[i] );
//            }
//        }
//
//        while (count > 0) {
//            list.add( 0 );
//            count--;
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            nums[i] = list.get( i );
//        }
        for (int num : nums) {
            if (num != 0) {
                list.add(num);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i >= list.size()) {
                nums[i] = 0;
            } else {
                nums[i] = list.get( i );
            }
        }

    }
}
