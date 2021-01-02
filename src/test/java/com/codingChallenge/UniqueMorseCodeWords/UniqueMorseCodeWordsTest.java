package com.codingChallenge.UniqueMorseCodeWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueMorseCodeWordsTest {

    @Test
    void positiveTest(){
        String[] test = {"gin", "zen", "gig", "msg"};
        assertEquals(2, UniqueMorseCodeWords.uniqueMorseRepresentations(test));
    }

    @Test
    void negativeTest(){
        String[] test = {"vtpke","vngc","vnqr","gbzx","qvdx"};
        assertNotEquals(3, UniqueMorseCodeWords.uniqueMorseRepresentations(test));
    }

}