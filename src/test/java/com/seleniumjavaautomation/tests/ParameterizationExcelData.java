package com.seleniumjavaautomation.tests;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import com.seleniumjavaautomation.base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ParameterizationExcelData extends BasePage{
	
	
	@Test
	public void testParameterizationExcelData() throws BiffException, IOException, InterruptedException
	{
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		//Open MyDataSheet.xls file from given location. 
		  FileInputStream fileinput = new FileInputStream("C:\\Users\\krish\\eclipse-workspace\\seleniumjavaautomation\\datafiles\\MyDataSheet.xls");
	
		//Access first data sheet. getSheet(0) describes first sheet.
		  Workbook wbk = Workbook.getWorkbook(fileinput);
		  Sheet sheet = wbk.getSheet(0);
		  
		//Read data from the first data sheet of xls file and store it in array.
		  String TestData[][] = new String[sheet.getRows()][sheet.getColumns()];
		  
		//To enable Last Name text box.
		  JavascriptExecutor javascript = (JavascriptExecutor) driver;
		  String toenable = "document.getElementsByName('lname')[0].removeAttribute('disabled');";
		  javascript.executeScript(toenable);
		  
		//Type data in first name and last name text box from array.
		  for(int i=0;i<sheet.getRows();i++)
		  {
		   for (int j=0;j<sheet.getColumns();j++)
		   {
		    TestData[i][j] = sheet.getCell(j,i).getContents();
		    if(j%2==0)
		    {
		     driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(TestData[i][j]);
		    }
		    else
		    {
		     driver.findElement(By.xpath("//input[@name='lname']")).sendKeys(TestData[i][j]);
		    }
		   }
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@name='fname']")).clear();
		   driver.findElement(By.xpath("//input[@name='lname']")).clear();
		  }
		  Thread.sleep(1000);
	
	}

}
