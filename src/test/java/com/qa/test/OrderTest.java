package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.OrderPage;
import com.qa.pages.loginPage;
import com.qa.util.TestUtil;

public class OrderTest extends BaseClass{
	HomePage homepage;
	loginPage Loginpage;
	OrderPage orderpage;
	String sheetName="customertestdata";
	//Orders order;
	public OrderTest() {
		super();
		}
	@BeforeMethod
	public void setup() {
		initialization();
		Loginpage=new loginPage();
		orderpage=new OrderPage();
		homepage=new HomePage();
        homepage= Loginpage.login(prop.getProperty("Testusername"), prop.getProperty("TestPassWord"));
	}
	@Test(priority=1)
	public void validateclickonorder() {
		orderpage.clickonorder();
	}
	@Test(priority=2)
	public void validateclickoninvoices() {
		orderpage.clickoninvoices();
	}
	@Test(priority=3)
	public void validateclickonmerchandisereturns() {
		orderpage.clickonmerchandiseReturns();
	}
	@Test(priority=4)
	public void validateclickondeliveryslips() {
		orderpage.clickonDeliverySlips();
	}
	@Test(priority=5)
	public void validateclickoncreditslips() {
		orderpage.clickonCreditSlips();
	}
	@Test(priority=6)
	public void validateclickonstatuses() {
		orderpage.clickonStatuses();
	}
	@Test(priority=7)
	public void validateclickonordermsgs() {
		orderpage.clickonordermsgs();
	}
	@DataProvider
	public Object[][] gettestdata() {
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=7,dataProvider="gettestdata")
	public void validatecreatenewcustomer(String firstname,String lastname) {
		homepage.clickonnewcustomer(firstname,lastname);
		}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
