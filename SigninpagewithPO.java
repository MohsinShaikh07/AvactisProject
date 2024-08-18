package com.avactis.pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class SigninpagewithPO {
	WebDriverWait wait;
	private WebDriver driver;
	private SignIn signin;

	@Test
	public void testSignin() throws InterruptedException {
		signin.signin("monu.shaikh07@gmail.com", "Avactis123");
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Avactis Project\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		signin = new SignIn(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        signin = new SignIn(driver);

	}

	@AfterClass
	public void afterClass() {
		if (driver != null) {
			driver.quit();
		}

	}

}
