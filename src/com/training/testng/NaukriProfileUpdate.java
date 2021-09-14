package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class NaukriProfileUpdate extends TestBase {
	
	/*
	 * String userName="javacampus.selenium@gmail.com"; String
	 * passWord="Testing@123";
	 */
	
	@Test(alwaysRun = true)
	@Parameters({"username","password"})
	public void loginNaukri(String username,String password) {
		System.out.println("username from xml--->"+username);
		System.out.println("password from xml--->"+password);
		openApplication("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		waitForElementClick("//input[@placeholder='Enter your active Email ID / Username']");
		waitForElementClick("//button[@type='submit']");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		waitForElementClick("//div[text()='UPDATE PROFILE']",15);
		
	}

	@Test(dependsOnMethods = "loginNaukri")
	public void updateProfile() {
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		waitForElementClick("//em[@class='icon edit']",8);
		
		driver.findElement(By.xpath("//em[@class='icon edit']")).click();
		waitForElementClick("//button[@id='saveBasicDetailsBtn']");
		
		WebElement saveBtn= driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']"));
		
		Actions act = new Actions(driver);
		act.click(saveBtn).build().perform();
		//driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']")).click();
		
	}
	
	

	
	@Test(dependsOnMethods = "updateProfile")
	public void logoutNaukri() {

	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
