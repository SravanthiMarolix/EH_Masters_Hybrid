package com.ehm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.utils.UtilsTest;

public class ShiftsPage extends BaseTest{
	
	@FindBy(name="mydatatable_length")
	WebElement show;
	
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search; 

	@FindBy(xpath = "//a[@href='/Master/ShiftTypedata?id=99']")
	WebElement edit; 

	@FindBy(xpath = "//a[@onclick='ShowDelete(99)']")
	WebElement delbtn; 

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yesbtn;

	@FindBy(xpath = "//button[text()='No']")
	WebElement nobtn;

	@FindBy(xpath = "//a[@href='/Master/ShiftTypedata']")
	WebElement addnew;

	@FindBy(xpath = "//button[@class='btn btn-success serchgaptop ']")
	WebElement save;

	@FindBy(name="ShiftName")
	WebElement shiftname;
	
	@FindBy(xpath = "//input[@name='StartTime']")
	WebElement starttime;

	@FindBy(name="EndTime")
	WebElement endtime;
	
	@FindBy(xpath = "//a[text()='Next']")
	WebElement next;

	@FindBy(xpath = "//a[text()='Previous']")
	WebElement previous;

	@FindBy(xpath = "//th[@aria-sort='ascending']")
	WebElement arrow;
	
	public ShiftsPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyShiftsPageTitle()
	{
		return driver.getTitle();
	}
	public ShiftsPage VerifyShiftsPage() throws Throwable
	{
		UtilsTest.Dropdown(show, "10");
		Thread.sleep(2000);
		search.sendKeys("General");
		Thread.sleep(2000);
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
//		Thread.sleep(2000);
//		previous.click();
//		Thread.sleep(2000);
//		next.click();
//		Thread.sleep(2000);
//		arrow.click();
//		Thread.sleep(2000);
		addnew.click();
		Thread.sleep(2000);
		shiftname.sendKeys("Work From Home");
		Thread.sleep(2000);
		starttime.sendKeys("09:00");
    	Thread.sleep(2000);
    	endtime.sendKeys("06:00");
		Thread.sleep(2000);
		save.click();
		return new ShiftsPage();
	}
}
