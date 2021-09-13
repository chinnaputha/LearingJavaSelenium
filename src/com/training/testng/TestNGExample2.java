package com.training.testng;

import org.testng.annotations.Test;

public class TestNGExample2 {

	@Test(priority = 0)
	public void login() {
		System.out.println("TestNGExample.login()");
		int c= 10/0;// will get arithmetic exception
	}

	@Test(priority = 1)
	public void composeEmail() {
		System.out.println("TestNGExample.composeEmail()");
	}

	@Test(priority = 2)
	public void logoutApp() {
		System.out.println("TestNGExample.logoutApp()");
	}

}
