package com.training.operators;

public class TernaryOperatorTest {

	public static void main(String[] args) {
		int a,b;
		a=10;
		
		//ternary operator 
		b=(a==1)?20:30;
		System.out.println("b value-->"+b);//30
		
		b=(a==10)?20:30;
		System.out.println("b value-->"+b);//20
		
	}

}
