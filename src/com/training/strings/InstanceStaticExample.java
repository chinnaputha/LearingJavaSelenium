package com.training.strings;

public class InstanceStaticExample {
	
	int a=10; //instance variable or non-static variable
	static String companyName="Microsoft";	//static  variable	
	
	//nonstatic method or instance method
	public  void method1() {
		int a=20;//local variable
		System.out.println("a value-->"+a);
	}
	
	public static void method2() {
		System.out.println("comapnayName"+companyName);
	}

	public static void main(String[] args) {
		InstanceStaticExample ise= new InstanceStaticExample();
		System.out.println("instance varible value-->"+ise.a);
		ise.method1();
		
		//calling static variable or static method
		System.out.println("static variable value-->"+InstanceStaticExample.companyName);
		InstanceStaticExample.method2();
		
	}

}
