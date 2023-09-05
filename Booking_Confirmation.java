package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

public static WebDriver driver;		// Edge					// we have call the diver what we entered in runner class
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement logOut;
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement itinerary;
	
	@FindBy(xpath = "//input[@id='search_hotel']")
	private WebElement searchHotel;
	
	public Booking_Confirmation(WebDriver driver2) {						// This is the Constructor which we given in runner class
		Booking_Confirmation.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}


	
	
	
}
