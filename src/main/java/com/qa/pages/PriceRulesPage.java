package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PriceRulesPage extends BaseClass {
	@FindBy(xpath="//*[@id=\"maintab-AdminPriceRule\"]/a")
	WebElement PriceRules;
	@FindBy(xpath="//*[@id=\"page-header-desc-cart_rule-new_cart_rule\"]")
	public static WebElement AddcartRules;
	@FindBy(xpath="//*[@id=\"name_1\"]")
	public static WebElement custname;
	@FindBy(xpath="//*[@id=\"code\"]")
	public static WebElement code ;
	@FindBy(css="#cart_rule_informations > div:nth-child(4) > div > span > label:nth-child(2)")
	public static WebElement highlight;
	@FindBy(css="#cart_rule_informations > div:nth-child(5) > div > span > label:nth-child(4)")
	public static WebElement partial;
	@FindBy(xpath="//*[@id=\"cart_rule_informations\"]/div[6]/div/input")
	public static WebElement priority;
	@FindBy(xpath="//*[@id=\"desc-cart_rule-save\"]")
	public static WebElement savebtn;
	@FindBy(xpath="//*[@id=\"form-cart_rule\"]/div/div[2]/table/tbody/tr/td/div/i")
	public static WebElement norecords;
	
	@FindBy(xpath="//*[@id=\"cart_rule_link_conditions\"]")
	public static WebElement cartruleCondition;
	@FindBy(xpath="//*[@id=\"customerFilter\"]")
	public static WebElement singleCustomer ;
/*	@FindBy(xpath="//form//input[@name='date_from']")
	
	public static WebElement validfrom ;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a")
	public static WebElement validfromdate;
	@FindBy(xpath="//div[@id='ui_tpicker_hour_dp1574154336856']/a")
	public static WebElement validfromhr;
	@FindBy(xpath="//div[@id=ui_tpicker_minute_dp1574154336856']/a")
	public static WebElement validfrommin;
	@FindBy(css="#ui-datepicker-div > div.ui-datepicker-buttonpane.ui-widget-content > button.ui-datepicker-close.ui-state-default.ui-priority-primary.ui-corner-all")
	public static WebElement validfromdonebtn;
	@FindBy(xpath="//*[@id=\"dp1574146023088\"]")
	public static WebElement validto;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div[3]/button[1]")
	public static WebElement validtonowbtn;
	@FindBy(xpath="//button[@type='button']")
	public static WebElement validtodonebtn;*/
	@FindBy(xpath="//*[@id=\"cart_rule_conditions\"]/div[3]/div/div/div[1]/input")
	public static WebElement minamt;
	@FindBy(xpath="//*[@id=\"product_restriction\"]")
	public static WebElement prodrestctn;
	@FindBy(xpath="//*[@id=\"product_restriction_div\"]/a")
	public static WebElement addprodselection;
	
	//@FindBy(xpath="//*[@id=\"product_rule_type_1\"]")
	//public static WebElement addruleconcerning;
	@FindBy(xpath="//*[@id=\"product_rule_group_1_tr\"]/td[2]/div[2]/div[2]/a")
	public static WebElement addbtn;
	@FindBy(xpath="//*[@id=\"product_rule_1_1_choose_link\"]")
	public static WebElement choosebtn;
	@FindBy(xpath="//*[@id=\"product_rule_select_1_1_1\"]/option[12]")
	public static WebElement chooseskirt;
	@FindBy(xpath="//*[@id=\"product_rule_select_1_1_add\"]")
	public static WebElement addskirt;
	@FindBy(xpath="/html/body/div[5]/div/div/a")
	public static WebElement closebtn;
	@FindBy(xpath="//*[@id=\"product_rule_1_1_match\"]")
	public static WebElement checkskirt;
	@FindBy(xpath="//*[@id=\"desc-cart_rule-save-and-stay\"]")
	public static WebElement savestaybtn;
//	@FindBy(xpath="//*[@id=\"product_rule_select_1_1_add\"]")
	//public static WebElement addskirt;

	
	
	//Initializing page object
	public PriceRulesPage() 
	{
    PageFactory.initElements(driver, this);
	}
			
    public PriceRulesPage clickoncartrules() 
    {
	Actions action=new Actions(driver);

	action.moveToElement( PriceRules).build().perform();

driver.findElement(By.xpath("//*[@id=\"subtab-AdminCartRules\"]/a")).click();
			/*}
			
			public PriceRulesPage cart() {
				PriceRules.click();*/
	return new PriceRulesPage();
			}

	public PriceRulesPage clickoncatalogpricerules() 
	{
         Actions action=new Actions(driver);

		 action.moveToElement(PriceRules).build().perform();
		 driver.findElement(By.xpath("//*[@id=\"subtab-AdminSpecificPriceRule\"]/a")).click();
		 return new PriceRulesPage();
	 }

	public PriceRulesPage clickonmarketing() 
	{
         Actions action=new Actions(driver);
		
		 action.moveToElement(PriceRules).build().perform();
		 driver.findElement(By.xpath("//*[@id=\"subtab-AdminMarketing\"]/a")).click();
		 return new PriceRulesPage();
	 }
	public void Dropdownbox() {
		WebElement addruleconcerning=driver.findElement(By.xpath("//*[@id=\"product_rule_type_1\"]"));
	 
		Select s=new Select(addruleconcerning);
		s.selectByVisibleText("Products");
	}

	/*public void settime() {
	 Actions move = new Actions(driver);
     Action action = (Action) move.dragAndDropBy(validfromhr, 30, 0).build();
     action.perform();
	}
	public void setmin() {
		 Actions move = new Actions(driver);
	     Action action = (Action) move.dragAndDropBy(validfrommin, 30, 0).build();
	     action.perform();
		}*/	
}
