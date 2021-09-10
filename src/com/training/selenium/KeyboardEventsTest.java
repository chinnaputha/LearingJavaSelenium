package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class to perform webelment interface methods(click,clear, sendkeys.....)
 * 
 * @author Chinna.Putha
 *
 */
public class KeyboardEventsTest {

	static String appURL = "http://demo.automationtesting.in/Register.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();// to launch chrome browser
		driver.get(appURL);// hit application URL
		driver.manage().window().maximize();// maximize the window

		WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		firstName.click();
		firstName.sendKeys("Hello Fristname");
		Thread.sleep(2000);
//		firstName.sendKeys(Keys.CONTROL,"a");
//		Thread.sleep(2000);
//		firstName.sendKeys(Keys.DELETE);
		
		String multiKeys= Keys.chord(Keys.CONTROL,"a",Keys.DELETE);
		firstName.sendKeys(multiKeys);
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("LASTNAME");

		// 1000 ms -- 1 sec
		Thread.sleep(10000);
		driver.quit();// close opened window

	}

}
