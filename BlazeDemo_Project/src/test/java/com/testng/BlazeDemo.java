package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pom.PomPage01;
import com.pom.PomPage02;
import com.pom.PomPage03;
import com.pom.PomPage04;

public class BlazeDemo {

	public static WebDriver driver;

	PomPage01 p;
	PomPage02 p1;
	PomPage03 p2;
	PomPage04 p3;

	@BeforeSuite
	private void browserLaunch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mages\\OneDrive\\Desktop\\v\\New folder\\BlazeDemo_Project\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://blazedemo.com/index.php");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	private void pageOne() throws InterruptedException {
		p = new PomPage01(driver);
		p.getDestination().click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		Select s = new Select(p.getDepartureCity());

		s.selectByIndex(5);
		Thread.sleep(2000);

		Select s1 = new Select(p.getDestinationCity());

		s1.selectByIndex(2);
		Thread.sleep(2000);

		p.getFindFlights().click();

	}

	@Test(priority = 2)
	private void pageTwo() throws InterruptedException {

		p1 = new PomPage02(driver);
		Thread.sleep(2000);

		p1.getChooseTheFlight().click();
	}

	@Test(priority = 3)
	@Parameters({ "firstName", "address", "city", "state", "zip", "cardType", "cardNumber", "month", "year",
			"nameOfCard" })
	private void pageThree(String firstName, String address, String city, String state, String zip, String cardType,
			String cardNumber, String month, String year, String nameOfCard) throws InterruptedException {

		p2 = new PomPage03(driver);
		p2.getFirstName().sendKeys(firstName);
		Thread.sleep(2000);

		p2.getAddress().sendKeys(address);
		Thread.sleep(2000);

		p2.getCity().sendKeys(city);
		Thread.sleep(2000);

		p2.getState().sendKeys(state);
		Thread.sleep(2000);

		p2.getZipCode().sendKeys(zip);

		p2.getCardType().sendKeys(cardType);

		p2.getCreditCardNumber().sendKeys(cardNumber);
		Thread.sleep(2000);

		p2.getCreditCardMonth().sendKeys(month);
		Thread.sleep(2000);

		p2.getCreditCardYear().sendKeys(year);

		p2.getNameOnCard().sendKeys(nameOfCard);
		Thread.sleep(2000);

		p2.getPurchaseFlight().click();

	}

	@Test(priority = 4)
	private void pageFour() {

		p3 = new PomPage04(driver);
		String id = p3.getId().getText();
		System.out.println(id);
	}

}
