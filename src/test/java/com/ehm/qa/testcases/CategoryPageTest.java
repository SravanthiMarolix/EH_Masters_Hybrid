package com.ehm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.CategoryPage;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.LoginPage;

public class CategoryPageTest extends BaseTest{
	
	LoginPage loginpage;
	HomePage homepage;
	CategoryPage categorypage;

	public CategoryPageTest() throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		categorypage = new CategoryPage();
		homepage = loginpage.VerifyEhomeLoginPage();
		categorypage = homepage.VerifyEHCategorypageDashboard();
	}
	@Test
	public void VerifyCategoryPageTitleTest()
	{
		String title = categorypage.VerifyCategoryPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
	@Test
	public void VerifyCategoryPageTest() throws Throwable
	{
		categorypage = categorypage.VerifyCategoryPage();
	}
	
	@AfterMethod
	public void teardown()
	{
	//	driver.quit();
	}
}
