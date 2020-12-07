package com.rootbyos.springboot.JumpGame;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        int[] arrTwo = {3, 2, 1, 0, 4};
        System.out.println(canJump(arr));
        System.out.println(canJump(arrTwo));
    }

    public static boolean canJump(int[] nums) {

        int target = nums.length - 1;
        int start = nums[0];

        for (int i = 0; i <= start; i++) {
            if (start >= target) {
                return true;
            }
            if (i + nums[i] > start) {
                start = i + nums[i];
            }
        }

        return false;
    }
}
