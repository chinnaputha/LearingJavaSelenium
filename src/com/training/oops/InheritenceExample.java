package com.training.oops;

public class InheritenceExample implements Printable{

	@Override
	public void print() {
		System.out.println("printing........");
		
	}
	
	public static void main(String[] args) {
		InheritenceExample ie = new InheritenceExample();
		ie.print();
	}

	
	

	
}
