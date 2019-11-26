/*package com.qa.listener;

import org.testng.ITestContext ;
import org.testng.ITestListener;
import org.testng.ITestResult ;

import com.qa.pages.BaseClass;
import com.qa.util.ScreenShot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class ListenerTest extends BaseClass  implements ITestListener						
{		
	protected static ExtentReports reports;
	protected static ExtentTest test;


    public void onFinish(ITestContext ITC) {					

    	System.out.println("[__Test_Case Finished Time__] :-"+ITC.getName());
    	System.out.println("[....Finish_Time...] :-"+new java.util.Date() );
    	reports.endTest(test);
    	reports.flush();	
    }		

    public void onStart(ITestContext ITC2) {					
    	System.out.println("[__Test_Case Started Time__] :-"+ITC2.getName());
    	System.out.println("[....Test_Start_Time....] :-"+new java.util.Date() );  
    	//reports = new ExtentReports(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date()) + "ExtentReport.html");
    	reports = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReposhot.html", true);
    }		

    public void onTestFailedButWithinSuccessPercentage(ITestResult TBWSP) {	
    	
    	System.out.println("[....Test_Failed But Within Success Percentage....] :-"+TBWSP.getName());
    	System.out.println("[....TestFailedButWithinSuccessPercentage Time....] :-"+new java.util.Date() );
    	
    }		

    public void onTestFailure(ITestResult result) {					
    	test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "_[...Test is failed...]");

        System.out.println("Test failure" +result.getName());
        System.out.println("Test failure" +new java.util.Date());
    	System.out.println("[__Test Failure Exception is occured__] : " + result);

        ScreenShot.invokeScreenshotMethod(result);

            
    }		

    public void onTestSkipped(ITestResult TS) {					
    	
    	System.out.println("[__Test_Skipped__] :-"+TS.getName());
    	System.out.println("[....Skipped_Time...] :-"+new java.util.Date() );  
    	test.log(LogStatus.SKIP, TS.getMethod().getMethodName() + "_[...Test is skipped...]");
    }		

    public void onTestStart(ITestResult TSRT) {
    	
    	System.out.println("[__Test_Start__] :-"+TSRT.getName());
    	System.out.println("[....Start_Time....] :-"+new java.util.Date() );  
    	test = reports.startTest(TSRT.getMethod().getMethodName());
   	    test.log(LogStatus.INFO, TSRT.getMethod().getMethodName() + "_[...Test is started..]");
    	
    }		

    public void onTestSuccess(ITestResult TSS) {					

    	System.out.println("[__Test_Success__] :-"+TSS.getName());
    	System.out.println("[....Test_Success_Time....] :-"+new java.util.Date() );     
    	test.log(LogStatus.PASS, TSS.getMethod().getMethodName() + "_[...Test is passed...]");
    }

	
}		

*/