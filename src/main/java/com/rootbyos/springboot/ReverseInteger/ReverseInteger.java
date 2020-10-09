package com.rootbyos.springboot.ReverseInteger;

/**
 * 7. Reverse Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within
 * the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 */
import java.lang.*;

public class ReverseInteger {
    public static void main(String[] args) {

        System.out.println(reverse(12321));

    }

    public static int reverse(int num) {
        long reversedNumber = 0;

        while(num != 0) {
            reversedNumber = (reversedNumber * 10) + (num % 10); //reveredNumber*10 moves digit and add num %10 to last
            num = num / 10;
        }

        if(reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
            return 0; //checking for out of scope and return 0
        }
        else{
            return (int) reversedNumber; //convert long to int
        }
    }
}
