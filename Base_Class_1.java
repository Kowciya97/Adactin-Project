package com.base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_1 {		
	
	// WebDriver Methods	
	
	public static void Url(WebDriver d, String s) {
		d.get(s);
	}
	
	public static void title(WebDriver d, String s) {
		String title = d.getTitle();
		System.out.println("The Title is:" + title);
	}
	
	public static void navigate(WebDriver d, String s) {
		d.navigate().to(s);
	}
	 
	public static void url_Current(WebDriver d) {
		String currentUrl = d.getCurrentUrl();
		System.out.println("The CurrentUrl is:" + currentUrl);
	}
	
	public static void maxi(WebDriver d) {
		d.manage().window().maximize();
	}
	
	// WebElement Methods
	
	public static void input_value(WebElement e, String s) {
		e.sendKeys(s);												// sendKeys() method
	}
	
	public static void clear(WebElement e) {
		e.clear();													// clear() method
	}
	
	public static void get_attribute(WebElement e, String s) {
		String attri = e.getAttribute(s);
		System.out.println("The Atribute Value is:" + attri);		// getAttribute() method
	}
	
	public static void get_size(WebElement e) {
		Dimension size = e.getSize();
		System.out.println("The Size is:" + size);					// getSize() method
	}
	
	public static void click(WebElement e) {
		e.click();                                                  // click() method
	}
	
	public static void isselected(WebElement e) {
		e.isSelected();                                                  // click() method
	}
	
	public static void isenabled(WebElement e) {
		e.isEnabled();                                                  // click() method
	}
	
	
	// Select Class
		
	public static void select_Value(WebElement e, String s) {
		Select sel = new Select(e);									
		sel.selectByValue(s);										// SelectByValue()
	}
	
	public static void select_Index(WebElement e, int i) {
		Select sel1 = new Select(e);
		sel1.selectByIndex(i);
	}
	
	// action class using scroll down
	
	public static void pagedown(WebDriver d) {
		Actions act = new Actions(d);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	// radio button
	
	public static WebElement radioBtn(WebElement e) {
		Actions act1 = new Actions((WebDriver) e);
		act1.moveToElement(radioBtn(e));
		act1.perform();
		return null;
	}
	
	
    }


