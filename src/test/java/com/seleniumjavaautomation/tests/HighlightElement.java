package com.seleniumjavaautomation.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.seleniumjavaautomation.base.BasePage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightElement extends BasePage{
		
	@Test
	public void testHighlightElement()
	{
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		logger.info("Application opend");
		HighlightMyElement(driver.findElement(By.xpath("//input[@name='fname']")));
		logger.info("Highlited First Name element");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
		HighlightMyElement(driver.findElement(By.xpath("//button[@onclick='myFunction()']")));
		logger.info("Highlited click button ");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submitButton")));
		HighlightMyElement(driver.findElement(By.cssSelector("#submitButton")));
		logger.info("Highlited submit button ");
		driver.findElement(By.cssSelector("#submitButton")).click();
	}
	
	public void HighlightMyElement(WebElement element) { 
		  for (int i = 0; i < 10; i++) 
		  { 
		   JavascriptExecutor javascript = (JavascriptExecutor) driver;
		   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: orange; border: 4px solid orange;");
		   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: pink; border: 4px solid pink;");
		   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 4px solid yellow;");
		   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, ""); 
		   } 
		   

	
	
}
	
}
