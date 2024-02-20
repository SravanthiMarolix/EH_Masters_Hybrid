package com.ehm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.utils.UtilsTest;

public class ConditionPage extends BaseTest{
	
	@FindBy(name="mydatatable_length")
	WebElement show;
	
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search; 

	@FindBy(xpath = "//a[@href='/Master/ConditionTypeData?id=499']")
	WebElement edit; 

	@FindBy(xpath = "//a[@onclick='ShowDelete(499)']")
	WebElement delbtn; 

	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yesbtn;

	@FindBy(xpath = "//button[text()='No']")
	WebElement nobtn;

	@FindBy(xpath = "//a[@href='/Master/ConditionTypeData']")
	WebElement addnew;

	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;

	@FindBy(name="ConditionName")
	WebElement condName;

	@FindBy(xpath = "//a[text()='Next']")
	WebElement next;

	@FindBy(xpath = "//a[text()='Previous']")
	WebElement previous;

	@FindBy(xpath = "//th[@aria-sort='ascending']")
	WebElement arrow;

	public ConditionPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}
	public String VerifyConditionPageTitle()
	{
		return driver.getTitle();
	}
	public ConditionPage VerifyConditionPage() throws Throwable
	{
		UtilsTest.Dropdown(show, "25");
		Thread.sleep(2000);
		search.sendKeys("Batter");
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
		condName.sendKeys("Bad");
		Thread.sleep(2000);
		save.click();
		return new ConditionPage();
	}

}
