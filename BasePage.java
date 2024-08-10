package com.avactis.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	 WebDriver driver;
	 WebDriverWait wait; 
	 {
	
	driver = new ChromeDriver();
        driver.manage().window().maximize();
	wait = new WebDriverWait (driver,Duration.ofSeconds(10));
	
}


	 public void click (By locator) {
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		 element.click();
		 
	 }
	 
	 public void Sendkeys (By locator, String text) {
		 WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 element.sendKeys(text);
		 
	 }
	 
	 public String gettext (By locator) {
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 return element.getText();
	 }
	 
	 public boolean isElementDisplayed(By locator) {
	        try {
	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	            return element.isDisplayed();
	        } catch (Exception e) {
	            return false;
	        }
}
}
