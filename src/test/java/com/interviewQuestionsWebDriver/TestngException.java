package com.interviewQuestionsWebDriver;

import org.testng.annotations.Test;

public class TestngException {
	//This test will pass.
	@Test(expectedExceptions=ArithmeticException.class)
	public void dividedByZeroExample1(){
		int e = 1/0;
		System.out.println(+e);
	}
	
	@Test//This test will fail.
	public void dividedByZeroExample2(){
		int e = 1/0;
		System.out.println(+e);
	}
}
