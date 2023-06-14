package com.Minnwest.Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class AccountBalance {



	 WebDriver driver;

	public AccountBalance(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBys(value = { @FindBy(xpath = "//div[@kw=\"ComponentWithoutContract\"]") })
	List<WebElement>elfe;
	
	@FindBy(xpath = "//div[@class='CopyslFbox']")private WebElement s;

	

	

	public void getBalance() throws InterruptedException
	{
	 for (WebElement webElement : elfe) {
		 
		 if(s.equals(webElement))
		 {
			 Thread.sleep(2000);
			 System.out.println(s.getText());
		 }
		 System.out.println("Mani");
		
		
	}
		
		
		
	}







}
