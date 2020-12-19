package com.codingChallenge.FibonacciNumber;

public class FibonacciNumber {
    public static void main(String[] args) {

        System.out.println( fibRecursion( 4 ) );
        System.out.println( fib( 4 ) );
    }

    public static int fibRecursion(int N) {
        if (N <= 1) {
            return N;
        }
        return fibRecursion( N - 1 ) + fibRecursion( N - 2 );
    }

    public static int fib(int N) {
        int[] f = new int[N + 1];

        if (N == 0) {
            return N;
        }
        f[1] = 1; //so we dont go below 0.

        for (int i = 2; i <= N; i++) { //covering 0 and 1 with above methods so here we just need to sum 2 and above
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[N];
    }

}
