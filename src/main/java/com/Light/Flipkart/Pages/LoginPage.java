package com.Light.Flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Light.utilities.WebDriverUtilities;

public class LoginPage {

	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div[@class=\"IiD88i _351hSN\"]//input[@type=\"text\"]")
	private WebElement Email;
	
	
	@FindBy(xpath = "//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")
	private WebElement request;
	
	
	
	public void loginData(String email) throws InterruptedException
	{
		Email.sendKeys(email);
		request.click();
		Thread.sleep(20000);
		
	}
	
	
}
