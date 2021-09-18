package com.training.selenium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public WebDriver driver;

	public void openApplication(String appURL, String browserName) {

		// WebDriver driver = new ChromeDriver();
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();// to launch chrome browser
		} else if (browserName.equalsIgnoreCase("Firefox") || browserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get(appURL);// hit application URL
		driver.manage().window().maximize();// maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void openApplication(String appURL) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();// to launch chrome browser

		driver.get(appURL);// hit application URL
		driver.manage().window().maximize();// maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void openApp(String appURL) {
		driver.get(appURL);// hit application URL
		driver.manage().window().maximize();// maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void captureScreenshot() throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

		String ran = RandomStringUtils.randomNumeric(4);
		System.out.println("Random number-->" + ran);

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		String curDT = formatter.format(date);
		System.out.println("current date time" + curDT);

		// Move image file to new destination
		File destFile = new File("screenshots/testt" + curDT + ".jpg");

		// Copy file at destination

		FileUtils.copyFile(srcFile, destFile);

	}
	
	/**
	 * Configuration of saucelabs
	 * @param os
	 * @param browser
	 * @throws Exception
	 */
	public void runOnSauceLabsFromLocal(String os, String browser) throws Exception {

		String username = "oauth-vishnutej586-09d90";
		String access_key = "5c7f7ae8-e3d3-4b31-9931-c600bb741f89";
	    String url = "https://" + username + ":" + access_key + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

		DesiredCapabilities caps = null;

		if (os.equalsIgnoreCase("Windows")) {
 
			if (browser.equalsIgnoreCase("Chrome")) {
				caps = DesiredCapabilities.chrome();
				caps.setCapability("platform", "Windows 10"); 
				caps.setCapability("version", "92.0");
				caps.setCapability("name", "MyNaukriProfileUpdate");
				
			}

			if (browser.equalsIgnoreCase("FF")) {
				caps = DesiredCapabilities.firefox();
				caps.setCapability("platform", "Windows 7");
				caps.setCapability("version", "74.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

			if (browser.equalsIgnoreCase("IE")) {
				caps = DesiredCapabilities.internetExplorer();
				caps.setCapability("platform", "Windows 8.1");
				caps.setCapability("version", "11.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

		}

		if (os.equalsIgnoreCase("Mac")) {

			if (browser.equalsIgnoreCase("Chrome")) {

				caps = DesiredCapabilities.chrome();
				caps.setCapability("platform", "OS X 10.11");
				caps.setCapability("version", "48.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

			if (browser.equalsIgnoreCase("FF")) {

				caps = DesiredCapabilities.firefox();
				caps.setCapability("platform", "OS X 10.11");
				caps.setCapability("version", "44.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}

			if (browser.equalsIgnoreCase("Safari")) {

				caps = DesiredCapabilities.safari();
				caps.setCapability("platform", "OS X 10.11");
				caps.setCapability("version", "9.0");
				caps.setCapability("name", this.getClass().getSimpleName());
			}
		}

		if (os.equalsIgnoreCase("iOS")) {

			caps = DesiredCapabilities.iphone();
			caps.setCapability("platform", "OS X 10.10");
			caps.setCapability("version", "9.2");
			caps.setCapability("deviceName", "iPhone 6");
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("name", this.getClass().getSimpleName());
		}

		if (os.equalsIgnoreCase("Android")) {

			caps = DesiredCapabilities.android();
			caps.setCapability("platform", "Linux");
			caps.setCapability("version", "5.1");
			caps.setCapability("deviceName", "Android Emulator");
			caps.setCapability("deviceType", "phone");
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("name", this.getClass().getSimpleName());
		}

		driver = new RemoteWebDriver(new URL(url), caps);

	}

	

	public void waitForElementClick(String element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
	}

	public void waitForElementPresent(String element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
	}

	
	public void waitForElementClick(String element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
	}

}
