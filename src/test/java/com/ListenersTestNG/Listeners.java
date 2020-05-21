package com.ListenersTestNG;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onFinish(ITestContext arg0) {
		System.out.println("Test run finished");
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("onStart");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("onTestFailure");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test case Skipped");
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("onTestStart");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("onTestSuccess");
		
	}

	
	
	
}
