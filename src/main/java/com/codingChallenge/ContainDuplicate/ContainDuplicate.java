package com.codingChallenge.ContainDuplicate;

import java.util.*;

public class ContainDuplicate {
    public static void main(String[] args) {

        int[] test = {1, 2, 3};
        containDuplicate( test );
    }

    public static boolean containDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>(nums.length);

        Arrays.sort(nums);
        for (int i = 0;i< nums.length;i ++){
            if (map.containsKey( nums[i] )) {
                return true;
            }
                map.put(nums[i], 1);
        }
//        for (int num : nums) {
//            if (!map.containsKey( num )) {
//                map.put( num, 1 );
//            } else {
//                return true;
//            }
//        }

        return false;
    }



//         Arrays.sort(nums);
//        for(int i=0;i<nums.length-1;i++){
//        if(nums[i]==nums[i+1])return true;
//    }
//
//        return false;
}
