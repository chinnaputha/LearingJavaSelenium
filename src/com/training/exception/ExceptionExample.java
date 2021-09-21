package com.training.exception;

public class ExceptionExample {
	
	public static void main(String[] args) {
		int a=10, b=0;
		try {
			int c=a/b;
			System.out.println("c value-->"+c);
			System.out.println("ExceptionExample.main()");
		} catch (Exception e) {
			System.out.println("Denominator should be not zero ............");
			e.printStackTrace();
		} finally {
			System.out.println("it will be execute compulsory");
		}
		System.out.println("Denominator should not be zero");
	}

}
