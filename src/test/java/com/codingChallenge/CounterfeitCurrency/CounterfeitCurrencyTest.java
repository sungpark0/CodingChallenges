package com.codingChallenge.CounterfeitCurrency;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CounterfeitCurrencyTest {

    @Test
    void positiveTest() {
        List<String> serialNums = List.of("AVG190420T", "RTF20001000Z");
        assertEquals(1020, CounterfeitCurrency.countCounterfeit(serialNums));
    }

    @Test
    void negativeTest(){
        List<String> serialNums = List.of("AAA19962000Z", "BCD2010500T");
        assertNotEquals(2500, CounterfeitCurrency.countCounterfeit(serialNums));
    }
}