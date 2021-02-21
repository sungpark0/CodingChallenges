package com.codingChallenge.GenerateParentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @ParameterizedTest
    @ValueSource(ints = 3)
    void positiveTest(int num){
        assertEquals(List.of("((()))","(()())","(())()","()(())","()()()"), GenerateParentheses.generateParenthesis(num));
    }

    @ParameterizedTest
    @ValueSource(ints = 2)
    void negativeTest(int num){
        assertNotEquals(List.of("(())"), GenerateParentheses.generateParenthesis(num));
    }

}