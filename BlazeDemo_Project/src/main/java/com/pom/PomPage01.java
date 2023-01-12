package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage01 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='destination of the week! The Beach!']")
	private WebElement destination;
	
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement departureCity;
	
	@FindBy(xpath="//select[@name='toPort']")
	private WebElement destinationCity;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement findFlights;
	
	
	public WebElement getFindFlights() {
		return findFlights;
	}

	public WebElement getDepartureCity() {
		return departureCity;
	}

	public WebElement getDestinationCity() {
		return destinationCity;
	}

	public PomPage01(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getDestination() {
		return destination;
	}
	
	
	
	

}
