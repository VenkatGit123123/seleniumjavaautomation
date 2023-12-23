package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class XYCoordinatesOfElement extends BasePage{
	
	@Test
	public void testXYCoordinatesOfElement()
	{
		logger.info("testXYCoordinatesOfElement method started to execution");
		 driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		//Locate element for which you wants to retrieve x y coordinates.
        WebElement Image = driver.findElement(By.xpath("//img[@border='0']"));
        
        //Used points class to get x and y coordinates of element.
        Point p = Image.getLocation();
        int xcord = p.getX();
        System.out.println("Element's Position from left side Is "+xcord+ " pixels.");
        
        int ycord = p.getY();
        System.out.println("Element's Position from top side Is "+ycord+ " pixels.");
	
        logger.info("testXYCoordinatesOfElement method execution completed");
       	}
}


