package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage03 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='First Last']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@name='zipCode']")
	private WebElement zipCode;
	
	@FindBy(xpath="//select[@name='cardType']")
	private WebElement cardType;
	
	@FindBy(xpath="//input[@name='creditCardNumber']")
	private WebElement creditCardNumber;
	
	@FindBy(xpath="//input[@name='creditCardMonth']")
	private WebElement creditCardMonth;
	
	@FindBy(xpath="//input[@name='creditCardYear']")
	private WebElement creditCardYear;
	
	@FindBy(xpath="//input[@name='nameOnCard']")
	private WebElement nameOnCard;
	
	public PomPage03(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardMonth() {
		return creditCardMonth;
	}

	public WebElement getCreditCardYear() {
		return creditCardYear;
	}

	public WebElement getNameOnCard() {
		return nameOnCard;
	}

	public WebElement getPurchaseFlight() {
		return purchaseFlight;
	}

	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement purchaseFlight;
	
	


}
