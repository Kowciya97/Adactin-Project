package com.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Default.ScreenRecorderUtil;
import com.adactin.Book_Hotel;
import com.adactin.Booking_Confirmation;
import com.adactin.Login_Page;
import com.adactin.Search_Hotel;
import com.adactin.Search_Room;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.base.Base_Class_1;

public class adactin_Runner_Class extends Base_Class_1 {			// using extends to call Base Class methods

	public static void main(String[] args) throws Exception {
		
		ScreenRecorderUtil.startRecord("main");						// To start the screen recorder
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);				// Once call driver we can initialize driver to main java source
		
		Url(driver, "https://adactinhotelapp.com/");
		
		maxi(driver);
		
		// create the object for Login_Page and create constructor - give same name as it is class name
		
		// Login Page
		
		Login_Page login = new Login_Page(driver);
		
		input_value(login.getUserName(), "kowciya97");
		
		input_value(login.getPassword(), "C53LLE");
		
		Thread.sleep(2000);
		click(login.getLogin_Button());
		
		// Search Hotel Page
		
		Search_Hotel hotel = new Search_Hotel(driver);
		
		select_Value(hotel.getLocation(), "London");
		
		select_Value(hotel.getHotels(), "Hotel Sunshine");
		
		select_Value(hotel.getRoomType(), "Double");
		
		select_Index(hotel.getRoomNo(), 3);
		
		clear(hotel.getCheckIn());
		
		input_value(hotel.getCheckIn(), "21/07/2023");
		
		clear(hotel.getCheckOut());
		
		input_value(hotel.getCheckOut(), "23/07/2023");
		
		select_Index(hotel.getAdultsNo(), 2);
		
		select_Index(hotel.getChildNo(), 1);
		
		click(hotel.getSearch_Button());
		
		// Select Hotel Room
		
		Search_Room room = new Search_Room(driver);

		click(room.getRadio_button());
		
		click(room.getContinue_Button());
		
		// Book Hotel
		
		pagedown(driver);
		
		Book_Hotel b = new Book_Hotel(driver);
		
		input_value(b.getFirstName(), "Kowciya");
		
		input_value(b.getLastName(), "S");
		
		input_value(b.getAddress(), "46, cumbum-625516");
		
		input_value(b.getCreditCardNo(), "2222333344445555");
		
		select_Index(b.getCardType(), 2);
		
		select_Index(b.getExpMonth(), 1);
		
		select_Index(b.getExpYear(), 20);
		
		input_value(b.getCcvNo(), "121");
		
		click(b.getBookNow_Button());
		
		// Booking Confirmation
		
		Booking_Confirmation bc = new Booking_Confirmation(driver);
		
		click(bc.getLogOut());
		
		
		// Get Extent Report
		
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("./ExtentReport_1.html");
        
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        ExtentTest test = extent.createTest("Adactin Hotel Application", "Test to validate hotel submission");
        
        test.log(Status.INFO, "Starting Test Case");
        test.pass("Navigated to adactin.com");
        test.pass("Booking Confirmation");
        test.info("Test Completed");
        extent.flush();
        
        ScreenRecorderUtil.stopRecord();								// To stop the screen recorder
           
	}
}
