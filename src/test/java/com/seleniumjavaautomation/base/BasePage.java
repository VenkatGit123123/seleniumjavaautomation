package com.seleniumjavaautomation.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.seleniumjavaautomation.utility.MyScreenRecorder;

import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	public static Robot rb;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) throws Exception
	{
		
		
		logger = Logger.getLogger("seleniumjavaautomation");
		PropertyConfigurator.configure("resources/Log4j.properties");
		
		
		if(br.equals("chrome"))
		{
			logger.info("Chrome browser launched successfully");
			logger.info("Test Starts Running In Chrome browser.");
			WebDriverManager.chromedriver().setup();
		  //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver(); 
		    
		    
		}
		else if(br.equals("headlessChrome"))
		{
			
			logger.info("Headless chrome browser launched successfully");
			logger.info("Test Starts Running In Headless Chrome browser.");
			
			//WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
			 
		}
		
		else if(br.equals("firefox"))
		{
			logger.info("Firefox browser launched successfully");
			logger.info("Test Starts Running In FireFox browser.");
			
			//Create object of FirefoxProfile in built class to access Its properties.
			  FirefoxProfile fprofile = new FirefoxProfile();
			  //Set Location to store files after downloading.
			  fprofile.setPreference("browser.download.dir",  System.getProperty("user.dir")+"\\downloadFiles");
			  fprofile.setPreference("browser.download.folderList", 2);
			  //Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types.
			  fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
			    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"//MIME types Of MS Excel File.
			    + "application/pdf;" //MIME types Of PDF File.
			    + "application/vnd.openxmlformats-officedocument.wordprocessingml.document;" //MIME types Of MS doc File.
			    + "text/plain;" //MIME types Of text File.
			    + "text/csv"); //MIME types Of CSV File.
			  fprofile.setPreference( "browser.download.manager.showWhenStarting", false );
			  fprofile.setPreference( "pdfjs.disabled", true );
			  //Pass fprofile parameter In webdriver to use preferences to download file.
			 
			  
			
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver(); 
			 
			
			
			
		}
		else if(br.equals("headlessFirefox"))
		{
			logger.info("Headless firefox browser launched successfully");
			logger.info("Test Starts Running In Headless Firefox browser.");
			
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--headless");
			driver=new FirefoxDriver(options);
		}
		
		else if(br.equals("edge"))
		{
			logger.info("Edge browser launched successfully");
			logger.info("Test Starts Running In Edge browser.");
			//System.out.println("Test Starts Running In Edge Browser.");
			WebDriverManager.edgedriver().setup();
			//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
			driver = new EdgeDriver();
			
			
		}
		else if(br.equals("headlessEdge"))
		{  
			logger.info("Headless Browser launched successfully");
			logger.info("Test Starts Running In Headless Edge browser.");
			 //Browsers Head less mode for Edge
			
			//Initialize the EdgeOptions class
	        EdgeOptions edgeOptions =new EdgeOptions();
	        //Use the addArguments method for configuring headless
	        edgeOptions.addArguments("headless");
	        //Pass the edgeOptions object to the Edge Driver
	         driver= new EdgeDriver(edgeOptions);
	          
		   
		
		}
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		
	}
	
	@AfterClass
	public void teatDown() throws Exception
	{
		driver.quit();
		
		//to stop recording
		 MyScreenRecorder.stopRecording();
		 
		//Used Robot class to perform ALT + SPACE + 'c' keypress event.
		  rb =new Robot();
		  rb.keyPress(KeyEvent.VK_ALT);
		  rb.keyPress(KeyEvent.VK_SPACE);
		  rb.keyPress(KeyEvent.VK_C);
		  
		logger.info("Test finished ");
		logger.info("Browser closed ");
	}

}
