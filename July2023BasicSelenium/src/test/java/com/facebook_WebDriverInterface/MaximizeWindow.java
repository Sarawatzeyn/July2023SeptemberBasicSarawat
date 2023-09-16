package com.facebook_WebDriverInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MaximizeWindow {
	WebDriver driver;
	
	
	@BeforeTest
	
	public void initializeApplication() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		//how do you maxmize window
		driver.manage().window().maximize();
		//how do you minimize window
	driver.manage().window().minimize();
	//how do you fullscreen window
	driver.manage().window().fullscreen();
	
	}

	
	@Test
	public void loginTest() {
		
	}
}
