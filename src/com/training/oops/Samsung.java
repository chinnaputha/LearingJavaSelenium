package com.training.oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samsung implements Mobile{

	@Override
	public void calling() {
		System.out.println("Samsung calling feature");
	}
	
	
	public void camera() {
		System.out.println("Samsung Camera");
	}
	
	public void takeScreenshot() {
		System.out.println("taking screenshot");
	}

	
	public static void main(String[] args) {
		Samsung s = new Samsung(); // Samsung s --> child class reference
		s.calling();
		s.camera();
		s.takeScreenshot();
		
		
		Mobile m = new Samsung(); // Mobile m --> parent class reference
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new WebDriver();
		
		WebDriver driver = new ChromeDriver();
		
		//Mobile interface
		//Samusung is a implmentation class of Mobile
		//Mobile --  1 method, Samusung- 1 method + extra methods,
		m.calling();
		
		
	
		
	}
}
