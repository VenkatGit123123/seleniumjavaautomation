package com.seleniumjavaautomation.tests;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class ClosingAllTabsUsingRobotClass extends BasePage{
	
	
	@Test
	public void testClosingAllTabsUsingRobotClass()
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/04/calc.html");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		  driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
		  switchToTab();
		  driver.findElement(By.xpath("//input[@id='6']")).click();
		  driver.findElement(By.xpath("//input[@id='plus']"));
		  driver.findElement(By.xpath("//input[@id='3']"));
		  driver.findElement(By.xpath("//input[@id='equals']"));
		  
		  switchToTab();
		  driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("hi");
		  driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("test");
		  
		  switchToTab();
		  String str = driver.findElement(By.xpath("//input[@id='Resultbox']")).getAttribute("value");
		  System.out.println("Sum result Is -> "+str);
	}
	
	
	
	public void switchToTab() {  
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");  
		  driver.switchTo().defaultContent();  
		 }
	
	

}


