package com.codingChallenge.KthSymbolInGrammar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSymbolInGrammarTest {

    @Test
    void positiveTest() {
        assertEquals(1, KthSymbolInGrammar.kthGrammar(2, 2));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, KthSymbolInGrammar.kthGrammar(1, 1));
    }

}