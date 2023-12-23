package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class HeightAndWidthOfElement extends BasePage{
	
	@Test
	public void testHeightAndWidthOfElement()
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		//Locate element for which you wants to get height and width.
        WebElement Image = driver.findElement(By.xpath("//img[@border='0']"));
        
      //Get width of element.
        int ImageWidth = Image.getSize().getWidth();
        System.out.println("Image width Is "+ImageWidth+" pixels");
        
        //Get Height of element
        int ImageHeight = Image.getSize().getHeight();
        System.out.println("Image height Is "+ImageHeight+" pixels");
        
	}

}
