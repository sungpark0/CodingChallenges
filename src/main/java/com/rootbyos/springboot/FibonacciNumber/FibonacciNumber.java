package com.rootbyos.springboot.FibonacciNumber;

public class FibonacciNumber {
    public static void main(String[] args) {

        System.out.println(fibRecursion(3));
//        System.out.println(fib(3));
    }

    public static int fibRecursion(int N){
        if(N<=1){
            return N;
        }
        return fibRecursion(N-1) + fibRecursion(N-2);
    }

//    public static int fib(int N){
//        if(N<=1){
//            return N;
//        }
//        while ( something){ add previous #'s }
//
//        // need to make a recurring loop to add whatever #s lower than int N
//    }
}
