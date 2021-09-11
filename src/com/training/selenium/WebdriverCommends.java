package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommends {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Thread.sleep(3000);
//		// Navigate Commands
//		driver.navigate().to("https://Gmail.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();  //Refresh the page
//		driver.findElement(By.name("password")).sendKeys(Keys.F5);

//		// WebElement Commands
		//clear method clear the value
//		driver.findElement(By.id("email")).sendKeys("shivaraja");
//		Thread.sleep(3000);
//		driver.findElement(By.id("email")).clear();
//
//		// getText().method is used for read the heading
//		System.out.println(driver.findElement(By.xpath("//div[@align='center']")).getText());
//		
//		//isDisplayed() method is used for read the element return True or False
//		System.out.println(driver.findElement(By.xpath("//input[@value='Cricket']")).isDisplayed());
//		
//		//isEnabled() method is used for button purpose return True or False
//		System.out.println(driver.findElement(By.id("submitbtn")).isEnabled());
//		
//		//is selected() method is used for select the value return True or False
		System.out.println(driver.findElement(By.xpath("//input[@value='Cricket']")).isSelected());  //true
//		
		

	}

}