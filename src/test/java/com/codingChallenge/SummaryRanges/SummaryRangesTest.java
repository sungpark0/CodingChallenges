package com.codingChallenge.SummaryRanges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    @Test
    void positiveTest() {
        assertEquals(List.of("0->2", "4->5", "7"), SummaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of("0", "2", "3->4", "6->8", "9"), SummaryRanges.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

}