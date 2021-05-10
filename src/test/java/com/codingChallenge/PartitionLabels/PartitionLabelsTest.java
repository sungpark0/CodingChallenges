package com.codingChallenge.PartitionLabels;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsTest {

    @Test
    void positiveTest() {
        assertEquals(List.of(9, 7, 8), PartitionLabels.partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of(9, 7, 1), PartitionLabels.partitionLabels("ababcbacadefegdea"));
    }

}