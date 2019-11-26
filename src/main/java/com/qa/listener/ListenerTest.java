package com.qa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test started" +result.getName());
		System.out.println("Test started" +new java.util.Date());
	}

	public void onTestSuccess(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure" +result.getName());
		System.out.println("Test failure" +new java.util.Date());
	}
		
	

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test finish" +context.getName());
		
		System.out.println("Test finish" +new java.util.Date());
	}
		
	}

	

