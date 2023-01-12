package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage04 {
	public static WebDriver driver;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr[1]/td[2]")
	private WebElement id;

	public PomPage04(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getId() {
		return id;
	}
	
	
}
