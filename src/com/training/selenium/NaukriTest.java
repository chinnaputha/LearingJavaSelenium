package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class NaukriTest extends TestBase {

	public void naukriLogin() throws InterruptedException {
		openApplication("https://www.naukri.com/");
		String appUrl = driver.getCurrentUrl();
		System.out.println("App URL --"+appUrl);
		
		if(appUrl.contains("naukri")) {
			System.out.println("Naukri app opened");
		} else {
			System.out.println("Naukri app not opened");
		}

		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register for free")).click();
		
		//driver.findElement(By.xpath("//a[text()='Register for free']")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//button[contains(@title,'Fresher')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Testing Profile");
		Thread.sleep(4000);
		
		
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		NaukriTest nt = new NaukriTest();
		nt.naukriLogin();

	}

}
