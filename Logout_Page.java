package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	public static WebDriver driver;						           // we have call the diver what we entered in runner class
	
	
	@FindBy(xpath = "//a[normalize-space()='Click here to login again']")
	private WebElement login_Again;

	public Logout_Page(WebDriver driver2) {						// This is the Constructor which we given in runner class
		Login_Page.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogin_Again() {
		return login_Again;
	}
}
