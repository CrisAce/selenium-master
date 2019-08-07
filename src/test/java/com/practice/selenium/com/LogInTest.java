package com.practice.selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.practice.selenium.BaseTest;

public class LogInTest extends BaseTest {
	
	@Test
	public void loginTest(){

		driver.get("http://the-internet.herokuapp.com/login");
		System.out.println("Page is opened");
	}

}
