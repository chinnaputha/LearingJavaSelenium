package com.training.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;
import com.training.utils.BrowserAction;

/**
 * Class for upload file with out AutoIT, in this case input type should be file e.g.//input[@type='file']
 * @author Chinna.Putha
 *
 */
public class FileUploadWithoutAutoIT extends TestBase {

	@Test(alwaysRun = true)
	public void fileUploadWOAutoit() throws Exception {
		openApplication("http://demo.automationtesting.in/Register.html", "Chrome");

		waitForElementVisible("//input[@type='file']");
		Thread.sleep(4000);
		
		String currentPath= System.getProperty("user.dir");
		System.out.println("current path-->"+currentPath);
		
		BrowserAction.enterfieldValue(driver, "//input[@type='file']",currentPath+"\\"+"excelfiles\\LoginCred.xlsx");

		Thread.sleep(10000);
		


	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
