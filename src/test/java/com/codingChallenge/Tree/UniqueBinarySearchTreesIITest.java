package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueBinarySearchTreesIITest {

    @ParameterizedTest
    @ValueSource(ints =  3)
    void sizePositiveTest(int num){
        assertEquals(5, UniqueBinarySearchTreesII.generateTrees(num).size());
    }

    @ParameterizedTest
    @ValueSource(ints =  2)
    void sizeNegativeTest(int num){
        assertNotEquals(1, UniqueBinarySearchTreesII.generateTrees(num).size());
    }

//    @Test
//    void PositiveTest(){
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i<UniqueBinarySearchTreesII.generateTrees(3).size(); i++ ){
//
//        }
//        assertEquals(5, UniqueBinarySearchTreesII.generateTrees(3).size());
//    }
}