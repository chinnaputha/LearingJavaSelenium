package com.training.testng;

import org.testng.annotations.Test;

@Test(groups = {"Smoke","Regression"})
public class TestNGExample {

	@Test(alwaysRun = true)
	public void login() {
		System.out.println("TestNGExample.login()");
		int c= 10/0;// will get arithmetic exception
	}

	@Test(dependsOnMethods = "login")
	public void composeEmail() {
		System.out.println("TestNGExample.composeEmail()");
	}

	@Test(dependsOnMethods = "composeEmail")
	public void logoutApp() {
		System.out.println("TestNGExample.logoutApp()");
	}

}
