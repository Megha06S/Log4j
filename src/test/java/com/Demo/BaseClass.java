package com.Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class BaseClass {
	static WebDriver driver;
	static String ChromePath="D:\\Automation\\AutomationD\\NewDD\\src\\test\\resources\\com\\Chrome\\chromedriver.exe";
	
	static Logger log= Logger.getLogger(BaseClass.class);
	@BeforeMethod
	public static void launchURL()
	{
		log.info("#################################Starting TC execution#####################################");
		System.setProperty("webdriver.chrome.driver", ChromePath);
		driver= new ChromeDriver();
		log.info("*****************Launching Chrome********************* ");
		
		driver.get("https://www.google.com/");
		
		log.info("**********************Launch URL****************************");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@Test(priority=1)
	public void TestGoogleSearch()
	{
		log.info("**************Started TC 1***********************");
		log.info("***************This is Google search test **********************");
		WebElement GoogleSearch = driver.findElement(By.xpath("//input[@class='gNO89b']"));
		//WebElement Lucky = driver.findElement(By.xpath("//input[@class='RNmpXc']"));
		
		if(GoogleSearch.isEnabled())
			System.out.println("Google Search is enabled");
		else
			System.out.println("Not enabled");
		log.info("******************Ending TC 1****************************");
		
	}
	
	@Test(priority=2)
	public void TestLuckyTab()
	{
		log.info("**************Started TC 2***********************");
		log.info("***************This is Google Lucky tab test **********************");
		WebElement Lucky = driver.findElement(By.xpath("//input[@class='RNmpXc']"));
		
		if(Lucky.isEnabled())
			System.out.println("Lucky tab is enabled");
		else
			System.out.println("Not enabled");
		
		log.info("******************Ending TC 2****************************");
	}
	
	@AfterMethod
	public void tearDown()
	{
		log.info("*******************Quitting browser*******************************");
		driver.quit();
		log.info("#################################Ending TC execution#####################################");
	}

}

	

