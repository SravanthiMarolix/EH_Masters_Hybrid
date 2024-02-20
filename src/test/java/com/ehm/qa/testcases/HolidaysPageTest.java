package com.ehm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.HolidaysPage;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.LoginPage;

public class HolidaysPageTest extends BaseTest{

	LoginPage loginpage;
	HomePage homepage;
	HolidaysPage holidayspage;

	public HolidaysPageTest() throws Throwable {
		super();
	}

	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.VerifyEhomeLoginPage();
		holidayspage = homepage.VerifyHolidaysPageDashboard();	
	}
	@Test
	public void VerifyHolidaysPageTitleTest()
	{
		String title = holidayspage.VerifyHolidaysPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	@Test
	public void VerifyHolidaysPageTest() throws Throwable
	{
		holidayspage = holidayspage.VerifyHolidaysPage();
	}
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}

}
