package com.seleniumjavaautomation.tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingJSAlerts extends BasePage{
	
	
	@Test
	public void testJSAlerts() throws InterruptedException
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		//Alert Pop up Handling.
		  driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		  //To locate alert.
		  Alert al = driver.switchTo().alert();
		  //To read the text from alert popup.
		  String altext = al.getText();
		  System.out.println(altext);
		  Thread.sleep(2000);
		//To accept/Click Ok on alert popup.
		  al.accept();
		  
		//Confirmation Pop up Handling.
		  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		  Alert al2 = driver.switchTo().alert();
		  String al2text = al2.getText();
		  System.out.println(al2text);
		  Thread.sleep(2000);
		  //To click On cancel button of confirmation box.
		  al2.dismiss();
		  
		//Prompt Pop up Handling.
		  driver.findElement(By.xpath("//button[contains(.,'Show Me Prompt')]")).click();
		  Alert al3 = driver.switchTo().alert();
		  String Al3text = al3.getText();
		  System.out.println(Al3text);
		  //To type text In text box of prompt pop up.
		  al3.sendKeys("This Is John");
		  Thread.sleep(2000);
		  al3.accept();  
		  
		  
	}

}
