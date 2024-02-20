package com.ehm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ehm.qa.base.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(name = "emailid")
	WebElement Uname;
	
	@FindBy(id="pword")
	WebElement Pwd;
	
	@FindBy(xpath="//img[@src='/WebApp/assets/dist/img/logo.png']")
	WebElement Img;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginbtn;

	public LoginPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean VerifyEhomeImage()
	{
		return Img.isDisplayed();
	}
	public HomePage VerifyEhomeLoginPage() throws Throwable
	{
		Uname.sendKeys(prop.getProperty("username"));
		Pwd.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		return new HomePage();
	}
}
