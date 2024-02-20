package com.ehm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.utils.UtilsTest;

public class CategoryPage extends BaseTest{
	
	@FindBy(xpath = "//a[@href='/Master/CategoryType']")
	WebElement addnew;
	
	@FindBy(xpath = "//input[@name='CategoryName']")
	WebElement categoryname;
	
	@FindBy(xpath = "//button[@class='btn btn-success serchgaptop']")
	WebElement save;

	@FindBy(xpath = "//select[@name='mydatatable_length']")
	WebElement show;
	
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;
	
	@FindBy(xpath = "//a[@href='/Master/CategoryType?id=820']")
	WebElement edit;

	@FindBy(xpath = "//a[@onclick='ShowDelete(820)']")
	WebElement delbtn;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement yesbtn;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--no']")
	WebElement nobtn;
	
	@FindBy(xpath = "//a[text()='Next']")
	WebElement next;	
	
	@FindBy(xpath = "//a[text()='Previous']")
	WebElement previous;
	
	@FindBy(xpath = "//th[@aria-sort='ascending']")
	WebElement arrow;
	
	public CategoryPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyCategoryPageTitle()
	{
		return driver.getTitle();
	}
	
	public CategoryPage VerifyCategoryPage() throws Throwable
	{
		UtilsTest.Dropdown(show, "25");
		Thread.sleep(2000);
		search.sendKeys("house");
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
//		next.click();
//		Thread.sleep(2000);
//		previous.click();
//		Thread.sleep(2000);
//		arrow.click();
//		Thread.sleep(2000);
		addnew.click();
		Thread.sleep(2000);
		categoryname.sendKeys("Sofa");
		Thread.sleep(2000);
		save.click();
		return new CategoryPage();
	}
}
