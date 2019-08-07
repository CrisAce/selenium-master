package com.practice.selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SafariTest {
	
	@Test
	public void runSafariTest(){
		
		WebDriver driver = new SafariDriver();
		driver.get("http://www.apple.com");
		
	}

}
