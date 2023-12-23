package com.seleniumjavaautomation.tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorTests extends BasePage{
	

	
	// JavascriptExecutor to get the page title
	@Test(priority=0)
	public void testJSEPageTitle()
	{
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 //Get current page title
		String pageTitle = (String)js.executeScript("return document.title");
		System.out.println("My Page Title Is  : "+pageTitle);
		
		//Get current page URL
		String url = driver.getCurrentUrl();
		System.out.println("My Current URL Is  : "+url);
	}
	
	// JavascriptExecutor to get the domain name
	@Test(priority=1)
	public void testJSEDomainName()
	{
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		//Get current page URL
				String url = driver.getCurrentUrl();
				System.out.println("My Current URL Is  : "+url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 //Get current page title
		String domain = (String)js.executeScript("return document.domain");
		System.out.println("My Domain Is  : "+domain);
		
		
	}
	
	//JavascriptExecutor to generate alert in selenium webdriver
	@Test(priority=2)
	public void testJSEAlertGenerate() throws Exception
	{
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Test Case Execution Is started Now..')");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	}
	
	

}
