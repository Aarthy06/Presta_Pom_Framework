package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.loginPage;

public class LoginTest extends BaseClass {
	loginPage Loginpage;
	HomePage homepage;
	 Logger log=Logger.getLogger(LoginTest .class);
	//property file initialize
	public LoginTest() {
		super();
		}
	
	@BeforeMethod
	public void setup() {
		initialization();
		Loginpage=new loginPage();
	}
	@Test(priority=1)
	public void CheckValidLogin() {
		homepage= Loginpage.login(prop.getProperty("Testusername"), prop.getProperty("TestPassWord"));
	}
	
	@Test(priority=2)
	public void CheckTitle() {
		log.info("checkkk titleeeeeeeee");
		
		String title=driver.getTitle();
		Assert.assertEquals(title, "SHOPCART > Administration panel (PrestaShop™)");
	}
	@Test(priority=3)
	public void validatechecklogoimg() {
		log.info("checkkk logo imgggggg");
	 boolean expimg=Loginpage.logoimg.isDisplayed();
	  Assert.assertTrue(expimg);
	}
	@Test(priority=4)
	public void Checkinvalidlogin() {
		Loginpage.username.sendKeys("fdhgfh");
		Loginpage.pwd.sendKeys("password");
		Loginpage.signinbtn.click();
	    String act=Loginpage.errormsg.getText();
		Assert.assertEquals(act, "Please enter a valid email address.");
	}
	@Test(priority=5)
	public void Checkpwderrormsg() {
		Loginpage.username.sendKeys("admin@javaclassesinpune.com");
		Loginpage.pwd.sendKeys("");
		Loginpage.signinbtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String act=Loginpage.pwderrormsg.getText();
		Assert.assertEquals(act, "This field is required.");
	}
	@Test(priority=6)
	public void Checkstayloginbtn() {
		Loginpage.checkstayloginbtn();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
