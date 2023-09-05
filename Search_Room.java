package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Room {
	
	public static WebDriver driver;	// Edge					// we have call the diver what we entered in runner class
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radio_button ;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_Button ;
	
	@FindBy(xpath = "//input[@id='cancel']")
	private WebElement cancel_Button ;

	public Search_Room(WebDriver driver2) {		// This is the Constructor which we given in runner class
		Search_Room.driver = driver2;
		PageFactory.initElements(driver, this);		
	}

	public WebElement getRadio_button() {
		return radio_button;
	}

	public WebElement getContinue_Button() {
		return continue_Button;
	}

	public WebElement getCancel_Button() {
		return cancel_Button;
	}
}
