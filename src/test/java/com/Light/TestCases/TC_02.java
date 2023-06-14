package com.Light.TestCases;

import org.testng.annotations.Test;

import com.Light.POM.Dropdown;
import com.Light.TestBase.BaseClass;

public class TC_02 extends BaseClass{

	@Test
	
	public void dp()
	{
		Dropdown d=new Dropdown(driver);
		d.data();

	}
	
}
