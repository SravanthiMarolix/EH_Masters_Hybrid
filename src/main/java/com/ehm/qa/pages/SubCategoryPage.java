package com.ehm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ehm.qa.base.BaseTest;
import com.ehm.qa.utils.UtilsTest;

public class SubCategoryPage extends BaseTest{
	
	@FindBy(name="catId")
	WebElement selectcategory;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement search;
	
	@FindBy(name="mydatatable_length")
	WebElement show; 
	
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search1;

	@FindBy(xpath = "//a[@href='/Master/SubCategoryData']")
	WebElement addnew;

	@FindBy(xpath = "//a[@href='/Master/SubCategoryData?id=504']")
	WebElement edit;
	
	@FindBy(xpath = "//a[@onclick='ShowDelete(504)']")
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
	
	@FindBy(xpath = "//button[@class='btn btn-success serchgaptop']")
	WebElement save;
	
	@FindBy(name="CategoryId")
	WebElement catname;
	
	@FindBy(name="SubCategoryName")
	WebElement subcatname;

	public SubCategoryPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String VerifySubcategoryPageTitle()
	{
		return driver.getTitle();
	}

	public SubCategoryPage VerifySubcategoryPage() throws Throwable
	{
		UtilsTest.Dropdown(selectcategory, "Sofa");
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		UtilsTest.Dropdown(show, "25");
		Thread.sleep(2000);
//		search1.sendKeys("carpet");
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
//		Thread.sleep(2000);
//		next.click();
//		Thread.sleep(2000);
//		previous.click();
//		Thread.sleep(2000);
//		arrow.click();
//		Thread.sleep(2000);
		addnew.click();
		UtilsTest.Dropdown(catname, "Sofa");
		Thread.sleep(2000);
		subcatname.sendKeys("comfy");
		Thread.sleep(2000);
		save.click();
		return new SubCategoryPage();
	}
}
