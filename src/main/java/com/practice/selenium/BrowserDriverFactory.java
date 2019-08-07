package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserDriverFactory {
	
	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private String browser;
	
	
	public BrowserDriverFactory(String browser) {
		this.browser = browser.toLowerCase();
	}
	
	public WebDriver createDriver(){
		System.out.println("[Seting up driver:" + browser + "]");
		
		
		//creating driver
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
			driver.set(new ChromeDriver());
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
			driver.set(new FirefoxDriver());
			break;
		case "safari":
			driver.set(new SafariDriver());
			break;

		default:
			System.out.println("[Couldn't set "+browser+" starting chrome driver by default]");
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
			driver.set(new ChromeDriver());
			break;
		}
		
		return driver.get();
		
	}
	
	
	

}