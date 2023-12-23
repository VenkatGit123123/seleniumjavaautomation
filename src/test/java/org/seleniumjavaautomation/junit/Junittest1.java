package org.seleniumjavaautomation.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junittest1 {
	
	
	WebDriver driver;
	
	@Before
	public void setUp()
	{
		
		        //To Launch Chrome Browser
				WebDriverManager.chromiumdriver().setup();
				driver = new ChromeDriver();
				System.out.println("Chrome browser launched successfully");
				
				driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		System.out.println("Chrome browser closed");
		
	}
	
	@Test
	public void testMethodClass1() throws Exception
	{
		
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		  driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("testMethodClass1 executed");
		  Thread.sleep(2000);
		  System.out.print("junittest1 class is executed");
		
		
	}

}
