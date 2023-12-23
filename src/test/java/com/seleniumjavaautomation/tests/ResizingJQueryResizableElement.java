package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class ResizingJQueryResizableElement extends BasePage{
	
	@Test
	public void testResizingJQueryResizableElement() throws InterruptedException
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
		
		//Locate resizable element's bottom-right corner.
		  WebElement resizeElement = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));  
		        
		  //To resize jQuery resizable element by 250 pixel X,Y offset using dragAndDropBy method of Actions class.
		  new Actions(driver).dragAndDropBy(resizeElement, 250, 250).build().perform();
		  Thread.sleep(5000);
		  
		  //After 5 seconds, This will resize jQuery resizable element by -100 pixel X,Y offset using the combination of clickAndHold, moveByOffset and release methods of Actions class.
		  new Actions(driver).clickAndHold(resizeElement).moveByOffset(-100,-100).release().perform();
		 }
	}


