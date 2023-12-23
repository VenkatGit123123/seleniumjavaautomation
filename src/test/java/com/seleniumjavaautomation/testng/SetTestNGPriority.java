package com.seleniumjavaautomation.testng;

import org.testng.annotations.Test;

public class SetTestNGPriority {
	
	@Test(priority=-1)
    public void Login() {
  System.out.println("LogIn Test code.");   
    } 
    @Test(priority=0)
    public void checkMail() {
  System.out.println("checkMail Test code.");   
    } 
    @Test(priority=1)
    public void LogOut() {
  System.out.println("LogOut Test code."); 
    }
}
