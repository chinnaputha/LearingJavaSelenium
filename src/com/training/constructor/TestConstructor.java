package com.training.constructor;

public class TestConstructor {
	
	//Default constuctor
	 public TestConstructor(){
		System.out.println("I am in Default constuctor");
	}
	
	//parameterized consructor
	TestConstructor(int a){
		System.out.println("parameterized consructor "+a);
	}

	public void sampleTest() {
		System.out.println("i am in method1");
	}
	 
	
	public static void main(String[] args) {
		TestConstructor tt = new TestConstructor();
		
		
	}

}
