package com.practice.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**A Program toperform to display error message in the login window
 * @author santhosh
 *
 */
public class AutomateFossil {

	


	public static void main(String[] args) throws Exception {	
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		 WebDriverWait wait = new WebDriverWait(driver, 5);
		// TODO Auto-generated method stub
		driver.get("https://www.fossil.com/en-in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[data-url*='Sites-fossil-in-Site']")).click();
		driver.findElement(By.cssSelector("span[class='user-message']")).click();
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='loginEmail']")));
		
		driver.findElement(By.id("login-form-email")).sendKeys("fossilsanthosh");
		driver.findElement(By.id("login-form-password")).sendKeys("fossilpassword");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Please enter')]")).getText());
		
		driver.close();


	}

}
