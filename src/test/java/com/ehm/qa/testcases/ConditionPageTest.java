package com.ehm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.ConditionPage;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.LoginPage;

public class ConditionPageTest extends BaseTest{
	
	LoginPage loginpage;
	HomePage homepage;
	ConditionPage conditionpage;

	public ConditionPageTest() throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.VerifyEhomeLoginPage();
		conditionpage = homepage.VerifyConditionPageDashboard();	
	}
	@Test
	public void VerifyConditionPageTitleTest()
	{
		String title = conditionpage.VerifyConditionPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	@Test
	public void VerifyConditionPageTest() throws Throwable
	{
		conditionpage = conditionpage.VerifyConditionPage();
	}
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}


}
