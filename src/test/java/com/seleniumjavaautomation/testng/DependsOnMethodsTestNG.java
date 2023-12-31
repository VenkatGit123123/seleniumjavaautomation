package com.seleniumjavaautomation.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsTestNG {
	
	//This Is Independent method so It will be executed.
	@Test(priority=-1)
    public void Login() {
  System.out.println("LogIn Test code."); 
//Bellow give assertion will fail to fail Login() method Intentionally.
  Assert.assertTrue(5>6, "Condition is False");
    } 
	
	//This method Is depends on Login method.
    //This method's execution will be skipped from execution because Login() method will fail.
    @Test(priority=0, dependsOnMethods= {"Login"})
    public void checkMail() {
  System.out.println("checkMail Test code.");   
    } 
    
  //This method Is depends on Login and checkMail methods.
    //This method's execution will be skipped from execution because Login() method will fail.
    @Test(priority=1,dependsOnMethods= {"Login","checkMail"} )
    public void LogOut() {
  System.out.println("LogOut Test code."); 
    }
    
  //This Is Independent method so It will be executed.
    @Test(priority=2)
    public void checkLogInValidations() {
  System.out.println("checkLogInValidations Test code.");   
    }

}
