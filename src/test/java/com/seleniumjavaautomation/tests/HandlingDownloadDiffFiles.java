package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class HandlingDownloadDiffFiles extends BasePage{
	
	@Test
	public void testHandlingDownloadDiffFiles() throws Exception
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/05/login.html");
        //Download Text File
 driver.findElement(By.xpath("//a[contains(.,'Download Text File')]")).click();
 Thread.sleep(5000);//To wait till file gets downloaded.
               //Download PDF File
 driver.findElement(By.xpath("//a[contains(.,'Download PDF File')]")).click();
 Thread.sleep(5000);
               //Download CSV File
 driver.findElement(By.xpath("//a[contains(.,'Download CSV File')]")).click();
 Thread.sleep(5000);
               //Download Excel File
 driver.findElement(By.xpath("//a[contains(.,'Download Excel File')]")).click();
 Thread.sleep(5000);
               //Download Doc File
 driver.findElement(By.xpath("//a[contains(.,'Download Doc File')]")).click();
 Thread.sleep(5000);  
	}

}
