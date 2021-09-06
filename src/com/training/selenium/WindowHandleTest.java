package com.training.selenium;

import java.util.Set;

import org.openqa.selenium.By;

public class WindowHandleTest extends TestBase {

	public void windowHanle() throws InterruptedException {
		openApplication("http://demo.automationtesting.in/Windows.html");
		Thread.sleep(4000);
		
		
		String parent_window = driver.getWindowHandle(); //abc123
		System.out.println("Parent window---->"+parent_window); //
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("total windows opened --->"+allWindows.size());//2
		//1-- abc123
		//2--- abc124
		
		for(String childWindow:allWindows) {
			System.out.println("window id-->"+childWindow);
			if(!childWindow.equals(parent_window)) {
				driver.switchTo().window(childWindow);//switch to child window
				driver.findElement(By.xpath("//a[@href='/support']")).click();
				Thread.sleep(4000);
				driver.close();//child window close
			}
			
		}
		
		driver.switchTo().window(parent_window);//switch back to  parent window
		driver.findElement(By.linkText("Open New Tabbed Windows")).click();
		Thread.sleep(4000);
		driver.close();//parent window close
		

	}

	public static void main(String[] args) throws InterruptedException {
		WindowHandleTest wht = new WindowHandleTest();
		wht.windowHanle();
	}

}
