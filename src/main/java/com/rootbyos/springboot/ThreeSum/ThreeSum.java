package com.rootbyos.springboot.ThreeSum;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            if (nums[i] <= 0) {
                while (j < k) {
                    if (nums[i] + nums[j] > 0) break;

                    if (j > i + 1 && nums[j - 1] == nums[j]) {
                        j++;
                        continue;
                    }

                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                    } else if (sum > 0) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }

        }

        return result;
    }
}
// public static List<List<Integer>> threeSum(int[] nums){
//        List<List<Integer>> result = new ArrayList<>();
//        Arrays.sort(nums);
//        if (nums.length < 3) {
//            return result;
//        }
//        if(nums[0]==0 & nums[1]==0 & nums[2]==0){
//            result.add(Arrays.asList(0,0,0));
//            return result;
//        }
//        //[-4, -1, -1, 0, 1, 2]
//        //[-2, -1, 0, 1, 2, 3]
//        // i = -2 j = -1 k =3 [-2, -1, 3]
//        // i = -2 j = 0 k = 2 [-2, 0, 2]
//        // i = -1 j = 0 k = 1
//        for (int i = 0; i < nums.length; i++) {
//            int j = i + 1, k = nums.length - 1;
//            while (j < k) {
//                int sum = (nums[i] + nums[j] + nums[k]);
//                if (sum == 0) {
//                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                    j++;
//                    k--;
//                } else if (sum < 0) {
//                    k--;
//                } else {
//                    j++;
//                }
//            }
//        }
//
//        return result;
//    }
//
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        List<List<Integer>> temp = new ArrayList<>();
//        Map<List<Integer>, Integer> map = new HashMap<>();
//        HashSet<List> hashSet = new HashSet<>();
//        if (nums.length < 3) return temp;
//        Arrays.sort(nums);
////      [-4, -1, -1, 0, 1, 2]
//        for (int i = 0; i < nums.length; i++) {
//            int j = i + 1, k = nums.length - 1;
//            for (int j = i + 1, k = nums.length - 1; j < k; j++) {
//                {
//                    while (j < k) {
//                        if (nums[i] + nums[j] + nums[k] == 0) {
//
//                        }
//                        {
//                            if (nums[i] + nums[j] + nums[k] == 0) {
//                                result.add(List.of(nums[i], nums[j], nums[k]));
//                                hashSet.add(List.of(nums[i], nums[j], nums[k]));
//                                k--;
//                            }
//                            k--;
//                        }
//                    }
//                    if (!map.containsKey(temp)) {
//                        map.put((Arrays.asList(nums[i], nums[j], nums[k])), 1);
//                    } else {
//                        map.put((Arrays.asList(nums[i], nums[j], nums[k])), 1);
//                    }
//                }
//            }
//        }
//        ArrayList result = new ArrayList<>(hashSet);
//        return result;
//    }





