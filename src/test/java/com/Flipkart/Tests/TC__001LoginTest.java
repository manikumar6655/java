package com.Flipkart.Tests;

import org.testng.annotations.Test;

import com.Light.Flipkart.Pages.LoginPage;
import com.Light.TestBase.BaseClass;
import com.google.gson.stream.JsonReader;

public class TC__001LoginTest extends BaseClass {

	
	@Test(dataProvider = "FlipkartLogin",dataProviderClass = JsonReader.class)
	public void LoginTest(String data) throws InterruptedException
	{
   	   String []ar=data.split(",");
		LoginPage l=new LoginPage(driver);
		l.loginData(ar[0]);
		
				
				
	}
	
	
	
	
	
}
