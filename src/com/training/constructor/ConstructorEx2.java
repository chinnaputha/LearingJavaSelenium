package com.training.constructor;

public class ConstructorEx2 {
	
	int a, b;//variables
	
	public ConstructorEx2(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("sum of two variable-->"+(this.a+this.b));
		
	}

	public static void main(String[] args) {
		ConstructorEx2 ce= new ConstructorEx2(10, 20);
		

	}

}
