package com.opencart.com.opencart.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.amazon.pageobjects.PageObjects_02;

public class TC_002 {
	private static WebDriver driver;

	@Test // (dataProvider = "TC_001",dataProviderClass = Dataprovider.class)
	public static void TestCase2() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\thamodharan.p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// creating action method 
		Actions act = new Actions(driver);
		PageObjects_02 PageObj = new PageObjects_02(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// calling in order to sign-in button  
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Thread.sleep(2000);
		PageObj.clickSigninButton();// calling in order to send mail id
		Thread.sleep(2000);
		PageObj.SendEmail("638362647631");
		// calling in order to click on continue button
		Thread.sleep(2000);
		PageObj.continueButton();
		// calling in order send password
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("h4")).getText());
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		TC_002.driver = driver;
	}
}