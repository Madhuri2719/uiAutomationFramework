package com.automation.practice.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LaunchBrowser {
	static WebDriver driver;
	
	@Test
	public static void LaunchChromeClearHistory() throws Exception
	
	{
		
		System. setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		// Initialize browser.
		 ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.addArguments("disable-infobars");
	        chromeOptions.addArguments("start-maximized");
	        driver = new ChromeDriver(chromeOptions);
	        /*driver.get("chrome://settings/clearBrowserData");
	        Thread.sleep(5000);
	        driver.switchTo().activeElement();
	        //Thread.sleep(5000);
	        driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")).click();
	        Thread.sleep(5000);*/
		//driver=new ChromeDriver();
		driver.get("https://lm4www.proflowers.com/");
		
	}

}
