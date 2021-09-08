package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	WebDriver driver;
	WebDriverWait wait;

	public void automateForm() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();// to launch chrome browser
		driver.get("http://demo.automationtesting.in/Register.html");// hit application URL
		driver.manage().window().maximize();// maximize the window
		// implict wait 30 sec to provide time to load the page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Practice Site")).click();

		wait = new WebDriverWait(driver, 5);
		// wait for element to be visible
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("img[alt='Shop Selenium Books']"))));

		wait.until(ExpectedConditions.urlToBe("http://practice.automationtesting.in/"));

		wait = new WebDriverWait(driver, 5,100); // wait for wait is present and it should be clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Thinking in HTML']")));

		driver.findElement(By.cssSelector("img[alt='Thinking in HTML']")).click();

		Thread.sleep(4000);
		// driver.close();

		/*
		 * imp wait - 30 sec exp wait - 5 sec
		 * 
		 * 5,30,35
		 */

	}

	public static void main(String[] args) throws InterruptedException {
		ExplicitWaitTest iest = new ExplicitWaitTest();
		iest.automateForm();
	}

}
