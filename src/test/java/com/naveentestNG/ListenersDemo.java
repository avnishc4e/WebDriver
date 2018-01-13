package com.naveentestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

	public void onFinish(ITestContext arg0) {
		
	}

	public void onStart(ITestContext arg0) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed: "+ result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped: "+ result.getName());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started: "+ result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success: "+ result.getName());
	}

	
}
