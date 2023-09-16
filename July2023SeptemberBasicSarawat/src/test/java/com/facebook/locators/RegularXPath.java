package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegularXPath {
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
	public void logInTest() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
		WebElement passWord=driver.findElement(By.xpath("//input[@name='pass']"));
		//passWord.sendKeys(null);
		//passWord==local variable
		passWord.clear();
		passWord.sendKeys("jhf");
		System.out.println(passWord.getTagName());
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		
	}
}
