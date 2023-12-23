package com.seleniumjavaautomation.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionsSelections extends BasePage{
	
	
	@Test
	public void testOptionsByValueIndexSelection() throws Exception
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		driver.findElement(By.id("text1")).sendKeys("My First Name");
		
		//Selecting value from drop down by value
		  Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
		  
		 Boolean result =  listbox.isMultiple();
		 System.out.println("this drop down is Multi select nature: "+result);
		 
		  listbox.selectByValue("Italy");
		  listbox.selectByValue("Mexico");
		  listbox.selectByValue("Spain");
		  driver.findElement(By.xpath("//input[@value='->']")).click();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));		  
		  wait.until(ExpectedConditions.elementToBeClickable(By.id("text2")));
		  
		  
		//Selecting value from drop down by index
		  listbox.selectByIndex(0);
		  listbox.selectByIndex(3);
		  driver.findElement(By.xpath("//input[@value='->']")).click();
		  Thread.sleep(2000);
		  listbox.deselectAll();
	}
	
	@Test
	public void testOptionByVisibleTextSelection()
	{
		//driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.findElement(By.id("text1")).sendKeys("My First Name");
		//Selecting value from drop down using visible text
		  Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
		  mydrpdwn.selectByVisibleText("Audi");
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		  wait.until(ExpectedConditions.elementToBeClickable(By.id("text2")));
	}
	
	@Test
	public void testgetOptions()
	{
		driver.findElement(By.id("text1")).sendKeys("My First Name");
		 Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
		 List <WebElement> options =  mydrpdwn.getOptions();
		 System.out.println("Total options count: "+options);
		
	}
	
	@Test
		public void testVerifyElementPresent()
		{
			for(int i=1;i<6;i++)
			{
			//To verify element is present on page or not.
			String Xpath = "//input[@id='text\"+i+\"']";
			Boolean iselementpresent = driver.findElements(By.xpath(Xpath)).size()!= 0;
			if(iselementpresent=true) {
				System.out.print("\nTargeted TextBox"+i+" Is Present On The Page");
			}
			else {
				 System.out.print("\nTargeted Text Box"+i+" Is Not Present On The Page");
			}
		}

	}
}
