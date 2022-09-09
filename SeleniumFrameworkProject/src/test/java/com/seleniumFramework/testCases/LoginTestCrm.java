        package com.seleniumFramework.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.seleniumFramework.pages.BaseClass;
import com.seleniumFramework.pages.LoginPage;
import com.seleniumFramework.utility.BrowserFactory;

public class LoginTestCrm extends BaseClass{

	
	@Test
	public void loginApp()
	{
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		lp.loginToPortal(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		
	//initElements
	
	}
}
