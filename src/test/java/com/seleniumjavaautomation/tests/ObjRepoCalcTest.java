package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Properties;

import com.seleniumjavaautomation.base.BasePage;

public class ObjRepoCalcTest extends BasePage{
	
	@Test
	public void testObjRepoCalcTest() throws Exception
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/04/calc.html"); 
		
		//create object of properties
		Properties obj = new Properties();
		
		 //Create Object of FileInputStream Class. Pass file path.
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\resources\\objects.properties");
		
		 //Pass object reference objfile to load method of Properties object.
		obj.load(objfile);
		
		
		 //Sum operation on calculator.
		 //Accessing element locators of all web elements using obj.getProperty(key)
		driver.findElement(By.id(obj.getProperty("eight"))).click();
		driver.findElement(By.id(obj.getProperty("plus"))).click();
		  driver.findElement(By.id(obj.getProperty("four"))).click();
		  driver.findElement(By.id(obj.getProperty("equalsto"))).click();
		  String i = driver.findElement(By.id(obj.getProperty("result"))).getAttribute("value");
		  System.out.println(obj.getProperty("eight")+" + "+obj.getProperty("four")+" = "+i);
		  driver.findElement(By.id(obj.getProperty("result"))).clear();
		  
		//Subtraction operation on calculator.
		  //Accessing element locators of all web elements using obj.getProperty(key)
		  driver.findElement(By.id(obj.getProperty("nine"))).click();
		  driver.findElement(By.id(obj.getProperty("minus"))).click();
		  driver.findElement(By.id(obj.getProperty("three"))).click();
		  driver.findElement(By.id(obj.getProperty("equalsto"))).click();
		  String j = driver.findElement(By.id(obj.getProperty("result"))).getAttribute("value");
		  System.out.println(obj.getProperty("nine")+" - "+obj.getProperty("three")+" = "+j);
		
		
	}

}
