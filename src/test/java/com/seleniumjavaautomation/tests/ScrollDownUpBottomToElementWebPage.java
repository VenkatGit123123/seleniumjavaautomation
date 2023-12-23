package com.seleniumjavaautomation.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.seleniumjavaautomation.base.BasePage;

public class ScrollDownUpBottomToElementWebPage extends BasePage{
	
	@Test
	public void testScrollDownUpBottomToElementWebPage() throws InterruptedException
	{
		logger.info("testScrollDownUpBottomToElementWebPage method started to execution");
		driver.get("http://only-testing-blog.blogspot.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		 System.out.println("Webpage scrolled down by 1000 pixels");
		Thread.sleep(10000);
		
		 //To scroll up web page by 300 pixels In x(vertical) direction.
		js.executeScript("window.scrollBy(0, -300)", "");
		System.out.println("Webpage scrolled up by -300 pixels");
		Thread.sleep(10000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		System.out.println("Webpage scrolled down to bottom of page");
		Thread.sleep(10000);
		
		//Scroll till element.
		
		WebElement element = driver.findElement(By.xpath("//div[@id='dragdiv']"));
		String ele = element.getText();
		System.out.println("Element is : "+ele);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println("Scrolled to element");
		logger.info("testScrollDownUpBottomToElementWebPage method execution completed");
		
		
	}
	
	
	
	
	

}
