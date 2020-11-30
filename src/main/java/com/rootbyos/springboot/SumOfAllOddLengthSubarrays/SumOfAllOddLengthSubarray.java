package com.rootbyos.springboot.SumOfAllOddLengthSubarrays;

public class SumOfAllOddLengthSubarray {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if ((j - i) % 2 == 0) { // % 2 == 0 because in array index starts from 0.
                    result += sum;
                }
            }
        }
        return result;
    }
}
