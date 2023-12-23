package com.seleniumjavaautomation.tests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seleniumjavaautomation.base.BasePage;

public class HandleAjaxAutoSuggestDropList extends BasePage{
	
	
	//Data provider Is used for supplying 2 different values to Search_Test method.
	 @DataProvider(name="search-data")
	 public Object[][] dataProviderTest(){
	     return new Object[][]{{"selenium webdriver tutorial"},{"auto s"}};
	 }
	
	@Test(dataProvider="search-data")
	public void testHandleAjaxAutoSuggestDropList(String Search)
	{
		driver.get("https://www.youtube.com/"); 
		driver.findElement(By.className("ytd-searchbox")).clear();
		   driver.findElement(By.className("ytd-searchbox")).sendKeys(Search);
		   int i=1;
		   int j=i+1;
		   try{
		    //for loop will run till the NoSuchElementException exception.
		    for(i=1; i<j;i++)
		      { 
		     //Value of variable i Is used for creating xpath of drop list's different elements.
		     String suggestion = driver.findElement(By.xpath("//*[@id='gsr']/table/tbody/tr[1]/td[2]/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td[1]/span")).getText();
		     System.out.println(suggestion);
		     j++;     
		      } 
		    }catch(Exception e){//Catch block will catch and handle the exception.
		     System.out.println("***Please search for another word***"); 
		     System.out.println();
		    }  
		  }
	}


