package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import com.seleniumjavaautomation.base.BasePage;

public class DragAndDrop extends BasePage{
	
	@Test
	public void testDragAndDrop()
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
		 //Locate element which you wants to drag.
		  WebElement dragElementFrom = driver.findElement(By.xpath("//div[@id='dragdiv']"));
		  //Locate element where you wants to drop.
		  WebElement dropElementTo = driver.findElement(By.xpath("//div[@id='dropdiv']"));
	
		  //Use Actions class and Its members of WebDriver API to perform drag and drop operation.

		  Actions a = new Actions(driver);
	 a.clickAndHold(dragElementFrom).moveToElement(dropElementTo).release(dropElementTo).build().perform();
	
	}
	
	
	@Test
	public void testDragAndDrop2()
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
		 //Locate element which you wants to drag.
		  WebElement dragElementFrom = driver.findElement(By.xpath("//div[@id='dragdiv']"));
		  //Locate element where you wants to drop.
		  WebElement dropElementTo = driver.findElement(By.xpath("//div[@id='dropdiv']"));
	
		  //Use Actions class and Its members of WebDriver API to perform drag and drop operation.

		  Actions a = new Actions(driver);
				  a.dragAndDrop(dragElementFrom, dropElementTo).build().perform();
	
	
	}

}
