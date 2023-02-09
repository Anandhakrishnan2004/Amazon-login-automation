package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects_02 {
	WebDriver driver = null;
	//storing locators into variables
	By SignButton = By.id("nav-link-accountList");
	By Signin = By.linkText("Sign in");
	By Email = By.name("email");
	By ContinuBut = By.xpath("//input[@id='continue']");
	
	public PageObjects_02 (WebDriver driver) {this.driver = driver;}
	//calling all the variables created
	public void clickSignButton() {
	driver.findElement(SignButton).click();;
	}public void clickSigninButton() {
	driver.findElement(Signin).click();
	}
	public void SendEmail(String Text) {
		driver.findElement(Email).sendKeys("638362647631");
	}
	public void continueButton() {
	 driver.findElement(ContinuBut).click();
	}
}
