package com.naveentestNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = { "smoke" })
	public void testCase1() {
		System.out.println("From testcase 1");
	}

	@Test(groups = { "smoke" })
	public void testCase2() {
		System.out.println("From testcase 2");
	}

	@Test(groups = { "sanity" })
	public void testCase3() {
		System.out.println("From testcase 3");
	}

	@Test(groups = { "sanity" })
	public void testCase4() {
		System.out.println("From testcase 4");
	}

	@Test(groups = { "regression" })
	public void testCase5() {
		System.out.println("From testcase 5");
	}

	@Test(groups = { "regression" })
	public void testCase6() {
		System.out.println("From testcase 6");
	}

	@Test(groups = { "regression","sanity" })
	public void testCase7() {
		System.out.println("From testcase 7");
	}

	@Test(groups = { "regression","sanity"})
	public void testCase8() {
		System.out.println("From testcase 8");
	}
	
	@Test(groups={"ui"},dependsOnGroups={"regression"})
	public void testCase9() {
		System.out.println("From testcase 8");
	}
}