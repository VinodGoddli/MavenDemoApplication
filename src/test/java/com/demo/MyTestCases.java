package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTestCases {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class loading");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class loading");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("while Setup loading");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("while tearDown loading");
	}

	@Test
	public final void testMain() {
		assertTrue("Test case executed success", true);
	}

}
