package com.qa.util;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import org.testng.ITestResult;


import com.qa.pages.BaseClass;

public class ScreenShot extends BaseClass {
	
	
	public static void invokeScreenshotMethod(ITestResult res)
	{
	if (ITestResult.FAILURE==res.getStatus()){
	try
	{
		DateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy h-m-s");
		Date date=new Date();
	TakesScreenshot ts=(TakesScreenshot)driver;

	File src= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./screenshots/"+res.getName()+"-"+dateformat.format(date)+".png"));
	}
	catch(Exception e)
	{

	System.out.println("Exception while taking screenshot"+e.getMessage());
	}
	}

	}}
