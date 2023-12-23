package com.seleniumjavaautomation.tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class SetGetWindowPositionAndSize extends BasePage{
	
	@Test(priority=0)
	public void getSizeAndPositionWindowDefault() throws InterruptedException
	{
		logger.info("getSizeAndPositionWindowDefault method started to execution");
		
		
		//WebDriver getSize method used to get window width and height.
		  System.out.println("Window height Is -> "+driver.manage().window().getSize().getHeight());
		  System.out.println("Window width Is -> "+driver.manage().window().getSize().getWidth());
		 
		//WebDriver getPosition method used to get window position x,y coordinates.
		  System.out.println("Window position X coordinates Is -> "+driver.manage().window().getPosition().getX());
		  System.out.println("Window position Y coordinates Is -> "+driver.manage().window().getPosition().getY());
		  logger.info("getSizeAndPositionWindowDefault method execution completed");
	
		  Thread.sleep(6000);
	}	
	
	
		  
    @Test(priority=1)
    public void setGetWinSize() throws InterruptedException {
    	logger.info("setGetWinSize method started to execution");
		//WebDriver setSize method used to set window size width = 300 and height = 500.
		  driver.manage().window().setSize(new Dimension(300,500));
		  
		//WebDriver getSize method used to get window width and height.
		  System.out.println("Window height Is -> "+driver.manage().window().getSize().getHeight());
		  System.out.println("Window width Is -> "+driver.manage().window().getSize().getWidth());
		  Thread.sleep(6000);
		  logger.info("setGetWinSize method execution completed");
		  
		 }
    
    
    @Test(priority=2)
    public void setGetWinPosition() throws InterruptedException
    {
    	logger.info("setGetWinPosition method started to execution");
    	//WebDriver setPosition method used to set window position x coordinate = 50 and y coordinate = 100.
    	  driver.manage().window().setPosition(new Point(50,200));
    	  
    	  //WebDriver getPosition method used to get window position x,y coordinates.
    	  System.out.println("Window position X coordinates Is -> "+driver.manage().window().getPosition().getX());
    	  System.out.println("Window position Y coordinates Is -> "+driver.manage().window().getPosition().getY());
    	  Thread.sleep(6000);
    	  logger.info("setGetWinPosition method execution completed"); 
    	
    }
    
    
	}


