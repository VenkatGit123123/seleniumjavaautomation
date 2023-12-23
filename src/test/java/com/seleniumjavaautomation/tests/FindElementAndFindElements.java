package com.seleniumjavaautomation.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementAndFindElements extends BasePage{
	
	
	@Test
	public void testFindElementAndFindElements()
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		WebElement option = driver.findElement(By.xpath("//option[@id='country5']"));
		System.out.println(option.getAttribute("id")+" - "+option.getText());
		
		List<WebElement> options = driver.findElements(By.xpath("//option"));
		System.out.println(options.size());
		
		for(int i=0; i<=options.size(); i++)
		{
			String str = options.get(i).getAttribute("id")+" - "+options.get(i).getText();
			System.out.println(str);
		}
	}

}
