package com.seleniumjavaautomation.tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class CaptueElementScreenshotNew extends BasePage{
	
	@Test
	public void testCaptueElementScreenshotNew() throws IOException
	{
		logger.info("testCaptueElementScreenshotNew method started to execution");
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		//Locate Image element to capture screenshot.
        WebElement Image = driver.findElement(By.xpath("//img[@border='0']"));
        
        File source = ((TakesScreenshot)Image).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source, new File(System.getProperty("user.dir") + "/screenshots/elementScreenshotNew.png"));
        
        logger.info("Captured screenshot and stored at location by New Feature");
        logger.info("testCaptueElementScreenshotNew method execution completed");
	}

}
