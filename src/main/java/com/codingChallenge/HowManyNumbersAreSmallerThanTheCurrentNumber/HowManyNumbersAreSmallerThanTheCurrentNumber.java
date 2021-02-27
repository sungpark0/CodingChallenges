package com.codingChallenge.HowManyNumbersAreSmallerThanTheCurrentNumber;

import java.util.*;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {

        int[] arr = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        int[] ans = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(temp);
        for(int i =0; i<temp.length; i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i], i);
            }
        }

        for(int i =0; i<temp.length; i++){
            if(map.containsKey(nums[i])){
                ans[i]= map.get(nums[i]);
            }
        }

        
        return ans;
    }

}
