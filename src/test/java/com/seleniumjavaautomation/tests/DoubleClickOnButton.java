package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import com.seleniumjavaautomation.base.BasePage;
import com.seleniumjavaautomation.utility.MyScreenRecorder;

public class DoubleClickOnButton extends BasePage{
	
	@Test
	public void testDoubleClickOnButton() throws Exception
	{
		MyScreenRecorder.startRecording("testDoubleClickOnButton");
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
	try {
		
		if( driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]")).isDisplayed());
		{
			 System.out.println("Element is present and displayed");
		
		WebElement ele =  driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
		//To generate double click action on "Double-Click Me To See Alert" button.
		  Actions action = new Actions(driver);
		  action.doubleClick(ele);
		  action.perform();
		  
		  Thread.sleep(3000);
		  String alert_message = driver.switchTo().alert().getText();
		  driver.switchTo().alert().accept();
		  System.out.println(alert_message);
		}
			  System.out.println("Element is present but not displayed"); 
		  }
		catch(NoSuchElementException e) {
		 System.out.println("Element is not present, hence not displayed as well");
	}

	}
}
	
