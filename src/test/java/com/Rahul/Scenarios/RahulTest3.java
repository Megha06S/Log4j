package com.Rahul.Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RahulTest3 {
	
	WebDriver driver;
	
	@Test
	public void TC1()
	{
		driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
	}

}
