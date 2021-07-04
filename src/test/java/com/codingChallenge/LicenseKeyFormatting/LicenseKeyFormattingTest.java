package com.codingChallenge.LicenseKeyFormatting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LicenseKeyFormattingTest {

    @Test
    void positiveTest() {
        assertEquals("5F3Z-2E9W", LicenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    @Test
    void negativeTesT() {
        assertNotEquals("25-G3-J", LicenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
    }

}