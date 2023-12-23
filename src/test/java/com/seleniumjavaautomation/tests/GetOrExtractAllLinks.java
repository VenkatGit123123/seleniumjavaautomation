package com.seleniumjavaautomation.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class GetOrExtractAllLinks extends BasePage{
	
	@Test
	public void testGetOrExtractAllLinks()
	{
	
	driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
	try {
	    List<WebElement> no = driver.findElements(By.tagName("a"));
	    int nooflinks = no.size(); 
	    System.out.println(nooflinks);
	    for (WebElement pagelink : no)
	         {
	          String linktext = pagelink.getText();
	          String link = pagelink.getAttribute("href"); 
	          System.out.println(linktext+" ->");
	          System.out.println(link);
	          }
	   }catch (Exception e){
	             System.out.println("error "+e);
	         }
	           
	  }
	

}

