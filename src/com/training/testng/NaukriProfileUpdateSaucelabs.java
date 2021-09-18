package com.training.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.training.selenium.TestBase;

public class NaukriProfileUpdateSaucelabs extends TestBase {

	@Test(alwaysRun = true)
	@Parameters({ "username", "password", "appURL" })
	public void loginNaukri(String username, String password, String appURL) throws Exception {
		System.out.println("username from xml--->" + username);
		System.out.println("password from xml--->" + password);
		runOnSauceLabsFromLocal("Windows", "chrome");
		openApp(appURL);
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
	public void updateProfile() throws InterruptedException {
		String pageTitle = driver.getTitle();

		Assert.assertEquals(pageTitle, "Home | Mynaukri", "Page Title is mismatching");

		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		waitForElementClick("//em[@class='icon edit']", 15);

		driver.findElement(By.xpath("//em[@class='icon edit']")).click();
		waitForElementClick("//button[@id='saveBasicDetailsBtn']");

		WebElement saveBtn = driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']"));

		Assert.assertTrue(saveBtn.isEnabled(), "Save Button not enabled to click");
		//Assert.assertFalse(!saveBtn.isEnabled(), "save button should be disabled");

		
		
		
		//scroll to webelement using javascript executor
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", saveBtn);
		
		Thread.sleep(4000);
		
//		Actions act = new Actions(driver);
//		act.click(saveBtn).build().perform();
		
		//click using javascript executor
		js.executeScript("arguments[0].click();", saveBtn);
		
		// driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']")).click();
	
		waitForElementPresent("//div[@class='profilePage']");
		
		List<WebElement> profilePageElements = driver.findElements(By.xpath("(//div[@class='profilePage'])/div/div[2]/descendant::span"));
		System.out.println("total elemetns-->"+profilePageElements.size());
		
		System.out.println("profile info-->"+profilePageElements.get(0).getText());
		System.out.println("profile info2-->"+profilePageElements.get(1).getText());
		//Thread.sleep(4000);//need to replace with explicit wait
		//driver.navigate().refresh();
		js.executeScript("history.go[0];");//refresh using javascript
		
		
		
		Assert.assertEquals(profilePageElements.get(1).getText(), "today","Profile not updated today");
		
		String pageTitle2= js.executeScript("return document.title;").toString();
		System.out.println("page title using javascript"+pageTitle2);
		
		//boolean isPageTitle = pageTitle2.contains("Mynaukri");
		//Assert.assertTrue(isPageTitle, "Page title not matching");
		
//		Assert.assertTrue(pageTitle2.contains("Mynaukri2"), "Page title not matching");
//		System.out.println("not proceed with next step");
		//Assert will stop the execution (HardAssertion)
		//verify will skip the particular step and proceed further steps(SoftAssertion)
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(pageTitle2.contains("Mynaukri2"), "page title mismatching");
		System.out.println("proceed with next step");
		
//		if(pageTitle2.contains("Mynaukri2")) {
//			System.out.println("page title matching");
//		} else {
//			System.out.println("page title not matching");
//		}
//		
		
	}

	@Test(dependsOnMethods = "updateProfile")
	public void logoutNaukri() {

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
