package com.codingChallenge.TwoSum;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import static com.codingChallenge.TwoSum.TwoSum.twoSumHash;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void positiveTestOne() {
        int[] numbs = {2, 7, 11, 15};
        int[] actual = twoSumHash( numbs, 9 );
        assertEquals( 0, actual[0] );
        assertEquals( 1, actual[1] );
    }

    @Test
    void positiveTestTwo() {
        int[] numbs = {2, 7, 11, 15};
        List<Integer> actual = Arrays.stream( twoSumHash( numbs, 9 ) ).boxed().collect( Collectors.toList() );
        assertEquals( List.of( 0, 1 ), actual );
    }

    @Test
    void negativeTestOne() {
        int[] numbs = {2, 7, 11, 15};
        int[] actual = twoSumHash( numbs, 9 );
        assertNotEquals( 0, actual[1] );
        assertNotEquals( 1, actual[0] );
    }

    @Test
    void negativeTestTwo() {
        int[] numbs = {2, 7, 11, 15};
        List<Integer> actual = Arrays.stream( twoSumHash( numbs, 9 ) ).boxed().collect( Collectors.toList() );
        assertNotEquals( List.of( 1, 0 ), actual );
    }

//    @TestFactory USED FOR LIST AND STACKS stuff
//    void dynamicTestStream() {
//        List<Integer> input1List = Arrays.asList( 2, 7, 11, 15 );
//        List<Integer> actual = Arrays.stream( twoSumHash( numbs, 9 ) ).boxed().collect( Collectors.toList() );
//        List<DynamicTest> dynamicTests = new ArrayList<>();
//        for ( int i =0; i<input1List.size(); i++){
//
//        }
//
//        assertEquals( List.of( 0, 1 ), TwoSum.twoSumHash( input1List, 9 ) );
//
//    }
//
//    @TestFactory //EXAMPLE FROM ONLINE
//    Stream<DynamicTest> dynamicTestsExample() {
//        List<Integer> input1List = Arrays.asList( 1, 2, 3 );
//        List<Integer> input2List = Arrays.asList( 10, 20, 30 );
//
//        List<DynamicTest> dynamicTests = new ArrayList<>();
//
//        for (int i = 0; i < input1List.size(); i++) {
//            int x = input1List.get( i ); // line by line
//            int y = input2List.get( i );
//            DynamicTest dynamicTest = dynamicTest( "Dynamic Test for MyUtils.add(" + x + "," + y + ")", () -> {
//                assertEquals( x + y, MyUtils.add( x, y ) );
//            } );
//            dynamicTests.add( dynamicTest );
//        }
//
//        return dynamicTests.stream();
//    }

}

