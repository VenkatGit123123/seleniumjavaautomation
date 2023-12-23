package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import com.seleniumjavaautomation.base.BasePage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class DownloadAndSaveImageByActionRobotClass extends BasePage{
	
	@Test
	public void testDownloadAndSaveImageByActionRobotClass() throws InterruptedException, AWTException
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		//Locate Image
		  WebElement Image =driver.findElement(By.xpath("//img[@border='0']"));
		  
		//Rihgt click on Image using contextClick() method.
		  Actions action= new Actions(driver);
		  action.contextClick(Image).build().perform();
		  
		//To perform press Ctrl + v keyboard button action.
		  action.sendKeys(Keys.CONTROL, "v").build().perform();
		  
		  Thread.sleep(3000);
		  Robot robot = new Robot();
		  // To press D key.
		  robot.keyPress(KeyEvent.VK_D);
		  // To press : key.
		  robot.keyPress(KeyEvent.VK_SHIFT);
		  robot.keyPress(KeyEvent.VK_SEMICOLON);
		  robot.keyRelease(KeyEvent.VK_SHIFT);
		  // To press \ key.
		  robot.keyPress(KeyEvent.VK_BACK_SLASH);
		  // To press "test" key one by one.
		  robot.keyPress(KeyEvent.VK_T);
		  robot.keyPress(KeyEvent.VK_E);
		  robot.keyPress(KeyEvent.VK_S);
		  robot.keyPress(KeyEvent.VK_T);
		  // To press Save button.
		  robot.keyPress(KeyEvent.VK_ENTER);  
		 }
	}


