package com.rootbyos.springboot.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 *
 * Example:
 *
 * n = 15,
 *
 * Return:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 */
public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static String fizzBuzz(int n) {
        //List<String> numbers = new ArrayList<String>();
        List<String> numbers = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbers.add( "FizzBuzz" );
            } else if (i % 5 == 0) {
                numbers.add( "Buzz" );
            } else if (i % 3 == 0 ) {
                numbers.add( "Fizz" );
            } else {
                numbers.add( Integer.toString( i ) );
            }

        }
        String listString = numbers.toString();
        return listString;
    }
    
}
