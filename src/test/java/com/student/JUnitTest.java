package com.student;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitTest {

	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before All test");
	}
	@AfterAll
	public static void afterClass() {
		System.out.println("After All Test");
	}
	@BeforeEach
	public void setUp() {
		System.out.println("Test Start");
	}
	@AfterEach
	public void termination() {
		System.out.println("Test End");
	}
	@Test
	public void test1() {
		System.out.println("Test 1 Executed");
	}
}
