package com.ehm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.UserTypePage;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.LoginPage;

public class HomePageTest extends BaseTest {

	LoginPage loginpage;
	HomePage homepage;
	UserTypePage usertypepage;
		
	public HomePageTest() throws Throwable {
		super();
	}

	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		usertypepage = new UserTypePage();
		homepage = loginpage.VerifyEhomeLoginPage();
	}
	@Test
	public void VerifyEhomePageTitleTest()
	{
		String title = homepage.VerifyEhomePageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
	@Test
	public void VerifyHomepageDashboardTest() throws Throwable
	{
		usertypepage = homepage.VerifyEHUserpageDashboard();
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}
	
}
