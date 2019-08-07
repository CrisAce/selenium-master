package com.practice.selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LogInTest {
	
	@Test
	public void loginTest(){
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		System.out.println("Page is opened");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
