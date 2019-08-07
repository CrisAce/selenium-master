package com.practice.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	// initialize WebDriver only once
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/cristianion/Documents/workspace/E2ESeleniumFramework/src/main/resources/data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
			driver = new ChromeDriver();
		}
		
		else if (browserName.equals("FireFox")) {
			System.setProperty("webdriver.firefox.driver", "src/main/resources/geckodriver");
			
		}
		
		
		
		return driver;
		
	}

}
