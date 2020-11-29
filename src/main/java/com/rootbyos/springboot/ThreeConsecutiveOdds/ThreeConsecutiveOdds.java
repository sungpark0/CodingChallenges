package com.rootbyos.springboot.ThreeConsecutiveOdds;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {

        int[] arr = {2, 6, 4, 1};
        System.out.println(threeConsecutiveOdds(arr));

    }

    public static boolean threeConsecutiveOdds(int[] arr) {

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
