package com.training.testng;

import org.testng.annotations.Test;

public class TestNGExample3 {

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

}
