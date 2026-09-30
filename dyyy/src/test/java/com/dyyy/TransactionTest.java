package com.dyyy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TransactionTest {

    @Test
    void testConstructor() {
        LocalDate date = LocalDate.of(2026, 9, 30);

        Transaction transaction = new Transaction(
            "Grocery purchase",
            date,
            false
        );

        assertEquals("Grocery purchase", transaction.getDesc());
        assertEquals(date, transaction.getTDate());
        assertFalse(transaction.getIncome());
    }

    @Test
    void testIncomeTransaction() {
        Transaction transaction = new Transaction(
            "Paycheck",
            LocalDate.of(2026, 9, 30),
            true
        );

        assertTrue(transaction.getIncome());
    }

    @Test
    void testExpenseTransaction() {
        Transaction transaction = new Transaction(
            "Gas",
            LocalDate.of(2026, 9, 30),
            false
        );

        assertFalse(transaction.getIncome());
    }
}
