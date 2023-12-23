package com.seleniumjavaautomation.tests;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Point;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class CaptueElementScreenshotOld extends BasePage{
	
	@Test
	public void testCaptueElementScreenshotOld() throws IOException
	{
		logger.info("testCaptueElementScreenshotOld method started to execution");
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		//Locate Image element to capture screenshot.
        WebElement Image = driver.findElement(By.xpath("//img[@border='0']"));
        //Call captureElementScreenshot function to capture screenshot of element.
        captureElementScreenshot(Image);
        
	}
	
	public void captureElementScreenshot(WebElement element) throws IOException{
		  //Capture entire page screenshot as buffer.
		  //Used TakesScreenshot, OutputType Interface of selenium and File class of java to capture screenshot of entire page.
		  File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  
		  //Used selenium getSize() method to get height and width of element.
		  //Retrieve width of element.
		  int ImageWidth = element.getSize().getWidth();
		  //Retrieve height of element.
		  int ImageHeight = element.getSize().getHeight();  
		  
		  //Used selenium Point class to get x y coordinates of Image element.
		  //get location(x y coordinates) of the element.
	       Point point = element.getLocation();
		  int xcord = point.getX();
		  int ycord = point.getX();
		  
		//Reading full image screenshot.
		  BufferedImage img = ImageIO.read(screen);
		  
		  //cut Image using height, width and x y coordinates parameters.
		  BufferedImage dest = img.getSubimage(xcord, ycord, ImageWidth, ImageHeight);
		  ImageIO.write(dest, "png", screen);
		  
		  //Used FileUtils class of apache.commons.io.
		  //save Image screenshot In D: drive.
		  FileUtils.copyFile(screen, new File(System.getProperty("user.dir") + "/screenshots/elementScreenshotOld.png"));
		
		  logger.info("Captured screenshot and stored at location by Old Feature");
		  logger.info("testCaptueElementScreenshotOld method execution completed");
	}
	
	

}
