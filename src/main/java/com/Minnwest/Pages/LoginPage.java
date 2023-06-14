package com.Minnwest.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Light.TestBase.BaseClass;

public class LoginPage extends BaseClass{

	//public static Properties config = new Properties();
	

	 public WebDriver driver;
	 
	 public LoginPage(WebDriver driver)
	 {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		
	 }   
	
	 @FindBy(xpath ="//input[@aria-placeholder='Username']")  private WebElement email;
	
	 @FindBy(xpath = "//input[@aria-placeholder='Password']") private WebElement password;
	 
	 @FindBy(xpath = "//label[text()='LOG IN']") private WebElement btn;

	 
	
	
	public void getData() throws InterruptedException
	{
		Thread.sleep(3000);
		email.sendKeys(config.getProperty("email"));
		Thread.sleep(3000);
		password.sendKeys(config.getProperty("password"));
		btn.click();
		
	}
	
}
