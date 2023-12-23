package com.seleniumjavaautomation.tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleUnExpectedAlerts extends BasePage{
	
	
	
	@Test
	public void testHandleUnExpectedAlerts()
	{
		 driver.get("http://only-testing-blog.blogspot.com/2014/06/alert_6.html");
		 //To handle unexpected alert on page load.
		try {
			Alert al = driver.switchTo().alert();
			al.dismiss();
		}catch(Exception e)
		{
			System.out.println("unexpected alert not present"); 
		}
		
		 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("fname");
		  driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("lname");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
