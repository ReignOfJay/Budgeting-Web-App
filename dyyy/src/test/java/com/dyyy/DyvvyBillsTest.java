package com.dyyy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class DyvvyBillsTest {

    @Test
    void testConstructor() {
        LocalDate date = LocalDate.of(2026, 10, 15);

        DyvvyBills bill = new DyvvyBills(
            "Electric Bill",
            Priority.HIGH,
            125.50,
            date,
            true
        );

        assertEquals("Electric Bill", bill.getBName());
        assertEquals(Priority.HIGH, bill.getlevel());
        assertEquals(125.50, bill.getDueBal());
        assertEquals(date, bill.getDueDate());
        assertTrue(bill.isMonthly());
    }

    @Test
    void testSetBName() {
        DyvvyBills bill = new DyvvyBills(
            "Electric Bill",
            Priority.HIGH,
            125.50,
            LocalDate.of(2026, 10, 15),
            true
        );

        bill.setBName("Water Bill");

        assertEquals("Water Bill", bill.getBName());
    }

    @Test
    void testSetPriority() {
        DyvvyBills bill = new DyvvyBills(
            "Electric Bill",
            Priority.HIGH,
            125.50,
            LocalDate.of(2026, 10, 15),
            true
        );

        bill.setPriority(Priority.CRITICAL);

        assertEquals(Priority.CRITICAL, bill.getlevel());
    }

    @Test
    void testSetDueBal() {
        DyvvyBills bill = new DyvvyBills(
            "Electric Bill",
            Priority.HIGH,
            125.50,
            LocalDate.of(2026, 10, 15),
            true
        );

        bill.setDueBal(200.00);

        assertEquals(200.00, bill.getDueBal());
    }

    @Test
    void testSetDueDate() {
        DyvvyBills bill = new DyvvyBills(
            "Electric Bill",
            Priority.HIGH,
            125.50,
            LocalDate.of(2026, 10, 15),
            true
        );

        LocalDate newDate = LocalDate.of(2026, 11, 1);

        bill.setDueDate(newDate);

        assertEquals(newDate, bill.getDueDate());
    }

    @Test
    void testSetMonthly() {
        DyvvyBills bill = new DyvvyBills(
            "Electric Bill",
            Priority.HIGH,
            125.50,
            LocalDate.of(2026, 10, 15),
            true
        );

        bill.setMonthly(false);

        assertFalse(bill.isMonthly());
    }
}