package com.seleniumjavaautomation.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadFontProperties extends BasePage{
	
	
	
	@Test
	public void testReadFontProperties()
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/05/login.html");
		//Locate text string element to read It's font properties.
		  WebElement text = driver.findElement(By.xpath("//h1[contains(.,'Example Login Page')]"));
		  
		//Read font-size property and print It In console.
		  String fontSize = text.getCssValue("font-size");
		  System.out.println("Font Size -> "+fontSize);
		  
		//Read color property and print It In console.
		  String fontColor = text.getCssValue("color");
		  System.out.println("Font Color -> "+fontColor);
		  
		//Read font-family property and print It In console.
		  String fontFamily = text.getCssValue("font-family");
		  System.out.println("Font Family -> "+fontFamily);
		  
		//Read text-align property and print It In console.
		  String fonttxtAlign = text.getCssValue("text-align");
		  System.out.println("Font Text Alignment -> "+fonttxtAlign);
	}

}
