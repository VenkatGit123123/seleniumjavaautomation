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

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverEventTest extends BasePage{
	
	
	
	@Test
	public void testGeneratingMouseHover()
	{
		driver.get("http://only-testing-blog.blogspot.com/p/mouse-hover.html");
		//Generate mouse hover event on main menu to click on sub menu
		Actions a = new Actions(driver);
		WebElement moveonmenu  = driver.findElement(By.id("menu1"));
		a.moveToElement(moveonmenu).moveToElement(driver.findElement(By.xpath("//div[@id='menu1choices']/a")))	.click().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.titleContains("Google"));
		
		
	}

}
