package com.seleniumjavaautomation.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementEnabledorDisabled extends BasePage{
	
	
	@Test
	public void testElementEnabledorDisabled() throws InterruptedException
	{
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		boolean fbefore = driver.findElement(By.xpath("//input[@name='fname']")).isEnabled();
		  System.out.print("\nBefore : First Name Text box enabled status is : "+fbefore);
		  boolean lbefore = driver.findElement(By.xpath("//input[@name='lname']")).isEnabled();
		  System.out.print("\nBefore : Last Name Text box enabled status is : "+lbefore);
		  
		  Thread.sleep(2000);
		  
		//To disable First Name text box
		  
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  String toDisabled = "document.getElementsByName('fname')[0].setAttribute('disabled', '');";
		  js.executeScript(toDisabled);
		  Thread.sleep(2000);
		  
		//To enable Last Name text box
		  String toEnabled = "document.getElementsByName('lname')[0].removeAttribute('disabled');";
		  js.executeScript(toEnabled);
		  Thread.sleep(3000);
		  
		  boolean fafter = driver.findElement(By.xpath("//input[@name='fname']")).isEnabled();
		  System.out.print("\nAfter : First Name Text box enabled status is : "+fafter);
		  boolean lafter = driver.findElement(By.xpath("//input[@name='lname']")).isEnabled();
		  System.out.print("\nAfter : Last Name Text box enabled status is : "+lafter);
		    
		  
	}

}
