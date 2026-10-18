package com.dyyy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class DyvvyGoalTest {

    @Test
    void testConstructor() {

        LocalDate deadline = LocalDate.of(2027, 6, 15);

        DyvvyGoal goal = new DyvvyGoal(
            "Japan Vacation",
            "Save money for a trip to Japan",
            3000.00,
            750.00,
            deadline
        );

        assertEquals("Japan Vacation", goal.getGName());
        assertEquals("Save money for a trip to Japan", goal.getGDesc());
        assertEquals(3000.00, goal.getTargetAmount());
        assertEquals(750.00, goal.getCurrAmount());
        assertEquals(deadline, goal.getDeadline());
    }

    @Test
    void testGoalItemsStartEmpty() {

        DyvvyGoal goal = new DyvvyGoal(
            "Japan Vacation",
            "Save money for a trip to Japan",
            3000.00,
            750.00,
            LocalDate.of(2027, 6, 15)
        );

        assertNotNull(goal.getItems());
        assertTrue(goal.getItems().isEmpty());
    }
}