package com.qa.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseClass {
	@FindBy(xpath="//*[@id=\"bo_query\"]")
	public static WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"orders_notif\"]/a")
	public static WebElement orderbtn;
	
	@FindBy(css="#list_orders_notif > span")
	public static WebElement noneworder;
	
	@FindBy(xpath="//*[@id=\"orders_notif_wrapper\"]/div[3]/a")
	public static WebElement viewallord;
	
	@FindBy(xpath="//*[@id=\"customers_notif\"]/a")
	public static WebElement customerbtn;
	
	@FindBy(css="#list_customers_notif > span")
	public static WebElement checknonewcustomer;
	
	@FindBy(xpath="//*[@id=\"customers_notif_wrapper\"]/div[3]/a")
	public static WebElement viewallcustomer;
	
	@FindBy(xpath="//*[@id=\"page-header-desc-customer-new_customer\"]")
	public static WebElement addnewcustomer;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[5]/div/div[1]/div[1]/button/i")
	public static WebElement refreshbtn;
	
	@FindBy(xpath="//*[@id=\"quick_select\"]")
	public static WebElement Quickaccess;
	
	@FindBy(xpath="//*[@id=\"header_quick\"]/li/ul/li[5]/a")
	public static WebElement addnewQuickaccess;
	
	@FindBy(xpath="//*[@id=\"header_quick\"]/li/ul/li[6]/a")
	public static WebElement RemoveQuickaccess;
	
	@FindBy(xpath="//*[@id=\"header_employee_box\"]/li[1]/a/span[1]")
	public static WebElement con2shopmarktplceact;
	
	@FindBy(xpath="//*[@id=\"modal_addons_connect\"]/div/div/div[2]/div")
	public static WebElement Warningmsg;
	
	@FindBy(xpath="//*[@id=\"modal_addons_connect\"]/div/div/div[1]/h4/a")
	public static WebElement addon;
	
	@FindBy(xpath="//*[@id=\"gender_1\"]")
	public static WebElement socialtitle;
	
	@FindBy(xpath="//*[@id=\"firstname\"]")
	public static WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"lastname\"]")
	public static WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"customer_form_submit_btn\"]")
	public static WebElement custsavebtn;
	
	//Initializing page object
		public HomePage() 
		{
	    PageFactory.initElements(driver, this);
		}
	
	
    public void clickingonsearchbox() {
    	searchbox.sendKeys("Cartrules");
    	searchbox.sendKeys(Keys.ENTER);;
    	
    }
    public void clickonorders() {
		orderbtn.click();
		}
   
    public void clickonviewallorders() {
    	orderbtn.click();
    	viewallord.click();
		}
    
    public void clickoncustomer() {
    	customerbtn.click();
    	}
    
    public void clickonviewallcustomer() {
    	customerbtn.click();
    	viewallcustomer.click();
    	refreshbtn.click();
		}
    
    public void clickonquickaccess() {
    	Quickaccess.click();
    	addnewQuickaccess.click();
    	driver.switchTo().alert().getText();		
    	driver.switchTo().alert().sendKeys("NewCustomer");
    	driver.switchTo().alert().accept();
    	}
    
    public void clickonremovequickaccess() {
    	Quickaccess.click();
    	RemoveQuickaccess.click();
    	 }
    
    public void clickonconn2mrktplc() {
    	con2shopmarktplceact.click();
    	addon.click();
    	 }
    public void clickonnewcustomer(String ftname, String ltname) {
    	customerbtn.click();
    	viewallcustomer.click();
    addnewcustomer.click();
    socialtitle.click();
    firstname.sendKeys(ftname);
    lastname.sendKeys(ltname);
    custsavebtn.click();
}
    }