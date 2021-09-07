package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpExpWaitTest {

	WebDriver driver;

	public void automateForm() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();// to launch chrome browser
		driver.get("http://practice.automationtesting.in/my-account/");// hit application URL
		driver.manage().window().maximize();// maximize the window
		// implict wait 30 sec to provide time to load the page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
																		
		// Thread.sleep(30000);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("javaselenium"); // 20 sec loaded
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Testing@123");
		
		driver.findElement(By.name("login")).click();

		Thread.sleep(4000);
		//driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		ImpExpWaitTest iest = new ImpExpWaitTest();
		iest.automateForm();
	}

}
