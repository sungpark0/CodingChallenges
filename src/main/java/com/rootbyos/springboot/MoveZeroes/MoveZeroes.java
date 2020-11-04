package com.rootbyos.springboot.MoveZeroes;

import java.util.*;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] test = {0, 1, 0, 3, 12};
        moveZeroes( test );
    }

    public static void moveZeroes(int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[i+count];
            }
        }
        for (int i = nums.length - count; i < nums.length; i++) {
            nums[i] = 0;
        }


        System.out.println( Arrays.toString( nums ) );

    }

}
