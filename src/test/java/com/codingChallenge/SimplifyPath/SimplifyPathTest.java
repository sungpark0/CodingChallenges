package com.codingChallenge.SimplifyPath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {

    @Test
    void positiveTest() {
        assertEquals("/home", SimplifyPath.simplifyPath("/home/"));
    }

    @Test
    void negativeTest() {
        assertNotEquals("/./", SimplifyPath.simplifyPath("/../"));
    }
}