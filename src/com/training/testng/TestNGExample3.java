package com.training.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = "Smoke")
public class TestNGExample3 {
	
	@BeforeSuite
	public void beforeSuiteTe() {
		System.out.println("Before Suite Annotation");
	}
	
	@BeforeTest
	public void beforeTestingAn() {
		System.out.println("Before Test Annotation");
	}
	
	

	@Test
	public void login() {
		System.out.println("TestNGExample.login()");
	}

	@Test
	public void composeEmail() {
		System.out.println("TestNGExample.composeEmail()");
	}

	@Test(enabled = false)
	public void logoutApp() {
		System.out.println("TestNGExample.logoutApp()");
	}
	
	@AfterSuite
	public void afterSuiteTe() {
		System.out.println("After Suite Annotation");
	}

}
