package com.rootbyos.springboot.ReverseInteger;

/**
 * 7. Reverse Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within
 * the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 */

import org.yaml.snakeyaml.util.ArrayUtils;

import java.lang.*;
import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {

        System.out.println( reverse( 1534236469 ) );
        System.out.println( reverseIntegerStack( 1534236469 ) );
//        System.out.println( reverseIntegerQueue( 123 ) );

    }

    public static int reverse(int num) {
        long reversedNumber = 0;

        while (num != 0) {
            reversedNumber = (reversedNumber * 10) + (num % 10); //reveredNumber*10 moves digit and add num %10 to last
            num = num / 10;
        }

        if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
            return 0; //checking for out of scope and return 0
        } else {
            return (int) reversedNumber; //convert long to int
        }
    }

    public static int reverseIntegerStack(int num) {
        long placeHolder = 0;
        long digitPusher = 1;
        Stack<Integer> stackNum = new Stack<>();

        while (num != 0) {
            stackNum.push( num % 10 );
            num = num / 10;
        }

        while (!stackNum.empty()) {
            placeHolder = placeHolder + (stackNum.peek() * digitPusher);
            stackNum.pop();
            digitPusher = digitPusher * 10;
        }
        if (placeHolder > Integer.MAX_VALUE || placeHolder < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) placeHolder;
        }

    }

//    public static int reverseIntegerQueue(int num) { //123 input 321 output
//        Queue<Integer> queueNum = new LinkedList<>();
//        long reverseNumb = 0;
//        int digitPusher = 1;
//        int n = 0;
//
//        while (num != 0) {
//            queueNum.add( num % 10 );
//            num = num / 10;
//        }
//        int[] arr = queueNum.stream().mapToInt( Integer::intValue.toArray());
//        ArrayUtils.reverse(arr);
//
//        return (int) reverseNumb;
//    }

//        String ex = String.join("", sNum);
//        String ex2 = sNum.stream().collect(Collectors.joining(""));
//        System.out.println(ex);
}
