package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;
import com.seleniumjavaautomation.utility.MyScreenRecorder;

public class ZoomInZoomOut extends BasePage{
	
	@Test
	public void getScrollStatus() throws Exception
	{
		
		MyScreenRecorder.startRecording("getScrollStatus");
		 driver.get("http://google.com/"); 
		//Call zooming functions to zoom in and out page.
		  zoomIn();  
		  zoomOut();
		  zoomOut();
		  set100();
	}
	
	public void zoomIn()
	{
		for(int i=0; i<4; i++){   
			  driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
			  }
	}
	
	public void zoomOut(){
		  //To zoom out page 4 time using CTRL and - keys.
		  for(int i=0; i<4; i++){
		   driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		  }
		 }
	
	 public void set100(){
		  //To set browser to default zoom level 100%
		  driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
		 }

}
