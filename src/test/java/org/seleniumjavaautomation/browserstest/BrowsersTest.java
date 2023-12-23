package org.seleniumjavaautomation.browserstest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowsersTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{ 
		
		
	
		
		
 /**	//Browsers Head less mode for Firefox 
		
		WebDriverManager.firefoxdriver().setup();
		//Set Firefox Headless mode as TRUE
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true); 
        //pass the options parameter in the Firefox driver declaration
         driver = new FirefoxDriver(options);
		System.out.println("Headless Firefox browser launched successfully"); **/
		
		
	//Browsers Head less mode for Chrome
		
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		System.out.println("Headless Chrome browser launched successfully"); 
		
		
		
		
	 //Browsers Head less mode for Edge
		
		//Initialize the EdgeOptions class
        EdgeOptions edgeOptions =new EdgeOptions();
        //Use the addArguments method for configuring headless
        edgeOptions.addArguments("headless");
        //Pass the edgeOptions object to the Edge Driver
         driver= new EdgeDriver(edgeOptions);
         System.out.println("Headless Edge browser launched successfully"); 
         
         
         
     /**  //Headless HTML Unit webdriver
         driver = new HtmlUnitDriver();
         System.out.println("Headless HTML Unit driver browser launched successfully");	**/
		
		
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser closed");
	}
	
	
	
	
	
	@Test
	public void testAppurl()
	{
		
		// Open url in browser
		driver.get("http://only-testing-blog.blogspot.com");
		
		//Get the current url
		String url = driver.getCurrentUrl();
		System.out.println("Application URL : "+url);
		
	}
	
	@Test
	public void testElementEnabled()
	{
		// Open url in browser
		driver.get("http://only-testing-blog.blogspot.com");
		
		if(driver.findElement(By.id("gparent_1")).isEnabled()) {
			
			System.out.println("Grand Parent1 Text feild is enabled");
			driver.findElement(By.id("gparent_1")).sendKeys("Venkatakrishna");
			System.out.println("Name Entered successfully");
			
		}
		else {
			
			System.out.println("Grand Parent1 Text feild is disabled");
			
		
		}	
		
	}
	
	
	@Test
	public void testSampleCal()
	{
		// Load sample calc test URL.
		  driver.get("http://only-testing-blog.blogspot.com/2014/04/calc.html");
		  
		  driver.findElement(By.xpath("//input[@id='1']")).click();
		  driver.findElement(By.xpath("//input[@id='plus']")).click();
		  driver.findElement(By.xpath("//input[@id='6']")).click();
		  driver.findElement(By.xpath("//input[@id='equals']")).click();
		  
		  String result = driver.findElement(By.xpath("//input[@id='Resultbox']")).getAttribute("value");
		  System.out.println("Calc test result Is :" + result);
	}
	
	
	
	
	

}
