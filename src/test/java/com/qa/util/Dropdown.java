package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.pages.BaseClass;

public class Dropdown extends BaseClass {
	
	public void Dropdownbox() {
		WebElement addruleconcerning=driver.findElement(By.xpath("//*[@id=\"product_rule_type_1\"]"));
	 
		Select s=new Select(addruleconcerning);
		s.selectByVisibleText("Products");
	}

}