package com.avactis.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.avactis.constants.Constants;

public class Register extends BasePage {

	private By MyAccountfield = By.name("My Account");
	private By registerfield = By.xpath("//button[@class= 'btn btn-default']");
	private By emailfield = By.xpath("//input[@name = 'customer_info[Customer][Email]']");
	private By passwordfield = By.xpath("//input[@name = 'customer_info[Customer][Password]']");
	private By Retypepassword = By.xpath("//input[@name = 'customer_info[Customer][RePassword]']");
	private By FirstNamefield = By.xpath("//input[@name = 'customer_info[Customer][FirstName]']");
	private By LastNamefield = By.xpath("//input[@name = 'customer_info[Customer][LastName]']");
	private By Countryfield = By.xpath("//select[@name = 'customer_info[Customer][Country]']");
	private By Statefield = By.xpath("//select[@name = 'customer_info[Customer][State]']");
	private By ZIPPostalcodefield = By.xpath("//input[@name = 'customer_info[Customer][ZipCode]']");
	private By Cityfield = By.xpath("//input[@name = 'customer_info[Customer][City]']");
	private By AddressLine1field = By.xpath("//input[@name = 'customer_info[Customer][Streetline1]']");
	private By AddressLine2field = By.xpath("//input[@name = 'customer_info[Customer][Streetline2]']");
	private By ContactPhonefield = By.xpath("//input[@name = 'customer_info[Customer][Phone]']");
	private By Registerbutton = By.xpath("//input[@type = 'submit']");
	
	private WebDriver driver;
	
	public Register (WebDriver driver) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	this.driver = driver;
	
	driver.get(Constants.STORE_URL);
	
	}
	
	public void register (String email, String pass, String Retypepass, String FirstName, String LastName, String Country, 
			String State, String ZIPpostalcode, String City, String AddressLine1, String AddressLine2, String ContactPhone) {
	
	driver.findElement(MyAccountfield).click();
	driver.findElement(registerfield).click();
	driver.findElement(emailfield).sendKeys(email);
	driver.findElement(passwordfield).sendKeys(pass);
	driver.findElement(Retypepassword).sendKeys(Retypepass);
	driver.findElement(FirstNamefield).sendKeys(FirstName);
	driver.findElement(LastNamefield).sendKeys(LastName);
	driver.findElement(Countryfield).sendKeys(Country);
	driver.findElement(Statefield).sendKeys(State);
	driver.findElement(ZIPPostalcodefield).sendKeys(ZIPpostalcode);
	driver.findElement(Cityfield).sendKeys(City);
	driver.findElement(AddressLine1field).sendKeys(AddressLine1);
	driver.findElement(AddressLine2field).sendKeys(AddressLine2);
	driver.findElement(ContactPhonefield).sendKeys(ContactPhone);
	driver.findElement(Registerbutton).click();
	
	}    	
	public String getTitleAfterLogin() {
		return driver.getTitle();
	}

	
	}
	
