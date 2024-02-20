package com.ehm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.ehm.qa.utils.EventListner_Test;

public class BaseTest {
	
	public static Properties prop;
	public static WebDriver driver;
	public static EventListner_Test eventlistnertest;
	public static EventFiringWebDriver ef_webdriver;
	
	public BaseTest() throws Throwable
	{
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("D:\\Eclipse Projects\\Sample Project\\EH_Masters_Hybrid\\src\\main\\java\\com\\ehm\\qa\\config\\config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	public static void initialization() throws Throwable
	{
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equals("edge"))
		{
			driver = new EdgeDriver();			
		}
		else {
			System.out.println("Not a correct input");
		}
		eventlistnertest = new EventListner_Test();
		ef_webdriver = new EventFiringWebDriver(driver);
		ef_webdriver.register(eventlistnertest);
		driver = ef_webdriver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}
	
}
