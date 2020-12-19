package com.codingChallenge.FlippingAnImage;

import java.util.*;

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] test = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] testTwo = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {1, 0, 1, 0}};

        System.out.println( (Arrays.deepToString( flipAndInvertImage( test ) )) );
        System.out.println( (Arrays.deepToString( flipAndInvertImage( testTwo ) )) );
        System.out.println( Arrays.deepToString( flippingAnImage( test ) ) );
    }


    public static int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            int start = 0;
            int end = A[0].length - 1;
            while (start < end) { // this is similar logic implementation from last week's string reversal.
                int temp = A[i][start];
                A[i][start++] = A[i][end];
                A[i][end--] = temp;
            }
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = (A[i][j] == 0) ? 1 : 0; //Ternary Operator. its for If-else statements(more readable)
//                A[i][j] ^= 1; //XOR operator, bitwise operator (for binary #s?) (switch 0 to 1 and 1 to 0)
//                if (A[i][j] == 1) {
//                    A[i][j] = 0;
//                } else {
//                    A[i][j] = 1;
//                }
            }
        }
        System.out.println( Arrays.deepToString( A ) );
        //Without Arrays.deepToString Java will automatically convert to string form and output
        //error message such as [[TO@3041a79c. In order to control this situation we can use deepToString method
        //to display object
        return A;
    }

    public static int[][] flippingAnImage(int[][] B) {

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length / 2; j++) { //flipping
                int temp = B[i][j];
                B[i][j] = B[i][B.length - j - 1];
                B[i][B.length - j - 1] = temp;
            }
            for (int k = 0; k < B.length; k++) {
                B[i][k] = B[i][k] == 1 ? 0 : 1;
            }
        }

        System.out.println( Arrays.deepToString( B ) );
        return B;
    }
}

//    public static int[][] flippingAnImageThree(int[][] B) {
//        int[][] temp = new int[B.length][B.length];
//        for (int i = 0; i < B.length; i++) {
//            for (int j = 0; j < B[i].length; j++)
//                temp[i][j] = (B[i][B[i].length - 1 - j] == 1) ? 0 : 1;
//        }
//        return temp;
//    }
//    public static int[][] flipAndInvertImageTwo(int[][] A) { //Using Ternary operator and with more "shortcuts".
//
//        for (int i = 0; i < A.length; i++) {
//            int start = 0;
//            int end = A[0].length; //question 1
//
//            while (start < end) { // this is similar logic implementation from last week's string reversal.
//                int temp = A[i][start];
//
//                A[i][start] = A[i][end - 1] == 0 ? 1 : 0;
//                A[i][end - 1] = temp == 0 ? 1 : 0;
//
//                end--;
//                start++;
//            }
//        }
//
//        return A;
//    }



