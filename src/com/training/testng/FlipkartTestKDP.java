package com.training.testng;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
/*
 * author @ K S S DURGA PRASAD
 * 
 */
public class FlipkartTestKDP {
	
	@Test

	public void test()  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http:\\www.flipkart.com");
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("kssdprasad@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("9848394817A@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='7000']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3uDYxP']//select[@class='_2YxCDZ']//option[@value='20000']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='4 GB']//div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='realme C21 (Cross Black, 64 GB)']")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(tabs2.size());
		
	    driver.switchTo().window(tabs2.get(1));
	    //driver.close();
	    
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(tabs2.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		
		WebElement MainMenu = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));
		actions.moveToElement(MainMenu);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Logout']")).click();
		Thread.sleep(2000);

	}

}
