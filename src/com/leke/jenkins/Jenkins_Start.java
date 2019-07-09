package com.leke.jenkins;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.leke.browser.Browser;

public class Jenkins_Start extends Browser{
	
	@BeforeMethod
	@Parameters({"browser"})
	public void initialsetup(String browser) throws Exception {
		
		driver = browser(browser);
		Thread.sleep(2000);
		wait = new WebDriverWait(driver,10);
		
		
	}
	 @Test (priority=2)
	public void launch_page () throws Exception {
	
		driver.get("https://www.biblegateway.com/passage/?search=Psalm+3&version=NIV");
		Thread.sleep(2000);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		//thewaymyh
		
	}
	@AfterTest
	public void tear_down() {
		
		driver.close();
	}
	

}
