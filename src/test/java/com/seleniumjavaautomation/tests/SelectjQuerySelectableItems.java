package com.seleniumjavaautomation.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import com.seleniumjavaautomation.base.BasePage;

public class SelectjQuerySelectableItems extends BasePage{
	
	@Test
	public void testSelectjQuerySelectableItems()
	{
		 driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		 
		//Prepare list of selectable Items
	        List<WebElement> selectableItems = driver.findElements(By.xpath("//ol[@id='selectable']/*")); 
	 
	      //Build the select Item action.
	        Actions toSelect = new Actions(driver);
	        toSelect.clickAndHold(selectableItems.get(2)).clickAndHold(selectableItems.get(5)).click();
	        
	      //Perform action.
	        Action selectItems = toSelect.build();
	        selectItems.perform();
	}

}
