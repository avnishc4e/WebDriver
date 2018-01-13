package com.naveentestNG;

import org.testng.annotations.Test;

public class InfiniteLoop {
    
/*	@Test(timeOut=10,expectedExceptions=ArrayIndexOutOfBoundsException.class)//in milliseconds
	public void testCase1() {
		int i =1;
		while (i==1){
		System.out.println(i);	
		}
		
	}*/
	@Test(expectedExceptions=ArithmeticException.class)
	public void testCase2() {
		int j=3/0;
		System.out.println(+j);
}
}