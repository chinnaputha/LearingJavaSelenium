package com.training.selenium;
/**
 * @author shiva raja sekhara reddy
 */

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdownsorted {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Select sc=new Select(driver.findElement(By.id("Skills")));
		List<WebElement> options=sc.getOptions();
		List values=new ArrayList();
		for(WebElement opt:options) {
			values.add(opt.getText());
		}
		System.out.println("original list"+values);

		List TemList=new ArrayList(values);
		System.out.println(TemList);
	if(values.equals(TemList)) {
		System.out.println("dropdown is sorted");
	}
	else {
		System.out.println("drop down is sorted");
	}
		
	}

}
