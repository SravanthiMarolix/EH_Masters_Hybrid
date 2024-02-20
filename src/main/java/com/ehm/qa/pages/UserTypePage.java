package com.ehm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.utils.UtilsTest;

public class UserTypePage extends BaseTest{
	
	@FindBy(name="mydatatable_length")
	WebElement show;
	
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;
	
	@FindBy(xpath = "//a[@href='/Master/UserTypeData']")
	WebElement addnew;
	
	@FindBy(xpath = "//a[@href='/Master/UserTypeData?id=798']")
	WebElement editbtn;
	
	@FindBy(xpath = "//a[@onclick='ShowDelete(798)']")
	WebElement delbtn; 
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement yesbtn;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--no']")
	WebElement nobtn;
	
	@FindBy(xpath = "//a[@class='btn btn-add']")
	WebElement back;
	
	@FindBy(xpath = "//a[@data-dt-idx='3']")
	WebElement next;
	
	@FindBy(id="TypeName")
	WebElement typename;
	
	@FindBy(id="TypeCode")
	WebElement typecode;
	
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement save;
	
	@FindBy(xpath = "//a[text()='Previous']")
	WebElement previous;
	
	@FindBy(xpath = "//th[@aria-sort='ascending']")
	WebElement arrow;

	public UserTypePage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyAddUserTypePageTitle()
	{
		return driver.getTitle();
	}
	
	public UserTypePage VerifyAddUserTypePage(String TypeName, String TypeCode) throws Throwable
	{
		UtilsTest.Dropdown(show, "25");
		Thread.sleep(2000);
		search.sendKeys("name");
		Thread.sleep(2000);
		editbtn.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		delbtn.click();
		Thread.sleep(2000);
		nobtn.click();
//		Thread.sleep(2000);
//		delbtn.click();
//		Thread.sleep(2000);
//		yesbtn.click();
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);
		previous.click();
		Thread.sleep(2000);
		arrow.click();
		Thread.sleep(2000);
		addnew.click();
		Thread.sleep(2000);
		typename.sendKeys(TypeName);
		Thread.sleep(2000);
		typecode.sendKeys(TypeCode);
		Thread.sleep(2000);
		save.click();
		return new UserTypePage();
	}

	}


