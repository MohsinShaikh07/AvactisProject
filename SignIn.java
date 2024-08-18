package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.avactis.constants.Constants;

public class SignIn extends BasePage {

	private By signinfield = By.name("Sign In");
	private By Emailfield = By.xpath("//input[@id= 'account_sign_in_form_email_id']");
	private By passwordfield = By.xpath("//input[@name= 'passwd']");
	private By signinbutton = By.xpath("//input[@type= 'submit']");
	
	private WebDriver driver;
	public SignIn (WebDriver driver) {
	this.driver = driver;
	driver.get(Constants.STORE_URL);
	}
	
	public void signin (String Email, String password) {
	driver.findElement(signinfield).click();	
	driver.findElement(Emailfield).sendKeys(Email);
	driver.findElement(passwordfield).sendKeys(password);
	driver.findElement(signinbutton).click();
	}
	
}
