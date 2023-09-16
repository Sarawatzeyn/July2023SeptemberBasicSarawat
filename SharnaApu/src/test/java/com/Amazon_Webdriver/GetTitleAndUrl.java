package com.Amazon_Webdriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetTitleAndUrl {

	WebDriver driver;
	@BeforeTest
	
	public void initializeApplication() {
		
		
		
	}
	@Test
	
	public void homePageTest() {
		
		String actualTitle="Facebook - log in or sign up";
		String expectedTitle=driver.getTitle();
		System.out.prntln("Expected homepage title"+ expectedTile);
	}
	
	
	
	
	
}

