package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage02 {
	
	public static WebDriver driver;

	@FindBy(xpath="//table[@class='table']/tbody/tr[3]/td[1]")
	private WebElement chooseTheFlight;

	public PomPage02(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getChooseTheFlight() {
		return chooseTheFlight;
	}

}
