package com.training.constructor;

public class ConstructorEx {
	
	int a, b,c;

	
	ConstructorEx(int s1,int s2){
		a=s1;
		b=s2;
		System.out.println("Sum of two values-->"+(a+b));
	}
	
	ConstructorEx(int s1,int s2,int s3){
		a=s1;
		b=s2;
		c=s3;
		System.out.println("Sum of three values-->"+(a+b+c));
	}
	
	public static void main(String[] args) {
		ConstructorEx ce = new ConstructorEx(10, 20);
		ConstructorEx ce2 = new ConstructorEx(10, 20,30);

	}

}
