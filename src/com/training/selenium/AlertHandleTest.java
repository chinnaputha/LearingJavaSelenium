package com.training.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandleTest extends TestBase {

	String str="Java Selenium";
	
	public void alertHandle() throws InterruptedException {
		openApplication("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		
		//switch to alert
		Alert al = driver.switchTo().alert();
		String alText = al.getText();//get alert text
		System.out.println("Alert Text-->"+alText);
		Thread.sleep(4000);
		//al.dismiss(); //close the alert
		al.sendKeys(str);
		Thread.sleep(2000);
		al.accept();
		Thread.sleep(2000);
		
		//WebElement alValue = driver.findElement(By.cssSelector("p#demo1"));
		//String enteredText = alValue.getText();
		String enteredText= driver.findElement(By.cssSelector("p#demo1")).getText();
		System.out.println("Total Text-->"+enteredText);
		
		if(enteredText.contains(str)) {
			System.out.println("Enterd text is available");
		} else {
			System.out.println("Enterd text is not available");
		}
		
		
		
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		AlertHandleTest aht = new AlertHandleTest();
		aht.alertHandle();
	}

}
