package com.ehm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ehm.qa.base.BaseTest;

public class HolidaysPage extends BaseTest{
	
	@FindBy(xpath = "//a[@href='/Master/HolidayTypedata?id=537']")
	WebElement edit;
	
	@FindBy(xpath = "//a[@onclick='ShowDelete(537)']")
	WebElement delbtn;
	
	@FindBy(xpath = "//button[text()='No']")
	WebElement nobtn;

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yesbtn;
	
	@FindBy(xpath = "//a[@href='/Master/HolidayTypedata']")
	WebElement addnew;
	
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	
	@FindBy(name="HolidayDate")
	WebElement holidaydate;
	
	@FindBy(name="HolidayName")
	WebElement holidayname;
	
	@FindBy(id="HolidayDesc")
	WebElement holidaydes;
	

	public HolidaysPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyHolidaysPageTitle()
	{
		return driver.getTitle();
	}
	public HolidaysPage VerifyHolidaysPage() throws Throwable
	{
//		Thread.sleep(2000);
//		edit.click();
//		Thread.sleep(2000);
//		save.click();
//		Thread.sleep(2000);
//		delbtn.click();
//		Thread.sleep(2000);
//		nobtn.click();
//		Thread.sleep(2000);
//		delbtn.click();
//		Thread.sleep(2000);
//		yesbtn.click();
		Thread.sleep(2000);
		addnew.click();
		Thread.sleep(2000);
		holidaydate.sendKeys("01/26/2024");
		Thread.sleep(2000);
		holidayname.sendKeys("Republic Day");
		Thread.sleep(2000);
		holidaydes.sendKeys("Indian Constitution Formation day");
		Thread.sleep(2000);
		save.click();
		return new HolidaysPage();
	}
	
}
