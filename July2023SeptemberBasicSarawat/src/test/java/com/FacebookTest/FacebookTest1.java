package com.FacebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest1 {
	WebDriver driver;
	
@Test
public void testOne() {
	System.out.println("hello testNg");
}
@Test
public void openChromeBrowser() {
	//open a browser
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
//open application
	driver.get("https://www.facebook.com/");
	
}
@Test

public void opnEdgeBrowser() {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.get("https://www.facebook.com/");
}

}
