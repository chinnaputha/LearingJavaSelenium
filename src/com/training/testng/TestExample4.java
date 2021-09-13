package com.training.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExample4 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void method1() {
		System.out.println("Method1");
	}

	
	@Test
	public void method2() {
		System.out.println("Method2");
	}

	@Test
	public void method3() {
		System.out.println("Method3");
	}
	
	
	@BeforeMethod
	public void startMethodBefore() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void startMethodAfter() {
		System.out.println("After Method");
	}
}
