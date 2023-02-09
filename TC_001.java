package com.opencart.com.opencart.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.amazon.pageobjects.PageObjects;

public class TC_001 {
	private static WebDriver driver;

	@Test // (dataProvider = "TC_001",dataProviderClass = Dataprovider.class)
	public static void TestCase1() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\thamodharan.p\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

// creating action method 

		PageObjects PageObj = new PageObjects(driver);

		driver.manage().window().maximize();// calling in order to sign-in button  
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Thread.sleep(2000);
		PageObj.clickSigninButton();// calling in order to send mail id
		Thread.sleep(2000);
		PageObj.SendEmail("6383626476");
//calling in order to click on continue button
		Thread.sleep(2000);
		PageObj.continueButton();
// calling in order send password
		Thread.sleep(2000);
		PageObj.SendPass("amazon pass");
//calling in order to submit
		Thread.sleep(3000);
		PageObj.submit();

		driver.close();
		// extent.flush();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		TC_001.driver = driver;
	}
}
































/*
 * ExtentReports extent=new ExtentReports(); ExtentHtmlReporter spark=new
 * ExtentHtmlReporter(
 * "C:\\Users\\thamodharan.p\\eclipse-mainlab\\report.html");
 * extent.attachReporter(spark); ExtentTest
 * test=extent.createTest("Verify the Daily Deals functionality");Actions act =
 * new Actions(driver);
 */