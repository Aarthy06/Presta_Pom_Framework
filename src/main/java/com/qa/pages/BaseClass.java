package com.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.listener.WebEventListener;


public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public BaseClass() {
		try {
			 prop=new Properties();
			 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java"+"/com/qa/config/login.properties");
		     prop.load(fis);
		    }
		catch(FileNotFoundException e) 
		{
		e.printStackTrace();
		}
	    catch(IOException e)
		{
		e.printStackTrace();
	    }
}
	
	public static void initialization() {
		String browserName=prop.getProperty("TestBrowser");
		if(browserName.equals("chrome")) 
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver=new ChromeDriver();
		 }
		else if(browserName.equals("Firefox")) 
		{
			driver=new FirefoxDriver();
		                                
		}
		e_driver = new EventFiringWebDriver(driver);
		//Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		    driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get(prop.getProperty("TestURL"));
	}
	
}
