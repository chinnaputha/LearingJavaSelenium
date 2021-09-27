package com.training.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserAction {
	
	/**
	 * Method to click on Element
	 * @param driver
	 * @param locator
	 */
	public static void click(WebDriver driver, String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public static void jsClick(WebDriver driver, String locator) {
		WebElement ele = driver.findElement(By.xpath(locator));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	public static void actClick(WebDriver driver, String locator) {
		WebElement ele = driver.findElement(By.xpath(locator));
		Actions act = new Actions(driver);
		act.click(ele).build().perform();
	}
	
	
	/**
	 * Method to click on clear field
	 * @param driver
	 * @param locator
	 */
	public static void clickAndClear(WebDriver driver, String locator) {
		driver.findElement(By.xpath(locator)).click();
		driver.findElement(By.xpath(locator)).clear();
	}
	
	/**
	 * method to enter the value in the text/text area field
	 * @param driver
	 * @param locator
	 * @param input
	 */
	public static void enterfieldValue(WebDriver driver, String locator,String input) {
		driver.findElement(By.xpath(locator)).sendKeys(input);
		
	}

}
