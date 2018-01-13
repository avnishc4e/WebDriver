package com.naveentestNG;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 100)
	public void testCase1() {
		for(int i = 0;i<=20;i++){
		System.out.println(i);	
		}
		
	}
}
