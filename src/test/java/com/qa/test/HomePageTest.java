package com.qa.test;


import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.pages.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.PriceRulesPage;

import com.qa.pages.loginPage;
import com.qa.util.Dropdown;
import com.qa.util.ScreenShot;
@Listeners(com.qa.listener.ListenerTest.class)	
public class HomePageTest extends BaseClass{
	HomePage homepage;
	loginPage Loginpage;
	ScreenShot screenshot;
	public HomePageTest() {
			super();
			}
		@BeforeMethod
		public void setup() {
			initialization();
			Loginpage=new loginPage();
			homepage=new HomePage();
			screenshot=new ScreenShot(); 
	        homepage= Loginpage.login(prop.getProperty("Testusername"), prop.getProperty("TestPassWord"));
		}
		/*@Test(priority=1)
		public void clickonSearchbox() {
			homepage.clickingonsearchbox();
			}
		
		@Test(priority=2)
		public void validateclickonorders() {
			homepage.clickonorders();
			String act=homepage.noneworder.getText();
			Assert.assertEquals(act,"No new orders have been placed on your shop.");
			}
		@Test(priority=3)
		public void validateclickonviewallorders() {
			homepage.clickonviewallorders();
			}
		
		@Test(priority=4)
		public void validateclickoncustomer() {
			homepage.clickoncustomer();
			String act=homepage.checknonewcustomer.getText();
			Assert.assertEquals(act,"No new customers have registered on your shop.");
			}
		@Test(priority=5)
		public void validateclickonviewallcustomer() {
			homepage.clickonviewallcustomer();
			}
		
		@Test(priority=6)
		public void validateclickonquickaccess() {
			homepage.clickonquickaccess();
			}
		
		/*@Test(priority=7)
		public void validateclickonremovequickaccess() {
			homepage.clickonremovequickaccess();
			}*/
		
		@Test(priority=8)
		public void checkwarningmsg() {
			homepage.con2shopmarktplceact.click();
			String act=homepage.Warningmsg.getText();
			Assert.assertEquals(act, "If you want to be able to fully use the AdminModules panel and have free modules available, you should enable the following configuration on your server\r\n" + 
					"- Enable PHP's allow_url_fopen setting");
			}
		
		@Test(priority=9)
		public void checkmrktplctitle() {
			homepage.clickonconn2mrktplc();
			String act=driver.getTitle();
			Assert.assertEquals(act,"exp");
			}
		
		
		@AfterMethod
		public void teardown(ITestResult res) {
			screenshot.invokeScreenshotMethod(res);
			driver.close();
		}
}

