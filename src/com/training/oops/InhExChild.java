package com.training.oops;

public class InhExChild implements InterfaceExample{

	@Override
	public void sayHello() {
		System.out.println("i said HI");
	}

	@Override
	public int add(int a, int b) {
		a=10;
		b=20;
		int c=a+b;
		return c;
	}

	@Override
	public void housePlan() {
		System.out.println("no of bricks");
		System.out.println("2BHK");
		
	}

}
