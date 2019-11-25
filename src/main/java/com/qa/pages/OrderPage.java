package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BaseClass{
@FindBy(xpath="//*[@id=\"maintab-AdminParentOrders\"]/a")


WebElement ord;

//Initializing page object
public OrderPage() 
{
PageFactory.initElements(driver, this);
}
public void clickonorder() 
{
	System.out.println("2222222");  
     Actions action=new Actions(driver);
     
	 action.moveToElement(ord).build().perform();
	 
	 driver.findElement(By.xpath("//*[@id=\"subtab-AdminOrders\"]/a")).click();
	 System.out.println("444444");
 }	
public  void clickoninvoices() 
{
     Actions action=new Actions(driver);
	 
	 action.moveToElement(ord).build().perform();
	 driver.findElement(By.xpath("//*[@id=\"subtab-AdminInvoices\"]/a")).click();
 }	
public  void clickonmerchandiseReturns() 
{
     Actions action=new Actions(driver);
	
	 action.moveToElement(ord).build().perform();
	 driver.findElement(By.xpath("//*[@id=\"subtab-AdminReturn\"]/a")).click();
 }	
public  void clickonDeliverySlips() 
{
     Actions action=new Actions(driver);
	 action.moveToElement(ord).build().perform();
	 driver.findElement(By.xpath("//*[@id=\"subtab-AdminDeliverySlip\"]/a")).click();
 }	
public  void clickonCreditSlips() 
{
     Actions action=new Actions(driver);
	 action.moveToElement(ord).build().perform();
	 driver.findElement(By.xpath("//*[@id=\"subtab-AdminSlip\"]/a")).click();
 }	
public  void clickonStatuses() 
{
     Actions action=new Actions(driver);
	 action.moveToElement(ord).build().perform();
	 driver.findElement(By.xpath("//*[@id=\"subtab-AdminStatuses\"]/a")).click();
 }	
public  void clickonordermsgs() 
{
     Actions action=new Actions(driver);
	 action.moveToElement(ord).build().perform();
	 driver.findElement(By.xpath("//*[@id=\"subtab-AdminOrderMessage\"]/a")).click();
 }	

}
