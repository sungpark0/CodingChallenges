package com.codingChallenge.Factorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));

//        6! = 1 x 2 x 3 x 4 x 5 x 6

    }

    public static int factorial(int num) {
//         num = 6
//        6 * 5 = 30
//          6 >= 1            6  * factorial(5)
//          5 >= 1            5  * factorial(4)
//          4 >= 1            4  * factorial(3)
//          3 >= 1            3  * factorial(2)
//          2 >= 1            2  * factorial(1)
//          1 >= 1            1  * factorial(0)
        if (num >= 1) return num * factorial(num - 1);

        else return 1;
    }
}
