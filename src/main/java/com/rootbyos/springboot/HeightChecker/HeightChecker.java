package com.rootbyos.springboot.HeightChecker;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HeightChecker {

    public static void main(String[] args) {

        int[] test = {5, 3, 3, 4, 5};
        heightChecker( test );
    }

    public static int heightChecker(int[] heights) {
        int[] copy = Arrays.stream( heights ).sorted().toArray();

        return (int) IntStream.range( 0, heights.length )
                .filter( i -> copy[i] != heights[i] )
                .count();
    }
}
//    public static int heightChecker(int[] heights) {
//        int[] copy = heights.clone();
//        int counter = 0;
//        Arrays.sort( heights );
//
//        for (int i = 0; i < heights.length; i++) {
//            if (copy[i] != heights[i]) {
//                counter++;
//            }
//            (copy[i] != heights[i]) ? counter++ : null;
//
//        }
//        return counter;
//    }
//        for (int i = 0; i < heights.length; i++) {
//            copy[i] = heights[i];
//        }