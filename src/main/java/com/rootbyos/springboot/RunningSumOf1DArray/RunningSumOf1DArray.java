package com.rootbyos.springboot.RunningSumOf1DArray;

import java.util.*;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum(nums)));

    }

    public static int[] runningSum(int[] nums) {

//        if(nums.length==1){
//            return nums;
//        }
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}
