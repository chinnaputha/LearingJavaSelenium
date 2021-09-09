package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample extends TestBase{
	
	public void actionEx() throws InterruptedException {
		openApplication("http://demo.automationtesting.in/Frames.html");
		
		WebElement ele = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[3]"));
		Actions act = new Actions(driver);
		
		//mouseover on Interactions
		act.moveToElement(ele).build().perform();
		
		Thread.sleep(4000);
		WebElement ele2 = driver.findElement(By.xpath("//a[normalize-space(text())='Drag and Drop']"));
		//movehover on Drag and drop
		act.moveToElement(ele2).build().perform();
		 
		Thread.sleep(4000);
		//a[text()='Static ']
		
	//	driver.findElement(By.xpath("//a[text()='Static ']")).click();// webelment click
		
		WebElement ele3= driver.findElement(By.xpath("//a[text()='Static ']"));
		
		//act.click(ele3).build().perform();

		act.contextClick(ele3).build().perform();//right click on webElement
		
		//act.doubleClick().build().perform();
		
		//act.doubleClick(ele3).build().perform();
		
		Thread.sleep(6000);
		
	}

	public static void main(String[] args) throws InterruptedException{
		ActionsExample act = new ActionsExample();
		act.actionEx();

	}

}
