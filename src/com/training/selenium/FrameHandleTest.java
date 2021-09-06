package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameHandleTest extends TestBase {

	public void frameHandle() throws InterruptedException {
		openApplication("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(4000);
		
		
		//switch to frame using index position
		//driver.switchTo().frame(0);
		//switch to frame using id or name attributes of iframe tag
		//driver.switchTo().frame("singleframe");
		
		//switch to frame using webelement
		WebElement ele = driver.findElement(By.cssSelector("iframe[id='singleframe']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		Thread.sleep(4000);
		
		//come out from iframe
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Home")).click();
		
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		FrameHandleTest wht = new FrameHandleTest();
		wht.frameHandle();
	}

}
