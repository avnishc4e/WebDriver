package com.naveentestNG;

import org.testng.annotations.Test;

public class ParallelTesting1 {

	@Test(priority=1)
	public void testCase1() {

		System.out.println("class 1 -- testCase -- 1");
		System.out.println("Test Case One with Thread Id:- " + Thread.currentThread().getId());
		System.out.println("===============================================================");
	}

	@Test(priority=2)
	public void testCase2() {

		System.out.println("class 1 -- testCase -- 2");
		System.out.println("Test Case two with Thread Id:- " + Thread.currentThread().getId());
		System.out.println("===============================================================");
	}

	@Test(priority=3)
	public void testCase3() {

		System.out.println("class 1 -- testCase -- 3");
		System.out.println("Test Case three with Thread Id:- " + Thread.currentThread().getId());
		System.out.println("===============================================================");
	}

	@Test(priority=4)
	public void testCase4() {

		System.out.println("class 1 -- testCase -- 4");
		System.out.println("Test Case four with Thread Id:- " + Thread.currentThread().getId());
		System.out.println("===============================================================");
	}

	@Test(priority=5)
	public void testCase5() {

		System.out.println("class 1 -- testCase -- 5");
		System.out.println("Test Case five with Thread Id:- " + Thread.currentThread().getId());
		System.out.println("===============================================================");
	}

}
