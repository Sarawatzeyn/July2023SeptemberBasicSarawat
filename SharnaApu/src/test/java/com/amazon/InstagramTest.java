package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class InstagramTest {

	
		WebDriver driver;
		
     @BeforeTest
		
		public void openApplication() {
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");	
     }
		@Test
		public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("sara.hmail.com");
		driver.findElement(By.id("password")).sendKeys("nurul12");	
		driver.manage().window().maximize();
		driver.findElement(By.name("login")).click();
		
		}
		@AfterTest
		public void closeApplication() {
			driver.quit();
		}
		
     
     
	}


