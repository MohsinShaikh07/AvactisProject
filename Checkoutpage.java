package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Checkoutpage {
    @FindBy (xpath = "//input [@name= 'billingInfo[Firstname]']")
	private WebElement billaddfirstnamefield;
    @FindBy (name = "billaddlastnamefield")
	private  WebElement billaddlastnamefield;
    @FindBy (name = "billemailfield")
	private WebElement billemailfield;
    @FindBy (xpath = "//select[@name= 'billingInfo[Country]']")
	private WebElement Countryfield;
    @FindBy (name = "Zipcodefield")
	private WebElement Zipcodefield;
    @FindBy (name = "Statefield")
	private WebElement Statefield;
    @FindBy (name = "billcityfield")
	private WebElement billcityfield;
    @FindBy (name = "ContactPhonefield ")
	private WebElement ContactPhonefield;
	
    @FindBy (name = "shipaddfirstnamefield")
	private WebElement shipaddfirstnamefield;
    @FindBy (name = "shipaddlastnamefield")
	private WebElement shipaddlastnamefield;
    @FindBy (xpath = "//select[@name='shippingInfo[Country]']")
	private WebElement shipCountryfield;
    @FindBy (name = "shipZipcodefield")
	private WebElement shipZipcodefield;
    @FindBy (xpath = "//select[@name='shippingInfo[Statemenu]']")
	private WebElement shipstatefield;
    @FindBy (xpath = "//input[@onclick='submitStep(1);']")
    private WebElement ContinueCheckout;
	@FindBy (xpath = "//input [@name = 'billingInfo[Streetline1]']")
    private WebElement Addressline1;
	
    
    WebDriver driver;
    
	public Checkoutpage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();       
        PageFactory.initElements(driver, this);
        
    }
	
	public void checkout (String billfirstname, String billlastname, String billemail, String billcountry, String billZipcode, 
			              String billstatefield, String cityfield, String billcontactphonefield, String shipfirstname, 
			              String shiplastname, String shipbillcountry, String shipbillZipcode, String shipstate) {
	
		billaddfirstnamefield.sendKeys(billfirstname);
		billaddlastnamefield.sendKeys(billlastname);
		billemailfield.sendKeys(billemail);
		selectDropdown(Countryfield, billcountry);
		Zipcodefield.sendKeys(billZipcode);
		selectDropdown (Statefield, billstatefield);
		billcityfield.sendKeys(cityfield);
		ContactPhonefield.sendKeys(billcontactphonefield);
		
		shipaddfirstnamefield.sendKeys(shipfirstname);
		shipaddlastnamefield.sendKeys(shiplastname);
		selectDropdown (shipCountryfield,shipbillcountry);
		shipZipcodefield.sendKeys(shipbillZipcode);
		selectDropdown (shipstatefield, shipstate);
		ContinueCheckout.click();
		String ActualAddressline1 = Addressline1.getText();
		String ExpectedAddressline1 = "Triveni Nagar Kurar Village Malad East";
		Assert.assertEquals(ActualAddressline1, ExpectedAddressline1);
	}

	private void selectDropdown(WebElement countryfield2, String billcountry) {
		// TODO Auto-generated method stub
		
	}
}
