package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.avactis.constants.Constants;

public class Adminpage extends BasePage {

	
	private By Emailfield = By.xpath("////input[@type='text']");
	private By passwordfield = By.xpath("//input[@type='password']");
	private By signinbutton = By.xpath("////button[@type='submit']");
	private By ordermenu = By.name("menu-orders");
	
	
	private WebDriver driver;
	public void SignIn (WebDriver driver) {
	this.driver = driver;
	driver.get(Constants.ADMIN_URL);
	}
	
	public void signin (String Email, String password) {
		
	driver.findElement(Emailfield).sendKeys(Email);
	driver.findElement(passwordfield).sendKeys(password);
	driver.findElement(signinbutton).click();
	driver.findElement(ordermenu).click();
	}
	
	

	public String getTitleAfterLogin() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
}


