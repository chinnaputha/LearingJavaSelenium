package com.training.selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void captureScreenshot() throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

		String ran=RandomStringUtils.randomNumeric(4);
		System.out.println("Random number-->"+ran);
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		String curDT=formatter.format(date);
		System.out.println("current date time"+curDT);
		
		
		// Move image file to new destination
		File destFile = new File("screenshots/testt"+curDT+".jpg");

		// Copy file at destination

		FileUtils.copyFile(srcFile, destFile);

	}

}
