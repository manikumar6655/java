package com.Light.TestCases;

import org.testng.annotations.Test;
import com.Light.POM.BasiControls;
import com.Light.TestBase.BaseClass;
import com.google.gson.stream.JsonReader;

public class TC_001LO extends BaseClass{


	//	@Test
	//	public void test() {
	//
	//		
	//		BasiControls v= new BasiControls(driver);
	//		v.data();
	//
	//	}


	@Test(dataProvider = "xyz",dataProviderClass =JsonReader.class)
	public void dataTest(String value)
	{
		String[]cred=value.split(",");
		BasiControls bs=new BasiControls(driver);
		bs.data(cred[0],cred[1],cred[2]);



	}

	@Test(dependsOnMethods ="fail")
	public void skip()
	{
		System.out.println("Mani Skipped");


	}

	@Test(timeOut = 1000)
	public void fail() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Failed Method");


	}


}
