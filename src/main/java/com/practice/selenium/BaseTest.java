package com.practice.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	// initialize WebDriver only once
	protected  WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	@Parameters({"browser"})
	protected void setUp(@Optional("chrome")String browser){
		BrowserDriverFactory factory = new BrowserDriverFactory(browser);
		driver = factory.createDriver();
		
		//maximize browser window
		driver.manage().window().maximize();
	}
	@AfterMethod(alwaysRun=true)
	protected void thearDown(){
		System.out.println("[Closing driver]");
		driver.quit();
	}
}
