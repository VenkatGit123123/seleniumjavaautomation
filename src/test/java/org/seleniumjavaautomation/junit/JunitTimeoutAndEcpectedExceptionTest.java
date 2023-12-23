package org.seleniumjavaautomation.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTimeoutAndEcpectedExceptionTest {
	
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
	
	
	@Test (timeout=2000)
	public void testJunitTimeoutException() throws Exception
	{
		
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		  driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("JunitTimeoutException test executed");
		  Thread.sleep(5000);
		  System.out.println("JunitTimeoutException test executed");
		
		
	}
	
	@Test
	 public void exceptiontest1() {
	     throw new NullPointerException();
	 }
	
	
	@Test(expected=NullPointerException.class)
	public void exceptiontest2()
	{
		throw new NullPointerException();
	}

}
