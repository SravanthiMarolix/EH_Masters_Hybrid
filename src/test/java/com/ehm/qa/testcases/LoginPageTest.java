package com.ehm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	LoginPage loginpage;
	HomePage homepage;
		
	public LoginPageTest() throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
	}
	
	@Test
	public void VerifyLoginPageTitleTest()
	{
		String title = loginpage.VerifyLoginPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	@Test
	public void VerifyEhomeImageTest()
	{
		Boolean img = loginpage.VerifyEhomeImage();
		Assert.assertTrue(img);
	}
	@Test
	public void VerifyEhomeLoginPageTest() throws Throwable
	{
		homepage = loginpage.VerifyEhomeLoginPage();
	}
	@AfterTest
	public void teardown()
	{
		//driver.quit();
	}

}
