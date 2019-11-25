package com.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.pages.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.OrderPage;
import com.qa.pages.SearchPage;
import com.qa.pages.loginPage;
@Listeners(com.qa.listener.ListenerTest.class)	
public class SearchPageTest extends BaseClass {
	HomePage homepage;
	loginPage Loginpage;
	SearchPage searchpage;
	//Orders order;
	public SearchPageTest() {
		super();
		}
	@BeforeMethod
	public void setup() {
		initialization();
		Loginpage=new loginPage();
		searchpage=new SearchPage();
		homepage=new HomePage();
        homepage= Loginpage.login(prop.getProperty("Testusername"), prop.getProperty("TestPassWord"));
	}
	
}
