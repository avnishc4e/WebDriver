package com.naveentestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test()
	public void testCase1() {
		int i = 5 / 0;// If there is a exception then the dependent method will be skipped.
		System.out.println("From testcase 1");				
	}
	@Test()
	public void testCase2() {
		System.out.println("From testcase 2");
	}
	@Test(dependsOnMethods = "testCase1")
	public void testCase3() {
		System.out.println("From testcase 3 which depends on testcase 1");
	}

	@Test()
	public void testCase4() {
		System.out.println("From testcase 4");
	}

	@Test(dependsOnMethods="testCase1")
	public void testCase5() {
		System.out.println("From testcase 5 which depends on testcase 1");
	}
	@Test()
	public void testCase6() {
		System.out.println("From testcase 6");
	}

	@Test(dependsOnMethods="testCase1")
		public void testCase7() {
			System.out.println("From testcase 7 which depends on testcase 1");
}
	
}