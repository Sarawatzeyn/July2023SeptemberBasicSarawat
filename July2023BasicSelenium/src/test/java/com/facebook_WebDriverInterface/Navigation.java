package com.facebook_WebDriverInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Navigation {
	WebDriver driver;
	
	@BeforeTest
	public void initializeApplication() {
		driver=new ChromeDriver();
		//what is navigate method
        driver.navigate().to("https://www.facebook.com/");
        //navigation method
        //driver.get("https://www.facebook.com/")
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//get method = navigation + page load
	}
	
	@Test
	public void linkTest(){
		driver.findElement(By.linkText("messenger")).click();
		//navigation method able to do, get method cannot do this
	driver.navigate().back();//going back to home page
	driver.navigate().forward();
	driver.navigate().refresh();
	
	//get method is prefer
	//because it is fully loaded method
	//I like navigate method better it has back,forward,refresh
	
	}
}
