package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public static WebDriver driver;		// Edge					// we have call the diver what we entered in runner class
	
	@FindBy(xpath = "//select[@id='location']")
	private static WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomNo;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkIn;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkOut;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultsNo;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childNo;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search_Button;
	
	@FindBy(xpath = "//input[@id='Reset']")
	private WebElement reset_Button;

	public Search_Hotel(WebDriver driver2) {						// This is the Constructor which we given in runner class
		Search_Hotel.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultsNo() {
		return adultsNo;
	}

	public WebElement getChildNo() {
		return childNo;
	}

	public WebElement getSearch_Button() {
		return search_Button;
	}

	public WebElement getReset_Button() {
		return reset_Button;
	}
	
}
