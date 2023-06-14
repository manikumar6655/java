package com.Light.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasiControls {

	
	
	
	   WebDriver driver;
	
	public BasiControls(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(id ="firstName")
	 private WebElement firstName;
	
	@FindBy(id ="lastName")
	 private WebElement lastName;
	
	@FindBy(id ="malerb")
	 private WebElement malerb;
	
	@FindBy(id ="englishchbx")
	 private WebElement englishchbx;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="registerbtn")
	private WebElement registerbtn;
	
	
	
	
	public void data(String firstname,String lastname,String ema1il)
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		malerb.click();
		englishchbx.click();
		email.sendKeys(ema1il);
		
		

	}
	
	
	
	
}
