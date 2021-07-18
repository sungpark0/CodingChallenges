package com.codingChallenge.DisplayTableOfFoodOrdersInARestaurant;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class DisplayTableOfFoodOrdersInARestaurantTest {

    @Test
    void positiveTest() {
        assertEquals(
                List.of(
                        List.of("Table", "Beef Burrito", "Ceviche", "Fried Chicken", "Water"),
                        List.of("3", "0", "2", "1", "0"),
                        List.of("5", "0", "1", "0", "1"),
                        List.of("10", "1", "0", "0", "0")),
                DisplayTableOfFoodOrdersInARestaurant.displayTable(
                        List.of(
                                List.of("David", "3", "Ceviche"),
                                List.of("Corina", "10", "Beef Burrito"),
                                List.of("David", "3", "Fried Chicken"),
                                List.of("Carla", "5", "Water"),
                                List.of("Carla", "5", "Ceviche"),
                                List.of("Rous", "3", "Ceviche")
                        ))
        );
    }

    @Test
    void negativeTest() {
        assertNotEquals(
                List.of(
                        List.of("Table", "Canadian Waffles", "Fried Chicken"),
                        List.of("1", "2", "0"),
                        List.of("12", "0", "3"),
                        List.of("10", "1", "0")),
                DisplayTableOfFoodOrdersInARestaurant.displayTable(
                        List.of(
                                List.of("James", "12", "Fried Chicken"),
                                List.of("Ratesh", "12", "Fried Chicken"),
                                List.of("Amadeus", "12", "Fried Chicken"),
                                List.of("Adam", "1", "Canadian Waffles"),
                                List.of("Brianna", "1", "Canadian Waffles")
                        ))
        );
    }

}