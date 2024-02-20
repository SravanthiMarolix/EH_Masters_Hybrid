package com.ehm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ehm.qa.utils.UtilsTest;
import com.ehm.qa.base.BaseTest;
import com.ehm.qa.pages.UserTypePage;
import com.ehm.qa.pages.HomePage;
import com.ehm.qa.pages.LoginPage;

public class UserTypePageTest extends BaseTest{

	LoginPage loginpage;
	HomePage homepage;
	UserTypePage usertypepage;
	static String sheet = "Sheet1";

	public UserTypePageTest() throws Throwable {
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
		usertypepage = homepage.VerifyEHUserpageDashboard();
	}
	
	@Test
	public void VerifyAddUserTypePageTitle()
	{
		String title = homepage.VerifyEhomePageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
	@DataProvider
	public Object[][] ExcelData() throws Throwable
	{
		Object[][] data = UtilsTest.getExcelData(sheet);
		return data;
	}
	
	@Test(dataProvider = "ExcelData")
	public void VerifyAddUserTypePageTest(String TypeName, String TypeCode) throws Throwable
	{
		usertypepage = usertypepage.VerifyAddUserTypePage(TypeName, TypeCode);
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}
}
