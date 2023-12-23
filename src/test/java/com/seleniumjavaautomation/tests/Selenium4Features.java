package com.seleniumjavaautomation.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4Features extends BasePage{
	

	
	@Test
	public void CaptureSSofSpecificWebElement() throws IOException
	{
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		WebElement e = driver.findElement(By.name("fname"));
		File f = e.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\krish\\eclipse-workspace\\seleniumjavaautomation\\e.png");
		FileUtils.copyFile(f,destFile);
	}
	
	@Test
	public void OpenTheNewTabOnTheBrowser()
	{
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.crmpro.com/");
	}
	
	@Test
	public void OpenANewWindowOnTheBrowser()
	{
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.crmpro.com/");
	}
	
	
	   @Test
		public void ObjectLocation()
		{
			driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
			WebElement e = driver.findElement(By.name("fname"));
			System.out.println("Height:" +e.getRect().getDimension().getHeight());
			System.out.println("Width:" +e.getRect().getDimension().getWidth());
			System.out.println("X Location:" +e.getRect().getX());
			System.out.println("Y Location:" +e.getRect().getY());
					
		}
		

	   @Test
	   public void RelativeLocatorAbove()
	   {
		   driver.get("https://www.browserstack.com/");


		   WebElement appLive = driver.findElement(By.cssSelector("a.product-card-app-live"));

		   WebElement getADemo = driver.findElement(RelativeLocator.with(By.tagName("button")).above(appLive));

		   getADemo.click();

		   }
	   
	   
	   @Test
	   public void RelativeLocatorBelow()
	   {
	   	driver.get("https://www.browserstack.com/");
	   	 

	   	WebElement textSection = driver.findElement(By.cssSelector("div.text-section p"));

	   	WebElement getAdemo = driver.findElement(RelativeLocator.with(By.tagName("button")).below(textSection));

	   	getAdemo.click();



	   }
	   
	   
	   @Test
	   public void RelativeLocatortoRightOf()
	   {
	   
		   driver.get("https://www.browserstack.com/");

		   WebElement getStartedFree = driver.findElement(By.cssSelector("a#signupModalButton"));

		   WebElement getADemo = driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(getStartedFree));

		   getADemo.click();
		   
	   }
	   
		   @Test
		   public void RelativeLocatortoLeftOf()
		   {
		   
		   driver.get("https://www.browserstack.com/");

		    driver.manage().window().maximize();

		   WebElement getADemoo = driver .findElement(By.xpath("//button[contains(@class, 'btn-secondary') and text()='Get a demo']"));

		    WebElement getStartedFreee = driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(getADemoo));

		   getStartedFreee.click();
		   
		   }
		   
		   
		   @Test
		   public void RelativeLocatorNear()
		   { 
		   driver.get("https://www.browserstack.com/");

		   WebElement freeTrial = driver .findElement(By.xpath("//ul[@id='primary-menu']//a[@id='free-trial-link-anchor']"));

		   WebElement search = driver.findElement(RelativeLocator.with(By.tagName("button")).near(freeTrial));

		   search.click();



	   }
	   
     



}

