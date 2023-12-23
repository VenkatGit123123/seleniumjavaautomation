package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class XpathPositionLastFunctions extends BasePage{
	
	@Test
	public void testXpathPositionLastFunctions()
	{
		logger.info("testXpathPositionLastFunctions method started to execution");
		driver.get("http://only-testing-blog.blogspot.com/2014/09/temp.html");
		 //To select Cow checkbox using position() function.
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[position()=3]")).click();
		  
		  //To select Lion checkbox using last() function.
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[last()-1]")).click();
		  
		  //To select Tiger checkbox using last() function.
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[last()]")).click();
		  logger.info("testXpathPositionLastFunctions method execution completed");
	     
	}

}
