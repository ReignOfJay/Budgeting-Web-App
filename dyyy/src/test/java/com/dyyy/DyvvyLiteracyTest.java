package com.dyyy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DyvvyLiteracyTest {

    @Test
    void testConstructor() {

        DyvvyLiteracy literacy = new DyvvyLiteracy(
            "Emergency Funds",
            "An emergency fund can help cover unexpected expenses."
        );

        assertEquals("Emergency Funds", literacy.getTitle());

        assertEquals(
            "An emergency fund can help cover unexpected expenses.",
            literacy.getInformation()
        );
    }
}