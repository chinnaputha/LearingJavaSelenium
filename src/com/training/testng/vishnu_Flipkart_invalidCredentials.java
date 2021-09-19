package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Class to Login into Flipkart App with invalid Credentials & validate
 * 
 * @author vishnuTej
 *
 */
public class vishnu_Flipkart_invalidCredentials extends BaseTest {

	@BeforeTest
	public void setUp() {
		appLaunch("https://www.flipkart.com/");

	}

	@Test
	@Parameters({ "email_iv", "password" })
	public void loginValidate(String email_iv, String password) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(email_iv);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
		//Thread.sleep(2000);
		WebElement erro_Msg = driver.findElement(By.xpath("//span[text() = 'Your username or password is incorrect']"));
		System.out.println(erro_Msg.getText());
		String msg = erro_Msg.getText();
		Assert.assertEquals(msg, "Your username or password is incorrect" ,"Captured error message is invalid");
		
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
