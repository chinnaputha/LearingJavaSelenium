package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsExample3 extends TestBase {
	WebDriverWait wait;
	Actions act;

	public void actionEx() throws InterruptedException {
		openApplication("https://demoqa.com/droppable/");

		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='draggable']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='droppable']")));

		act = new Actions(driver);

		WebElement srcElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(srcElement, destElement).build().perform();

		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		ActionsExample3 act = new ActionsExample3();
		act.actionEx();

	}

}
