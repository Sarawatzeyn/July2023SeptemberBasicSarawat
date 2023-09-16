package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
  WebDriver driver;// instance variable
  
  @Test
  public void openBrowser() {
	  WebDriver driver= new ChromeDriver();
	  //WebDriver=data type/parent
	  //ChromeDriver=child class of web driver//implementation class
	  
	  
  }
  @Test
  public void openApplication() {
	  
	  WebDriver driver= new ChromeDriver();  
	  driver.get("https://www.facebook.com/");
  }
	 
	  
}
