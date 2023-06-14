package com.Minnwest.Tests;

import org.testng.annotations.Test;
import com.Light.TestBase.BaseClass;
import com.Minnwest.Pages.LoginPage;

public class TC_001Login extends BaseClass{

	@Test
	public void LoginTest() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		Thread.sleep(2000);
		l.getData();
		
	}
	
	
	
}
