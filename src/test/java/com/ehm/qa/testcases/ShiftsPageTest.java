package com.ehm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.LoginPage;
import com.ehm.qa.pages.ShiftsPage;

public class ShiftsPageTest extends BaseTest {

	LoginPage loginpage;
	HomePage homepage;
	ShiftsPage shiftspage;

	public ShiftsPageTest() throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.VerifyEhomeLoginPage();
		shiftspage = homepage.VerifyShiftsPageDashboard();
	}
	@Test
	public void VerifyShiftsPageTitleTest()
	{
		String title = shiftspage.VerifyShiftsPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	@Test
	public void VerifyShiftsPageTest() throws Throwable
	{
		shiftspage = shiftspage.VerifyShiftsPage();
	}
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}

}
