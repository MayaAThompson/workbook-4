package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test
    void testLastNameFirstName() {
        String expected = "Jones, Mike";
        String actual = NameFormatter.format("Mike", "Jones");
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testPrefixLastFirstMiddleSuffixNames() {
        String expected = "Jones, Mr. Mike A, Jr";
        String actual = NameFormatter.format("Mr.", "Mike", "A", "Jones", "Jr");
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testLastFirstMiddleSuffixNames() {
        String expected = "Jones, Mike A, Jr";
        String actual = NameFormatter.format("Mike", "A", "Jones", "Jr");
        assertEquals(expected, actual);
    }
}