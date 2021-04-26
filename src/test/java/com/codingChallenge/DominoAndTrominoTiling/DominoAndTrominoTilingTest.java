package com.codingChallenge.DominoAndTrominoTiling;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DominoAndTrominoTilingTest {

    @ParameterizedTest
    @ValueSource(ints = 3)
    void positiveTest(int N){
        assertEquals(5, DominoAndTrominoTiling.numTilings(N));
    }

    @ParameterizedTest
    @ValueSource(ints = 5)
    void negativeTest(int N){
        assertNotEquals(20, DominoAndTrominoTiling.numTilings(N));
    }

}