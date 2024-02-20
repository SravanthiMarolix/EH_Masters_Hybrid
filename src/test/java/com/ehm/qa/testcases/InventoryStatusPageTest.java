package com.ehm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.InventoryStatusPage;
import com.ehm.qa.pages.LoginPage;

public class InventoryStatusPageTest extends BaseTest{
	
	LoginPage loginpage;
	HomePage homepage;
	InventoryStatusPage inventoryStatuspage;

	public InventoryStatusPageTest() throws Throwable {
		super();
	}

	@BeforeMethod
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		homepage = loginpage.VerifyEhomeLoginPage();
		inventoryStatuspage = homepage.VerifyInventStatusPageDashboard();	
	}
	@Test
	public void VerifyInventoryStatusPageTitleTest()
	{
		String title = inventoryStatuspage.VerifyInventoryStatusPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	@Test
	public void VerifyInventoryStatusPageTest() throws Throwable
	{
		inventoryStatuspage = inventoryStatuspage.VerifyInventoryStatusPage();
	}
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}

}
