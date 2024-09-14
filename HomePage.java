package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private By productnamefield = By.name("Custom T-Shirt (Upload y ...");
	private By productnamefield2 = By.name("Classic Musicals from th ...");
	private By productnamefield3 = By.name("HP TouchSmart");
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void selectProduct(String productName) {
       driver.findElement(productnamefield).click();
       driver.findElement(productnamefield2).click();
       driver.findElement(productnamefield3).click();
    }

	public void searchProduct(String product1) {
		// TODO Auto-generated method stub
		
	}
}
