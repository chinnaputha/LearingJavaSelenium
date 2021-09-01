package com.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	 WebDriver driver;

	public void openApplication(String appURL) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();// to launch chrome browser
		driver.get(appURL);// hit application URL
		driver.manage().window().maximize();// maximize the window
	}

}
