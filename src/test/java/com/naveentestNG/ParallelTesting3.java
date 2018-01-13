package com.naveentestNG;

import org.testng.annotations.Test;

public class ParallelTesting3 {

	@Test(threadPoolSize =8,invocationCount = 24)
	public void testCase1() {
		System.out.println("Test Case One with Thread Id:- " + Thread.currentThread().getId());
	}
}
