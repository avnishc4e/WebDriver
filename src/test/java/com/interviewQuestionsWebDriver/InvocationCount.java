package com.interviewQuestionsWebDriver;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)
	public void testCase1(){
		System.out.println("From testcaseOne");
	}
}
