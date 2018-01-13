package com.naveentestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogic1 {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testCase1() throws InterruptedException {
		Assert.assertEquals(true, false);
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testCase2() throws InterruptedException {
		Assert.assertEquals(true, false);
	}
}
