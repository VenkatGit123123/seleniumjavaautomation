package com.seleniumjavaautomation.tests;

import java.io.File;
import org.openqa.selenium.JavascriptExecutor;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenshot extends BasePage{
	

	@Test
	public void testCaptureScreenshotFullpage() throws IOException
	{
		logger.info("testCaptureScreenshotFullpage method");
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		logger.info("Application opend");
		//Capture entire page screenshot and then store it to destination drive
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") +    "/screenshots/fullpage.png"));
		  System.out.print("Screenshot is captured and stored in screenshots folder");
		  logger.info("Screenshot is captured and stored in screenshots folder");
	}
	
	@Test
	public void testtakeElementScreenshot()
	{
		logger.info("testtakeElementScreenshot method");
		driver.get("https://www.qed42.com/");
		WebElement elementLogo = driver.findElement(By.className("site-logo"));
		File source = elementLogo.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") +    "/screenshots/elementLogo.png");
		
		try {
			FileHandler.copy(source, dest);
			
		}catch (IOException exception){
			
			exception.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testtakeSectionScreenshot()
	{
		logger.info("testtakeSectionScreenshot method");
		driver.get("https://www.qed42.com/");
		WebElement btnCookie = driver.findElement(By.cssSelector(".agree-button"));
		btnCookie.click(); 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".qed42-services")));	
		
		WebElement elementLogo = driver.findElement(By.cssSelector(".qed42-services"));
		
		File source = elementLogo.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/screenshots/qed42-services.png");

		try {
			FileHandler.copy(source, dest);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		logger.info("all methods are executed");

	}
	
	
}
