package com.codingChallenge.AccountsMerge;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AccountsMergeTest {

    @Test
    void positiveTest() {
        assertEquals(List.of(
                List.of("John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"),
                List.of("Mary","mary@mail.com"),
                List.of("John","johnnybravo@mail.com")
                ),
                AccountsMerge.accountsMerge(
                        List.of(
                                List.of("John","johnsmith@mail.com","john_newyork@mail.com"),
                                List.of("John","johnsmith@mail.com","john00@mail.com"),
                                List.of("Mary","mary@mail.com"),
                                List.of("John","johnnybravo@mail.com")
                        )
                )
        );
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of(
                List.of("Ethan","Ethan0@m.co","Ethan4@m.co","Ethan5@m.co"),
                List.of("Gabe","Gabe0@m.co","Gabe1@m.co","Gabe3@m.co"),
                List.of("Hanzo","Hanzo0@m.co","Hanzo1@m.co","Hanzo3@m.co")),
                AccountsMerge.accountsMerge(
                        List.of(
                                List.of("Gabe","Gabe0@m.co","Gabe3@m.co","Gabe1@m.co"),
                                List.of("Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"),
                                List.of("John","johnnybravo@mail.com")
                        )
                )
        );
    }

}