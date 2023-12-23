package com.seleniumjavaautomation.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class ExtractAllTextFields extends BasePage{
	
	@Test
	public void testExtractAllTextFields() throws InterruptedException
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/05/login.html");
		//find all input fields where type = text or password and store them In array list txtfields.
		  List <WebElement> txtfields = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		  
		  int noTextfields = txtfields.size(); 
		    System.out.println(noTextfields);
		  
		//for loop to send text In all text box one by one.
		  for(int a=0; a<txtfields.size();a++){   
		   txtfields.get(a).sendKeys("Text"+(a+1));  
		  }
		  Thread.sleep(3000);
		 }
	}


