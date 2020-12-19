package com.codingChallenge.UniqueEmailAddresses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueEmailAddressesTest {

    @Test
    void positiveTest(){
        String[] test ={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertEquals(2, UniqueEmailAddresses.numUniqueEmails(test));
}


    @Test
    void negativeTest(){
        String[] test ={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertNotEquals(3, UniqueEmailAddresses.numUniqueEmails(test));
    }
}


