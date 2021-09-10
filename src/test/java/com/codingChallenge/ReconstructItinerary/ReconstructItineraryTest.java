package com.codingChallenge.ReconstructItinerary;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReconstructItineraryTest {

    @Test
    void positiveTest() {
        assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"), ReconstructItinerary.findItinerary(
                List.of(List.of("MUC", "LHR"), List.of("JFK", "MUC"), List.of("SFO", "SJC"), List.of("LHR", "SFO")))
        );
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of("JFK", "ATL", "JFK", "SFO","SFO", "ATL"), ReconstructItinerary.findItinerary(
                List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"), List.of("SFO", "ATL"), List.of("ATL", "JFK")))
        );
    }

}