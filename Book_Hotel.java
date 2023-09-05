package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName; 
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement creditCardNo;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardType;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expMonth;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expYear;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement ccvNo;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement bookNow_Button;
	
	@FindBy(xpath = "//input[@id='cancel']")
	private WebElement cancel_Button;
	
	public Book_Hotel(WebDriver driver2) {						// This is the Constructor which we given in runner class
		Book_Hotel.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCcvNo() {
		return ccvNo;
	}

	public WebElement getBookNow_Button() {
		return bookNow_Button;
	}

	public WebElement getCancel_Button() {
		return cancel_Button;
	}
	
	
}
