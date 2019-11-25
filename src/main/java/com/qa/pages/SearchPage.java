package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BaseClass{
	@FindBy(xpath="//*[@id=\"maintab-AdminDashboard\"]/a")
    WebElement search;

	//Initializing page object
	public SearchPage() 
	{
	PageFactory.initElements(driver, this);
	}
	public void clickonsearchDropDown() 
	{
		 Select s=new Select(search);
		 
	 }	

}
