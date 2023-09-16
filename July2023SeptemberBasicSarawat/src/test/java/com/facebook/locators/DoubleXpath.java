package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleXpath {
	WebDriver driver;
	
	@BeforeTest
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void DoubleXpathLoginTest() {
		
		driver.findElement(By.xpath("//input[@name='email'][@id='email']")).sendKeys("ddd");
	}
	@Test
	public void orCondition() {
		driver.findElement(By.xpath("//input[@name='pass' or @id='pass']")).sendKeys("lalala");
		
	}
	@Test
	public void andCondition() {
		driver.findElement(By.xpath("//input[@name='pass' and @id='pass']")).sendKeys("yay");
		//
	}
}
