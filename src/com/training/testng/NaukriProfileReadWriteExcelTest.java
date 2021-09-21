package com.training.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.training.selenium.TestBase;

public class NaukriProfileReadWriteExcelTest extends TestBase {
	String userName;
	String passWord;
	XSSFWorkbook wb;
	File file;
	FileInputStream fis;

	@Test
	public void updateProfile() throws InterruptedException {

		try {
			// File location
			file = new File("excelfiles\\LoginCred.xlsx");
			// read file
			fis = new FileInputStream(file);
			// convert file into xssfwork format
			wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Naukri");
			XSSFRow row = sheet.getRow(1);
			int totRows = sheet.getPhysicalNumberOfRows();
			System.out.println("total rows avaialbe in sheet-->" + totRows);
			XSSFCell cell1 = row.getCell(0);
			XSSFCell cell2 = row.getCell(1);
			userName = cell1.toString();
			passWord = cell2.toString();
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found at given path");
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			System.out.println("No data available to read");
			ioe.printStackTrace();
		} catch (Exception e) {
			System.out.println("File not found at given path");
			e.printStackTrace();
		} finally {
			try {
				wb.close();
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("usename--->" + userName);
		System.out.println("password--->" + passWord);

		openApplication("https://www.naukri.com/", "Chrome");
		waitForElementClick("//div[text()='Login']");
		driver.findElement(By.xpath("//div[text()='Login']")).click();

		waitForElementClick("//input[@placeholder='Enter your active Email ID / Username']");
		waitForElementClick("//button[@type='submit']");

		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(passWord);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		waitForElementClick("//div[text()='UPDATE PROFILE']", 15);
		String pageTitle = driver.getTitle();

		Assert.assertEquals(pageTitle, "Home | Mynaukri", "Page Title is mismatching");

		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		waitForElementClick("//em[@class='icon edit']", 15);

		driver.findElement(By.xpath("//em[@class='icon edit']")).click();
		waitForElementClick("//button[@id='saveBasicDetailsBtn']");

		WebElement saveBtn = driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']"));

		Assert.assertTrue(saveBtn.isEnabled(), "Save Button not enabled to click");
		Assert.assertFalse(!saveBtn.isEnabled(), "save button should be disabled");

		// scroll to webelement using javascript executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", saveBtn);

		Thread.sleep(4000);

		Actions act = new Actions(driver);
		act.click(saveBtn).build().perform();

		// click using javascript executor
		js.executeScript("arguments[0].click();", saveBtn);

		//driver.findElement(By.xpath("//button[@id='saveBasicDetailsBtn']")).click();

		waitForElementPresent("//div[@class='profilePage']");

		List<WebElement> profilePageElements = driver
				.findElements(By.xpath("(//div[@class='profilePage'])/div/div[2]/descendant::span"));
		System.out.println("total elemetns-->" + profilePageElements.size());

		System.out.println("profile info-->" + profilePageElements.get(0).getText());
		System.out.println("profile info2-->" + profilePageElements.get(1).getText()); // Thread.sleep(4000);//need to
		// replace with explicit wait // driver.navigate().refresh();
		js.executeScript("history.go[0];");// refresh using javascript

		Assert.assertEquals(profilePageElements.get(1).getText(), "today", "Profile not updated today");

		String pageTitle2 = js.executeScript("return document.title;").toString();
		System.out.println("page title using javascript" + pageTitle2);

		boolean isPageTitle = pageTitle2.contains("Mynaukri"); //
		Assert.assertTrue(isPageTitle, "Page title not matching");

		Assert.assertTrue(pageTitle2.contains("Mynaukri"), "Page title not matching");
		System.out.println("not proceed with next step");

		// Assert will stop the execution (HardAssertion)
		// verify will skip the particular step and proceed further steps(SoftAssertion)

	}

	@AfterTest
	public void closeBrowser() {
		 driver.quit();
	}

}
