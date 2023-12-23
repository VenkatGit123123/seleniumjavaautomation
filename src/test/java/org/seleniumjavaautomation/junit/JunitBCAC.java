package org.seleniumjavaautomation.junit;

import java.time.Duration;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitBCAC {
	
private static WebDriver driver;
	
	
    @BeforeClass
	public static void setUp()
	{
		
		        //To Launch Chrome Browser
				WebDriverManager.chromiumdriver().setup();
				driver = new ChromeDriver();
				System.out.println("Chrome browser launched successfully");
				
				driver.manage().window().maximize();
				driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
    @AfterClass
	public static void tearDown()
	{
		driver.quit();
		System.out.println("Chrome browser closed");
	}
	
	
	
	
	@Test
	public  void testMethod1() throws Exception
	{
		
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("junittest2 class-testMethod1");
		 System.out.println("\njunittest2 class-testMethod1 is executed");
		 Thread.sleep(2000);
		
		
	}
	
	@Test
	 public void testMethod2() throws InterruptedException {
	 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("junittest2 class-testMethod2");
	 Thread.sleep(2000);
	 System.out.println("\njunittest2 class-testMethod2 is executed");
	 }
	
	
	@Test
	public void testMethod3()
	{
		driver.findElement(By.xpath("//input[@value='Bike']")).click();
		boolean str1 = driver.findElement(By.xpath("//input[@value='Bike']")).isSelected();
		
		if(str1 = true) {
			 System.out.println("Checkbox is checked");
			
		}
		else {
			System.out.println("Checkbox is not checked");
			
		}
	}
	

	

}
