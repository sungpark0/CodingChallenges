package com.codingChallenge.MinStack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    MinStack test = new MinStack();

    @Test
    void positiveTest(){
        test.push(1);
        test.push(0);
        test.push(3);
        assertEquals(3, test.top());
        assertEquals(0, test.getMin());
        test.pop();
        assertEquals(2, test.size);
    }

}