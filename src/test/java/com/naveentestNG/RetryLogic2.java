package com.naveentestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogic2 {

	@Test
	public void testCase1() throws InterruptedException {
		Assert.assertEquals(true, false);
	}

	@Test
	public void testCase2() throws InterruptedException {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void testCase3() throws InterruptedException {
		Assert.assertEquals(true, true);
	}
}
