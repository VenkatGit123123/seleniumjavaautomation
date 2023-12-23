package com.seleniumjavaautomation.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands extends BasePage{
	
	
	@Test
	public void testNavigationCommands() throws InterruptedException
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.navigate().to("https://in.bookmyshow.com/");
		
		Thread.sleep(15);
		//To navigate back (Same as clicking on browser back button)
		driver.navigate().back();
		
		Thread.sleep(15);
		//To navigate forward (Same as clicking on browser forward button)
		driver.navigate().forward();
		Thread.sleep(15);
		
		driver.navigate().refresh();
		
	}

}
