package com.qa.test;

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
@Listeners(com.qa.listener.ListenerTest.class)	
public class PriceruleTest extends BaseClass{
	HomePage homepage;
	loginPage Loginpage;
	PriceRulesPage pricerulespage;
	Dropdown dp;
	public PriceruleTest() {
			super();
			}
		@BeforeMethod
		public void setup() {
			initialization();
			Loginpage=new loginPage();
	        homepage= Loginpage.login(prop.getProperty("Testusername"), prop.getProperty("TestPassWord"));
		}
	/*	@Test(priority=1)
		public void validateclickoncartrules() {
		  pricerulespage=	homepage.clickoncartrules();
		  boolean expimg=homepage.norecords.isDisplayed();
		  Assert.assertTrue(expimg);

		}
	   @Test(priority=2)
		public void validateclickoncatalogpricerules() {
			pricerulespage =homepage.clickoncatalogpricerules();			
		}
		@Test(priority=3)
		public void validateclickonmarketing() {
		  pricerulespage=homepage.clickonmarketing();			
		}
		@Test(priority=2,dataProvider="newcartrules")
		public void clickonAddCartRules(String testcaseid,String uname,String number,String priorityno) 
		{
			
			homepage.clickoncartrules();
			homepage.AddcartRules.click();
			homepage.custname.sendKeys(uname);
			homepage.code.sendKeys(number);
			homepage.highlight.click();
			homepage.partial.click();
			homepage.priority.clear();
			homepage.priority.sendKeys(priorityno);
			homepage.savebtn.click();
			
		}
		 @DataProvider
		  public Object[][] newcartrules() {
		    return new Object[][] {
		      new Object[] {"TC01", "arti","4567","2"},
		      
		    };  		 	
		 }*/
		@Test(priority=2,dataProvider="conditions")
		public void clickonAddCartRules(String testcaseid,String uname,String number) 
		{
			
			pricerulespage.clickoncartrules();
			pricerulespage.AddcartRules.click();
			pricerulespage.cartruleCondition.click();
			pricerulespage.singleCustomer.sendKeys(uname);
			/*homepage.validfrom.click();
			homepage.validfromdate.click();
			homepage.settime();
			homepage.setmin();
			homepage.validfrommin.click();
			homepage.validfromdonebtn.click();
			homepage.validto.click();
			homepage.validtonowbtn.click();
			homepage.validtodonebtn.click();*/
			pricerulespage.minamt.clear();
			pricerulespage.minamt.sendKeys(number);
			pricerulespage.prodrestctn.click();
			pricerulespage.addprodselection.click();
			pricerulespage.Dropdownbox();
			pricerulespage.addbtn.click();
			pricerulespage.choosebtn.click();
			pricerulespage.chooseskirt.click();
			pricerulespage.addskirt.click();
			pricerulespage.closebtn.click();
			pricerulespage.checkskirt.getText();
			pricerulespage.savestaybtn.click();
		}
		 @DataProvider
		  public Object[][] conditions() {
		    return new Object[][] {
		      new Object[] {"TC01", "arthymane(arthymane27@gmail.com)","1000"},
		      
		    };  		 	
		 }
		
	@AfterMethod
	public void teardown() {
		driver.close();
	}
		
		
		
}
