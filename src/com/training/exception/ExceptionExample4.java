package com.training.exception;

import java.io.FileNotFoundException;

public class ExceptionExample4{

	public void method1()      {
		
			try {
				method2();
				Thread.sleep(4000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	public void method2() throws FileNotFoundException {
		int a=10,b=10;
		
		int c= a/b;
		if(c==1) {
			throw new ArithmeticException("HelloException");
		}
	}
}
