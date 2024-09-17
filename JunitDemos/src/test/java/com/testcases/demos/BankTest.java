package com.testcases.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.junit.demos.Bank;
import com.junit.demos.OutOfLimitsException;

class BankTest {

	private Bank bank;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		bank = new Bank(1500);
	}

	@AfterEach
	void tearDown() throws Exception {
		bank = null;
	}

	@Test
	@DisplayName("Testing withdraw method")
	void testWithdraw() {

		double remainingBalance = bank.withdraw(500);
		assertEquals(remainingBalance, 1000, 100);
	}

	@Test
	@DisplayName("Testing withdraw negative method")
	@Tag("sample")
	void testWithdrawNegative() {

		assertThrows(OutOfLimitsException.class, () -> bank.withdraw(5000));
	}

	@Test
	@DisplayName("Testing deposit method")
	@Tag("sample")
	void testDeposit() {
		double remainingBalance = bank.deposit(500);
		assertEquals(remainingBalance, 2000, 100);
	}

}
