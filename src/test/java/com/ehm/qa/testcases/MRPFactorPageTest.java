package com.ehm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.LoginPage;
import com.ehm.qa.pages.MRPFactorPage;

public class MRPFactorPageTest extends BaseTest{
	
	LoginPage loginpage;
	HomePage homepage;
	MRPFactorPage mrpfactorpage;

	public MRPFactorPageTest() throws Throwable {
		super();
	}
	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.VerifyEhomeLoginPage();
		mrpfactorpage = homepage.VerifyMRPFactorPageDashboard();
	}
	@Test
	public void VerifyInventoryStatusPageTitleTest()
	{
		String title = mrpfactorpage.VerifyMRPFactorPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	@Test
	public void VerifyInventoryStatusPageTest() throws Throwable
	{
		mrpfactorpage = mrpfactorpage.VerifyMRPFactorPage();
	}
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}


}
