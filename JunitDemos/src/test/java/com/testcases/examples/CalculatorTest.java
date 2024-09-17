package com.testcases.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.junit.example.Calculator;

class CalculatorTest {

	private Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		// create an object
		calculator = new Calculator();
		System.out.println("called before each testcase");
	}

	@AfterEach
	void tearDown() throws Exception {
		// make ref null
		calculator = null;
		System.out.println("called after each testcase");
	}

	@Test
	@DisplayName("Testing add method")
	void testAdd() {
		int actual = calculator.add(10, 5);
		assertEquals(15, actual, "Expected 50 but got diff value");
	}
	
	@Test
	@DisplayName("Testing multiply method")
	@Tag("sample")
	void testMul() {
		int actual = calculator.multiply(2, 2);
		assertEquals(4, actual, "Expected 4 but got diff value");
	}
	
	@Test
	@DisplayName("Testing multiply method- two")
	@Tag("sample1")
	void testMultiplyTwo() {
		int actual = calculator.add(4, 10);
		assertEquals(40, actual, "Expected 40 but got diff value");
	}

}
