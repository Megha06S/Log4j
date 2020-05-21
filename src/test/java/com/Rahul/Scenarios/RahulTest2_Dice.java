package com.Rahul.Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RahulTest2_Dice {
	
	WebDriver driver;
	@BeforeTest
	public void launchURL()
	{
		driver= new FirefoxDriver();
		
//		FirefoxProfile geoDisabled = new FirefoxProfile();
//		geoDisabled.setPreference("geo.enabled", false);
//		geoDisabled.setPreference("geo.provider.use_corelocation", false);
//		geoDisabled.setPreference("geo.prompt.testing", false);
//		geoDisabled.setPreference("geo.prompt.testing.allow", false);
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability(FirefoxDriver.PROFILE, geoDisabled);
//		driver = new FirefoxDriver(capabilities);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://www.dice.com/home/home-feed");
		
		
	}
	
//	
//	@Test
//	public void TC1()
//	{
//		driver.findElement(By.xpath("//a[@id='navbarDropdown-9']")).click();
//		driver.findElement(By.xpath("//*[@href='/dashboard/login']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rahul4automation@gmail.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rahul@123");
//		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
//	}
//	
	
	@Test
	public void TC2()
	{
		
	}
	@AfterTest
	public void tearDown()
	{
		System.out.println("working fine");
		//driver.quit();
	}


}
