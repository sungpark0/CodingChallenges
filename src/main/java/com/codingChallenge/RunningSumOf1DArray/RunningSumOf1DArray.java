package com.codingChallenge.RunningSumOf1DArray;

import java.util.*;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
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

    public static int[] runningSumII(int[] nums) {
        //nums = [ 1, 2, 3, 4]
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            //temp = 1
            //temp = 2
            //temp = 3
            //temp = 4
            nums[i] = nums[i] + sum;
            //1 = 1 + 0
            //3 = 2 + 1
            //6 = 3 + 3
            //10 = 4 + 6

            sum += temp;
            //sum = 1
            //sum = 3
            //sum = 6
            // sum = 10
        }

        return nums;
    }
}
