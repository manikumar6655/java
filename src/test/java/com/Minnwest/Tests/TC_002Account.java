package com.Minnwest.Tests;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Light.TestBase.BaseClass;
import com.Minnwest.Pages.AccountBalance;

public class TC_002Account extends BaseClass{

	
	TC_001Login tc2=new TC_001Login();

	@Test
	public void getBalance() throws InterruptedException
	{



		tc2.LoginTest();
		Thread.sleep(2000);
		AccountBalance ab=new AccountBalance(driver);
		Thread.sleep(2000);
		ab.getBalance();


	}
}
