package com.naveentestNG;

import org.testng.annotations.Test;

public class ParallelTesting2 {
	@Test(priority=1)
	public void testCase6() {

		System.out.println("class 2 -- testCase -- 6");
		System.out.println("Test Case six with Thread Id:- " + Thread.currentThread().getId());
		System.out.println("===============================================================");
	}

	@Test(priority=2)
	public void testCase7() {

		System.out.println("class 2 -- testCase -- 7");
		System.out.println("Test Case seven with Thread Id:- " + Thread.currentThread().getId());
		System.out.println("===============================================================");
	}

	@Test(priority=3)
	public void testCase8() {

		System.out.println("class 2 -- testCase -- 8");
		System.out.println("Test Case eight with Thread Id:- " + Thread.currentThread().getId());
		System.out.println("===============================================================");
	}

	@Test(priority=4)
	public void testCase9() {

		System.out.println("class 2 -- testCase -- 9");
		System.out.println("Test Case nine with Thread Id:- " + Thread.currentThread().getId());
		System.out.println("===============================================================");
	}

	@Test(priority=5)
	public void testCase10() {

		System.out.println("class 2 -- testCase -- 10");
		System.out.println("Test Case ten with Thread Id:- " + Thread.currentThread().getId());
		System.out.println("===============================================================");
	}

}
