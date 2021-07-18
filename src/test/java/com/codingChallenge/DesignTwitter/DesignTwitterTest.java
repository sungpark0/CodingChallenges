package com.codingChallenge.DesignTwitter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DesignTwitterTest {

    DesignTwitter test = new DesignTwitter();

    @Test
    void positiveTest() {
        test.postTweet(1, 5);
        assertEquals(List.of(5), test.getNewsFeed(1));
    }

    @Test
    void negativeTest() {
        test.postTweet(1,5);
        test.postTweet(2,6);
        assertNotEquals(List.of(1, 2), test.getNewsFeed(1));
    }

}