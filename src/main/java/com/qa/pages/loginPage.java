package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BaseClass {
	//PageFactory -  OR(object Repository)
		@FindBy(xpath="//*[@id=\"email\"]")
		public static WebElement username;
		
		@FindBy(xpath="//*[@id=\"passwd\"]")
		public static WebElement pwd; 
		
		@FindBy(xpath="//*[@id=\"login_form\"]/div[3]/button")
		public static WebElement signinbtn;
		
		@FindBy(xpath="//*[@id=\"shop-img\"]/img")
		public static WebElement logoimg;
		
		@FindBy(xpath="//*[@id=\"login_form\"]/div[1]/span")
		public static WebElement errormsg;
		
		
		@FindBy(xpath="//*[@id=\"login_form\"]/div[2]/span")
		public static WebElement pwderrormsg;
		
		@FindBy(xpath="//*[@id=\"stay_logged_in\"]")
		public static WebElement stayloginbtn;
		
		
		//Initializing page object
		public loginPage() {
			PageFactory.initElements(driver, this);
		}
		public void checkstayloginbtn() {
			stayloginbtn.click();
		}
		
		public HomePage login(String un,String pwd1) {
		
			username.sendKeys(un);
			pwd.sendKeys(pwd1);
			signinbtn.click();
			return new HomePage();
		}

}
