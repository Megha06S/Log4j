package com.Demo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	
	// What is log? capturing info/activities at the time of program execution
	
	//types of logs
	//1.Info
	//2.Warn
	//3.Error
	//4.Fatal
	
	//how to generate logs? use Apache Log4J Api (log4j jar)
	//where to create? create inside resource folder
	
	
	WebDriver driver;
	Logger log= Logger.getLogger(LoginTest.class);
	
	@BeforeMethod
	public void setup()
	{
		
		log.info("#################################Starting TC execution#####################################");
		driver= new FirefoxDriver();
		log.info("*****************Launching Firefox********************* ");
		
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		log.info("**********************Launch URL****************************");
		driver.get("https://freecrm.co.in/");
		log.info("Entering freeCRM");
		log.warn("Maybe internet speed is slow");
		log.fatal("This is fatal error");
		log.debug("Debug message");
		log.error("this is error message");
		
	}
	
	
	@Test(priority=1)
	public void freeCrmTitleTest()
	{
		log.info("**************Started TC 1***********************");
		log.info("***************This is my freeCRM login page title test **********************");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		log.info("login page title is "+title);
		log.info("******************Ending TC 1****************************");

		
	}
	
	@Test(priority=2)
	public void getTagName()
	{
		log.info("**************Started TC 2***********************");
		String tagName=driver.findElement(By.xpath("//span[@class='brand-slogan']")).getTagName();
		System.out.println(tagName);
		Assert.assertTrue(true);
		log.info("******************Ending TC 2****************************");
		
	}
	
	@AfterMethod
	public void teardown()
	{
	
				System.out.println("work");
				
				driver.quit();
				log.info("********************Browser is closed*******************************");
				
				log.info("#################################Ending TC execution#####################################");
	}

}
