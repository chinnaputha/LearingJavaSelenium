package com.training.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class NaukriProfileUpdate extends TestBase {

	@Test(alwaysRun = true)
	@Parameters({ "username", "password", "browser" })
	public void loginNaukri(String username, String password, String browser) {
		System.out.println("username from xml--->" + username);
		System.out.println("password from xml--->" + password);
		openApplication("https://www.naukri.com/", browser);
		driver.findElement(By.xpath("//div[text()='Login']")).click();

		waitForElementClick("//input[@placeholder='Enter your active Email ID / Username']");
		waitForElementClick("//button[@type='submit']");

		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
				.sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(password);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		waitForElementClick("//div[text()='UPDATE PROFILE']", 15);

	}

	@Test(dependsOnMethods = "loginNaukri")
	public void updateProfile() {
		String pageTitle = driver.getTitle();

		Assert.assertEquals(pageTitle, "Home | Mynaukri", "Page Title is mismatching");

		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		waitForElementClick("//em[@class='icon edit']", 8);

		driver.findElement(By.xpath("//em[@class='icon edit']")).click();
		waitForElementClick("//button[@id='saveBasicDetailsBtn']");

		WebElement saveBtn = driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']"));

		Assert.assertTrue(saveBtn.isEnabled(), "Save Button not enabled to click");
		//Assert.assertFalse(!saveBtn.isEnabled(), "save button should be disabled");

		Actions act = new Actions(driver);
		act.click(saveBtn).build().perform();
		// driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']")).click();
	
		waitForElementPresent("//div[@class='profilePage']");
		
		List<WebElement> profilePageElements = driver.findElements(By.xpath("(//div[@class='profilePage'])/div/div[2]/descendant::span"));
		System.out.println("total elemetns-->"+profilePageElements.size());
		
		System.out.println("profile info-->"+profilePageElements.get(0).getText());
		System.out.println("profile info2-->"+profilePageElements.get(1).getText());
		//Thread.sleep(4000);//need to replace with explicit wait
		//driver.navigate().refresh();
		
		Assert.assertEquals(profilePageElements.get(1).getText(), "today","Profile not updated today");
		
	}

	@Test(dependsOnMethods = "updateProfile")
	public void logoutNaukri() {

		
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
