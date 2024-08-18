package com.avactis.pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import com.avactis.pages.*;
public class RegistrationpagewithPO  {
	WebDriverWait wait;
	private WebDriver driver;
    private Register register;
	
	
  @Test
  public void testRegister()throws InterruptedException  {
	  register.register("monu.shaikh07@gmail.com", "Avactis123", "Avactis123", "MOHSIN", "SHAIKH", "India", "MAHARASHTRA", "12345", 
			  "MUMBAI", "USD ONXY", "MIRA ROAD", "998705235");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Avactis Project\\chromedriver-win64\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  register = new Register(driver);
  }

  @AfterClass
  public void afterClass() {
	if (driver != null) {
		driver.quit();
	}
  }

}

