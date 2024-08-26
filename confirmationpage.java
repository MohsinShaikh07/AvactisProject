package com.avactis.pages;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmationpage {

	@FindBy (xpath = "//input[@value='BCE5D24D-666C-43CA-94A0-D6F775903BE2_2']")
	private WebElement groundshippingfield;
	
	@FindBy (xpath= "//input[@onclick='submitStep(2);']")
	private WebElement continuecheckoutbutton;

	private WebDriver driver;
	
	public confirmationpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
}
	
	
	
	public void verifyOrderDetails(String expectedTotalAmount, List<String> expectedProducts) {
        WebElement orderSummary = null;
		String orderDetails = orderSummary.getText();
        assertTrue(orderDetails.contains(expectedTotalAmount));
        for (String product : expectedProducts) {
            assertTrue(orderDetails.contains(product));
        }
    }

    public String getOrderId() {
        WebElement orderId = null;
		return orderId.getText();
    }
}
