package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsExample2 extends TestBase {
	WebDriverWait wait;

	public void actionEx() throws InterruptedException {
		openApplication("http://demo.automationtesting.in/Frames.html");

		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@data-toggle='dropdown'])[3]")));

		WebElement ele = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[3]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();

		WebElement ele2 = driver.findElement(By.xpath("//a[normalize-space(text())='Drag and Drop']"));
		// movehover on Drag and drop
		act.moveToElement(ele2).build().perform();

		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Static ']")));

		WebElement ele3 = driver.findElement(By.xpath("//a[text()='Static ']"));
		act.click(ele3).build().perform();

		WebElement srcElement = driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement destElement = driver.findElement(By.xpath("//div[@id='droparea']"));
		act.dragAndDrop(srcElement, destElement).build().perform();
		
		/*
		 * act.keyDown(Keys.ARROW_DOWN).build().perform();
		 * act.keyUp(Keys.ARROW_DOWN).build().perform();
		 */

		Thread.sleep(6000);

	}

	public static void main(String[] args) throws InterruptedException {
		ActionsExample2 act = new ActionsExample2();
		act.actionEx();

	}

}
