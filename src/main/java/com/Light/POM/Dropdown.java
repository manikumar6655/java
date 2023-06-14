package com.Light.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Light.utilities.WebDriverUtilities;

public class Dropdown {

	
	WebDriverUtilities dp=new WebDriverUtilities();
	   WebDriver driver;
		
	public Dropdown(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(id ="course")
	 private WebElement course;
	
	
	
	public void data()
	{
		
		dp.handleDropDown(course, 2);
		
	}
	
	
	
	
	
	
	
}
