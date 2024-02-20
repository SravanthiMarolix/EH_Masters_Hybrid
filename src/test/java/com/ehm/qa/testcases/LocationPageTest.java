package com.ehm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.LocationPage;
import com.ehm.qa.pages.LoginPage;

public class LocationPageTest extends BaseTest{
	
	LoginPage loginpage;
	HomePage homepage;
	LocationPage locationpage;

	public LocationPageTest() throws Throwable {
		super();
	}

	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.VerifyEhomeLoginPage();
		locationpage = homepage.VerifyLocationPageDashboard();	
	}
	@Test
	public void VerifyLocationPageTitleTest()
	{
		String title = locationpage.VerifyLocationPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	@Test
	public void VerifyLocationPageTest() throws Throwable
	{
		locationpage = locationpage.VerifyLocationPage();
	}
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}
}
