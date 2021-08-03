package com.training.operators;

public class ArithmeticTest {

	public void arithmeticOperations() {
		int a = 8, b = 4;
		System.out.println("a+b---->" + (a + b));// 12
		System.out.println("a-b---->" + (a - b));// 4
		System.out.println("a*b---->" + (a * b));// 32
		System.out.println("a/b---->" + (a / b));// 2
		System.out.println("a%b---->" + (a / b));// 0
	}

	public static void main(String[] args) {
		ArithmeticTest at = new ArithmeticTest();
		at.arithmeticOperations();

	}

}
