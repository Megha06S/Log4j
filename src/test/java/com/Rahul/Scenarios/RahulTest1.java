package com.Rahul.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RahulTest1 {

	WebDriver driver;

	@BeforeTest
	public void launchURL()
	{

		driver= new FirefoxDriver();
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.getCurrentUrl());
	}

	
	@Test
	public void TC()
	{
		

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='_1hgiYz']")).getText());
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
//		String login = driver.findElement(By.xpath("//a[contains(text(),'Login')]")).getText();
//		System.out.println(login);
//		Assert.assertEquals(login, "Login");
//		

//		
//		Set<String> handler = driver.getWindowHandles();
//		Iterator<String> it= handler.iterator();
//		String parentWindowId=it.next();
//		System.out.println(parentWindowId);
//		
//		String childWindowId=it.next();
//		System.out.println(childWindowId);
//		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("working fine");
		//driver.quit();
	}

}
