package com.codingChallenge.FindNumbersWithEvenNumbersOfDigits;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

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

    public static int findNumbersTwo(int[] nums) {
        int counter = 0;
        for (int num : nums) { //for each loop -> It’s commonly used to iterate over an array or a Collections class
            int digitCounter = 0;
            while (num != 0) {
                digitCounter++;
                num = num / 10;
            }
            if (digitCounter % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
    public static int findNumbersStream(int[] nums) {
        AtomicInteger counter = new AtomicInteger(); //allow concurrent access. Initial value 0.

        Arrays.stream(nums).forEach( num -> {
            int digitCounter = 0;
            while (num != 0) {
                digitCounter++;
                num = num / 10;
            }
            if (digitCounter % 2 == 0) {
                counter.getAndIncrement(); //automatically increments by one
            }
        });

        return counter.get();
    }
}
