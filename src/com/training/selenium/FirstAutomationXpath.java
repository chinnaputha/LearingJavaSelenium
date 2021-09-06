package com.training.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Class to identify locators using xpath
 * @author Chinna.Putha
 *
 */
public class FirstAutomationXpath {

	static boolean isRadioSelected;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	    //WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();// to launch chrome browser
		driver.get("http://demo.automationtesting.in/Register.html");// hit application URL
		driver.manage().window().maximize();// maximize the window
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("MyFirstName");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("MyLastName");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("1/33 Banglore karantaka");
		Thread.sleep(2000);
		isRadioSelected = driver.findElement(By.xpath("//input[@value='Male']")).isSelected();
		System.out.println("is radio button selected-->"+isRadioSelected);
		//false -- radio click
		//true--  dont click radio button
		
		if(!isRadioSelected) {
			System.out.println("radio button clicked");
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		}

		isRadioSelected = driver.findElement(By.xpath("//input[@value='Male']")).isSelected();
		System.out.println("is radio button selected !!!!!!-->"+isRadioSelected);
		
		if(!isRadioSelected) {
			System.out.println("radio button clicked !!!!!!!!!!");
			driver.findElement(By.xpath("input[value='Male']")).click();
		}
		//how to find total radio buttons in a web page
		List<WebElement> totalRadioButtons=  driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("total radio buttons--->"+totalRadioButtons.size());
		
		List<WebElement> totalCheckboxes=  driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("list size--->"+totalCheckboxes.size());//3
		
		
//		totalCheckboxes.get(0).click();
//		Thread.sleep(2000);
//		totalCheckboxes.get(1).click();
//		Thread.sleep(2000);
//		totalCheckboxes.get(2).click();
		
		for(int i=0;i<totalCheckboxes.size();i++) {
			boolean isCheckSelected = totalCheckboxes.get(i).isSelected();
			System.out.println("is checkbox checked-->"+isCheckSelected);
			if(!isCheckSelected) {
				totalCheckboxes.get(i).click();
			}
			
		}
		
		
		List<WebElement> totalLinks=  driver.findElements(By.tagName("a"));
		System.out.println("total links in a webpage--->"+totalLinks.size());
		
		totalLinks.get(79).click(); 
		
		
		List<WebElement> totalFrames=  driver.findElements(By.tagName("iframe"));
		System.out.println("total iframes in a webpage--->"+totalFrames.size());
		
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
