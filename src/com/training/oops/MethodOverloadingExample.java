package com.training.oops;

/**
 * 
 * @author Chinna.Putha
 *
 */

//Code format shortcut --> Ctrl+Shift+F
public class MethodOverloadingExample {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("C value-->" + c);
	}

	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("d value-->" + d);
	}

	public double add(double d1, double d2) {
		return d1 + d2;
	}

	
	public double add(double d1) {
		return d1;
	}
	
	public float add(float f1, float f2) {
		return f1 + f2;
	}

	public String add(String str) {
		return "Hello";
	}

	public static void main(String[] args) {
		MethodOverloadingExample mle = new MethodOverloadingExample();
		mle.add(10, 20);
		mle.add(10, 20, 30);
		double value = mle.add(1.25d, 1.589d);
		System.out.println("Double value-->" + value);

		double dd= mle.add(value);
		System.out.println("dd value-->"+dd);
		
		
		float f = mle.add(12.25f, 10.24f);
		System.out.println(" float value-->" + f);

		String st = mle.add("selenium");
		System.out.println("String value-->" + st);
	}

}
