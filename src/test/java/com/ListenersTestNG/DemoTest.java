package com.ListenersTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void TC1()
	{
		System.out.println("Login by Email");
		Assert.assertEquals("megha", "megha");
	}
	
	@Test
	public void TC2()
	{
		System.out.println("Login by ID");
		Assert.assertEquals("megha", "singh");
	}

}
