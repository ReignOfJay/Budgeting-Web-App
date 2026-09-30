package com.dyyy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class DyvvyFundsTest {

    @Test
    void testConstructor() {
        DyvvyFunds funds = new DyvvyFunds(
            500.00,
            "Main Checking",
            Acct.checking
        );

        assertEquals(500.00, funds.getBal());
        assertEquals("Main Checking", funds.getAcctName());
        assertEquals(Acct.checking, funds.getAcctType());
    }

    @Test
    void testSetBal() {
        DyvvyFunds funds = new DyvvyFunds(
            500.00,
            "Main Checking",
            Acct.checking
        );

        funds.setBal(750.00);

        assertEquals(750.00, funds.getBal());
    }

    @Test
    void testSetAcctName() {
        DyvvyFunds funds = new DyvvyFunds(
            500.00,
            "Main Checking",
            Acct.checking
        );

        funds.setAcctName("Emergency Checking");

        assertEquals("Emergency Checking", funds.getAcctName());
    }

    @Test
    void testSetAcctType() {
        DyvvyFunds funds = new DyvvyFunds(
            500.00,
            "Main Account",
            Acct.checking
        );

        funds.setAcctType(Acct.saving);

        assertEquals(Acct.saving, funds.getAcctType());
    }

    @Test
    void testTransactionsListStartsEmpty() {
        DyvvyFunds funds = new DyvvyFunds(
            500.00,
            "Main Checking",
            Acct.checking
        );

        assertNotNull(funds.transactions);
        assertTrue(funds.transactions.isEmpty());
    }

    @Test
    void testAddTransaction() {
        DyvvyFunds funds = new DyvvyFunds(
            500.00,
            "Main Checking",
            Acct.checking
        );

        Transaction transaction = new Transaction(
            "Grocery purchase",
            LocalDate.of(2026, 9, 30),
            false
        );

        funds.transactions.add(transaction);

        assertEquals(1, funds.transactions.size());
        assertEquals(transaction, funds.transactions.get(0));
    }
}