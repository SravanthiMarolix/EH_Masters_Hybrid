package com.ehm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ehm.qa.base.BaseTest;

public class HomePage extends BaseTest {

	@FindBy(xpath = "//i[@class='fa fa-database']")
	WebElement masters;
	
	@FindBy(xpath = "//a[@href='/Master/Usertypes']")
	WebElement usertypes;
	
	@FindBy(xpath = "//a[text()='Categories']")
	WebElement category;
	
	@FindBy(xpath = "//a[text()='Sub Categories']")
	WebElement subcategory;
	
	@FindBy(xpath = "//a[text()='Location ']")
	WebElement location;
	
	@FindBy(xpath = "//a[text()='Condition']")
	WebElement condition;
	
	@FindBy(xpath = "//a[text()='Inventory Status']")
	WebElement inventoryStatus;
	
	@FindBy(xpath = "//a[text()='Holidays']")
	WebElement holidays;
	
	@FindBy(xpath = "//a[text()='Shifts']")
	WebElement shifts;
	
	@FindBy(xpath = "//a[text()='MRP Factors']")
	WebElement mrpfactor;
	
	public HomePage() throws Throwable {
		super();
	PageFactory.initElements(driver, this);
	}
	
	public String VerifyEhomePageTitle()
	{
		return driver.getTitle();
	}
	public UserTypePage VerifyEHUserpageDashboard() throws Throwable
	{
		Thread.sleep(2000);
		masters.click();
		Thread.sleep(2000);
		usertypes.click();
		return new UserTypePage();	
	}
	public CategoryPage VerifyEHCategorypageDashboard() throws Throwable
	{
		Thread.sleep(2000);
		masters.click();
		Thread.sleep(2000);
		category.click();
		return new CategoryPage();
	}
	public SubCategoryPage VerifySubCategoryPageDashboard() throws Throwable
	{
		Thread.sleep(2000);
		masters.click();
		Thread.sleep(2000);
		subcategory.click();
		return new SubCategoryPage();
	}
	public LocationPage VerifyLocationPageDashboard() throws Throwable
	{
		Thread.sleep(2000);
		masters.click();
		Thread.sleep(2000);
		location.click();
		return new LocationPage();
	}
	public ConditionPage VerifyConditionPageDashboard() throws Throwable
	{
		Thread.sleep(2000);
		masters.click();
		Thread.sleep(2000);
		condition.click();
		return new ConditionPage();
	}
	public InventoryStatusPage VerifyInventStatusPageDashboard() throws Throwable
	{
		Thread.sleep(2000);
		masters.click();
		Thread.sleep(2000);
		inventoryStatus.click();
		return new InventoryStatusPage();
	}
	public HolidaysPage VerifyHolidaysPageDashboard() throws Throwable
	{
		Thread.sleep(2000);
		masters.click();
		Thread.sleep(2000);
		holidays.click();
		return new HolidaysPage();
	}
	public ShiftsPage VerifyShiftsPageDashboard() throws Throwable
	{
		Thread.sleep(2000);
		masters.click();
		Thread.sleep(2000);
		shifts.click();
		return new ShiftsPage();
	}
	public MRPFactorPage VerifyMRPFactorPageDashboard() throws Throwable
	{
		Thread.sleep(2000);
		masters.click();
		Thread.sleep(2000);
		mrpfactor.click();
		return new MRPFactorPage();
	}

}
