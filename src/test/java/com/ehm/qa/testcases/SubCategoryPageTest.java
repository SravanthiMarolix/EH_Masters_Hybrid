package com.ehm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.LoginPage;
import com.ehm.qa.pages.SubCategoryPage;

public class SubCategoryPageTest extends BaseTest{
	
	LoginPage loginpage;
	HomePage homepage;
	SubCategoryPage subcategorypage;

	public SubCategoryPageTest() throws Throwable {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		subcategorypage = new SubCategoryPage();
		homepage = loginpage.VerifyEhomeLoginPage();
		subcategorypage = homepage.VerifySubCategoryPageDashboard();
	}
	@Test
	public void VefirySubcategoryPageTitleTest()
	{
		String title = subcategorypage.VerifySubcategoryPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
	@Test
	public void VerifySubcategoryPageTest() throws Throwable
	{
		subcategorypage = subcategorypage.VerifySubcategoryPage();
	}
	
	@AfterMethod
	public void teardown()
	{
	//	driver.quit();
	}

	

}
