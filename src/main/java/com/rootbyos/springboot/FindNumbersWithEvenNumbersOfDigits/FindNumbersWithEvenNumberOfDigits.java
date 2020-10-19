package com.rootbyos.springboot.FindNumbersWithEvenNumbersOfDigits;

public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {

        int[] numbs = {437, 315, 322, 431, 686, 264, 442}; // declaration
        findNumbers( numbs );

    }


    public static int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) { 
            int digitCounter = 0;
            while (nums[i] != 0) {
                digitCounter++;
                nums[i] = nums[i] / 10;
            }
            if (digitCounter % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
