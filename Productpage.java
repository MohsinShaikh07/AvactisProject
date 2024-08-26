package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Productpage {

	private By Addtocartfield = By.xpath("//input [@value = 'Add To Cart']");
	
	WebDriver driver;
	
	public Productpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void selectProduct(String productName) {
	       driver.findElement(Addtocartfield).click();
	       
	    }
}
