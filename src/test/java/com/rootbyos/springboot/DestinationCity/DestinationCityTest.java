package com.rootbyos.springboot.DestinationCity;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DestinationCityTest {

    @Test
    void positiveTest(){
        List<List<String>> test = List.of(
                List.of("B", "C"),
                List.of("D", "B"),
                List.of("C", "A"));
        assertEquals("A", DestinationCity.destCity(test));
    }

    @Test
    void negativeTest(){
        List<List<String>> test = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo"));
        assertNotEquals("New York", DestinationCity.destCity(test));
    }

}