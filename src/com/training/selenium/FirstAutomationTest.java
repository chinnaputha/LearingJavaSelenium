package com.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();// to launch chrome browser
		driver.get("https://www.facebook.com/");// hit application URL
		driver.manage().window().maximize();// maximize the window
		String curURL = driver.getCurrentUrl();
		System.out.println("current url of web page -->" + curURL);
		String pageTitle = driver.getTitle();
		System.out.println("title of web page-->" + pageTitle);

		if (pageTitle.equals("Facebook – log in or sign up")) {
			System.out.println("page title is correct");
		} else {
			System.out.println("page title is wrong");
		}

		if (curURL.contains("facebook")) {
			System.out.println("URL contains Facebook");
		} else {
			System.out.println("URL not contains Facebook");
		}

		boolean isURLTrue = curURL.contains("Facebook");
		System.out.println("url contains "+isURLTrue);
		/*if (isURLTrue) {
			System.out.println("URL contains Facebook");
		} else {
			System.out.println("URL not contains Facebook");
		}*/

		// 1000 ms -- 1 sec
		Thread.sleep(2000);
		driver.quit();// close opened window

	}

}
