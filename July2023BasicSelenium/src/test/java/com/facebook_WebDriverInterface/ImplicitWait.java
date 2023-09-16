package com.facebook_WebDriverInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitWait {
	
	WebDriver driver;
	@BeforeTest
	
	public void openFacebook() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//if it cannot find in 10 seconds =no such element found exception
	//if it can find in 5 seconds =do not wait 10 seconds go to next line
		//write once==implementing on all the find element method
		

		
	
	}
	@Test
	
	public void loginTest() {

		driver.findElement(By.id("email")).sendKeys("sar22@hmail.com");
		driver.findElement(By.id("pass")).sendKeys("sa123");
		driver.findElement(By.name("login")).click();
	
		
		
	}

}
