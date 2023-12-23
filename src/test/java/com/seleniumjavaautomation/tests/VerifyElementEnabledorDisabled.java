package com.seleniumjavaautomation.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElementEnabledorDisabled extends BasePage{
	
	
	
	@Test
	public void testElementEnabledorDisabled()
	{
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		boolean fname = driver.findElement(By.xpath("//input[@name='fname']")).isEnabled();
		  System.out.print(fname);
		  
		  WebElement firstname = driver.findElement(By.xpath("//input[@name='fname']"));
		  WebElement lastname = driver.findElement(By.xpath("//input[@name='lname']"));
		  
		//Verify First name text box is enabled or not and then print related message.
		  if(firstname.isEnabled()) 
		  {
			  System.out.println("\nText box First name is enabled. Take your action.");
		  }
		  else 
		  {
			  System.out.println("\nText box First name is disabled. Take your action.");
		  }
		  
		//Verify Last name text box is enabled or not and then print related message.
		  if(lastname.isEnabled())
		  {
			  System.out.println("\nText box Last name is enabled. Take your action.");
		  }
		  else
		  {
			  System.out.println("\nText box Last name is disabled. Take your action.");
		  }
	}

}
