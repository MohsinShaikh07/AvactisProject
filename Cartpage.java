package com.avactis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Cartpage {
    WebDriver driver;

    // Locate the cart item names using @FindBy with XPath
    @FindBy(xpath = "//div[@class='cart-item']//span[@class='item-name']")
    private List<WebElement> cartItemsElements;

    @FindBy(name = "Checkout")
    private WebElement proceedToCheckoutButton;
    
    // Constructor to initialize the elements
    public Cartpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to get the names of the items in the cart
    public String[] getCartItems() {
        String[] cartItems = new String[cartItemsElements.size()];
        for (int i = 0; i < cartItemsElements.size(); i++) {
            cartItems[i] = cartItemsElements.get(i).getText();
        }
        return cartItems;
    }
        
        public void proceedToCheckout() {
            proceedToCheckoutButton.click();
    }
}