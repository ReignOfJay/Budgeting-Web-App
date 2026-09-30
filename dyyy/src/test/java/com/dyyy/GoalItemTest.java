package com.dyyy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GoalItemTest {

    @Test
    void testConstructor() {

        GoalItem item = new GoalItem(
            "Hotel",
            1200.00
        );

        assertEquals("Hotel", item.getName());
        assertEquals(1200.00, item.getEstimatedCost());
    }
}