package com.seleniumjavaautomation.tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.Select;

public class WebdriverBasicActionCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*// Creating New Instance Of Firefox Driver
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); */
		
		// Command To Open URL In Browser
		//driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		// Clicking on any element or button of webpage
		//driver.findElement(By.id("submitButton")).click();
		
		// Store text of targeted element in variable
		//String dropdown = driver.findElement(By.tagName("select")).getText();
		
		//Typing text in text box or text area.
		//driver.findElement(By.name("fname")).sendKeys("My First Name");
		
		//Applying Implicit wait in webdriver
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		// Applying Explicit wait in webdriver with WebDriver canned conditions.
		
		
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='timeLeft']"), "Time left: 7 seconds"));
        
        //how to selenium wait until alert is present 
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
         wait.until(ExpectedConditions.alertIsPresent());
         
         //How to wait for Title
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
          wait.until(ExpectedConditions.titleContains(": MyTest));
          
         //Selenium wait for element to be visible
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='text3']")));
           
          // how to waiting till element becomes invisible
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
           wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='text4']")));
           
           
           //how to wait for element to be clickable selenium java
             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
             wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submitButton")));

           
           */
            
            
        //Get page title in selenium webdriver
		//driver.getTitle();
		
		//Get Current Page URL In Selenium WebDriver
		//driver.getCurrentUrl();
		
		// Get domain name using java script executor
		/*JavascriptExecutor javascript = (JavascriptExecutor) driver;
		String CurrentURLUsingJS=(String)javascript.executeScript("return document.domain"); */
		
		// Generate alert using webdriver's java script executor interface
		/*JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('Test Case Execution Is started Now..');"); */
		
		
		//Selecting or Deselecting value from drop down in selenium webdriver.
		
		/*//Select By Index
		Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
		listbox.selectByIndex(0);
		
		//Select By Value
		Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
		listbox.selectByValue("Italy");
		
		//Select By Visible Text
		Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
		mydrpdwn.selectByVisibleText("Audi"); 
		
		
		//Deselect by Index
		Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
		listbox.deselectByIndex(0);
		
		//Deselect By Value
		Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
		listbox.deselectByValue("Italy");
		
		//Deselect By Visible Text
		Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
		mydrpdwn.deselectByVisibleText("Audi"); 
		
		//Deselect All
		Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
        listbox.deselectAll();

		
		 //isMultiple()
		 Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
         boolean value = listbox.isMultiple();
         
         //Navigate to URL or Back or Forward in Selenium Webdriver
          driver.navigate().to("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
          driver.navigate().back();
          driver.navigate().forward();
          
          //Verify Element Present in Selenium WebDriver
           Boolean iselementpresent = driver.findElements(By.xpath("//input[@id='text2']")).size()!= 0;
           
          //Capturing entire page screenshot in Selenium WebDriver
           File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
           FileUtils.copyFile(f,new File("Path of the local to savescreenshot.png"))
            
          
         
         
         
         
		*/
				
		
		
		
		
           
          
         
         
         
        
         
	}

}
