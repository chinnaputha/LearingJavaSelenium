package com.training.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;
import com.training.utils.BrowserAction;

public class AutoITExample extends TestBase {

	@Test(alwaysRun = true)
	public void loginNaukri() throws Exception {
		openApplication("http://demo.automationtesting.in/Register.html", "Chrome");

		waitForElementVisible("//input[@type='file']");

		BrowserAction.actClick(driver, "//input[@type='file']");

		Thread.sleep(4000);
		Runtime.getRuntime().exec("autoit\\fileUpload.exe");

		Thread.sleep(6000);

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
