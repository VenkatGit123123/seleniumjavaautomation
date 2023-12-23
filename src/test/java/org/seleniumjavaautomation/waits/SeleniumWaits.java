package org.seleniumjavaautomation.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()		 
    {
		
		//To Launch Chrome Browser
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
	@Test
	public void testWebDriverWaitForTitle()
	{
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
		  driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		  
		//Wait for page title
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		  wait.until(ExpectedConditions.titleContains(": MyTest"));
		  
		//Get and store page title in to variable
		  String title = driver.getTitle();
		  System.out.print(title);
		  
	}

}
