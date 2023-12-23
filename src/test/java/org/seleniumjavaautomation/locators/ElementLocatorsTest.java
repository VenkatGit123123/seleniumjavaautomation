package org.seleniumjavaautomation.locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementLocatorsTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()		 
    {
		
		 //To Launch Chrome Browser
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	@Test(priority=0)
	public void testIDElementLoc()
	{
		for(int i=0; i<=20; i++)
		{
			driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
			//Locating element by id
			WebElement btn = driver.findElement(By.id("submitButton"));
			if(btn.isEnabled())
			{
				//if webelement's attribute found enabled then this code will be executed.
			    System.out.print("\nCongr8s... Button is enabled and webdriver is clicking on it now");
			    
			  //Locating button by id and then clicking on it.
			    driver.findElement(By.id("submitButton")).click(); 
			    i=20;
			}
			else
			{
				//if webelement's attribute found disabled then this code will be executed.
			    System.out.print("\nSorry but Button is disabled right now..");
			   }
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	
	
	@Test(enabled=false)
	public void testSubmitButton()
	{
		driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html"); 
		
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("MyFName");
		   driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("MyLName");
		   driver.findElement(By.xpath("//input[@name='EmailID']")).sendKeys("My Email ID");
		   driver.findElement(By.xpath("//input[@name='MobNo']")).sendKeys("My Mob No.");
		   driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("My Comp Name");
		 //To submit form.
		   //You can use any other Input field's(First Name, Last Name etc.) xpath too In bellow given syntax.
		   driver.findElement(By.xpath("//input[@name='Company']")).submit();
		   
		/*   Alert alert = driver.switchTo().alert();
		   alert.accept();
		   System.out.println(alert); */
		   
		   
	}
	
	@Test
	public void testClassNameElementLoc()
	{
		 driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		 String datetime = driver.findElement(By.className("date-header")).getText();
		 System.out.println(datetime);
	}
	
	
	@Test(priority=3)
	public void testTagNameElementLoc()
	{
		 driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		//Locating element by tagName and store its text in to variable dropdown.
		   String dropdown = driver.findElement(By.tagName("select")).getText();
		   System.out.print("Drop down list values are as bellow :\n"+dropdown);
	}
	
	
	@Test
	public void testNameElementLoc()
	{
		 driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		//Locating element by Name and type given texts in to input box.
		   driver.findElement(By.name("fname")).sendKeys("My First Name");
	
	

	}
	
	@Test(priority=2)
	public void testLinkTextElementLoc()
	{
		 driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		driver.findElement(By.linkText("Click Here")).click(); //Locate element by linkText and then click on it.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("18:")));  //Locate element by partial linkText. 
	

	
	}
	
	@Test
	public void testCSSSelectorElementLoc()
	{
		 driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		 driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("My Name");//Locate element by cssSelector and then type the text in it.
	
	
	
	
	}
	
	@Test(priority=1)
	public void testXpathElementLoc()
	{
		 driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		 driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");//Locate element by cssSelector and then type the text in it.
	
	
	
	
	}
	

}
