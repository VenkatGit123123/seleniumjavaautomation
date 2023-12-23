package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class MoveJQuerySlider extends BasePage{
	
	@Test
	public void testMoveJQuerySlider() throws InterruptedException
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		
		//Locate slider pointer.
		  WebElement dragElementFrom = driver.findElement(By.xpath("//span[contains(@class, 'ui-slider-handle')]"));
		 
		  Thread.sleep(5000);
		//To Move jQuery slider by 100 pixel offset using dragAndDropBy method of Actions class.
		  new Actions(driver).dragAndDropBy(dragElementFrom, 100, 0).build().perform();
		  Thread.sleep(5000);
		  
		  //After 5 seconds, This will Move jQuery slider by 100 pixel offset using the combination of clickAndHold, moveByOffset and release methods of Actions class.
		  new Actions(driver).clickAndHold(dragElementFrom).moveByOffset(100,0).release().perform();
	}

}
