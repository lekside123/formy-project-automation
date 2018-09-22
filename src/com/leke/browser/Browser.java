package com.leke.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public WebDriver browser(String browser) {
		
		switch (browser) {
		
		case "chrome":
		
			System.setProperty("webdriver.chrome.driver", "C://Users//User//Documents//Drivers//chromedriver1//chromedriver.exe");
			
			driver =  new ChromeDriver();
			
			break; 	
		default:
			break;
		
			
		} 	
		driver.manage().window().maximize();
		return driver;
		
	}

}
