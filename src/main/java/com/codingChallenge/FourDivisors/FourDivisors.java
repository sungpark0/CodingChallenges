package com.codingChallenge.FourDivisors;

public class FourDivisors {

    public static int sumFourDivisors(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            int tempSum = num + 1;
            int numOfDivisors = 0;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    if (num / j != j) {
                        tempSum += j;
                        tempSum += (num / j);
                        numOfDivisors = numOfDivisors + 2;
                    } else {
                        tempSum += j;
                        numOfDivisors++;
                    }
                }
            }
            if (numOfDivisors == 2) sum += tempSum;
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
