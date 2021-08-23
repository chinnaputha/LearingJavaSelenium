package com.training.oops;

public class MethodOverridingExample {
	
	public static void main(String[] args) {
		SBIBank sb= new SBIBank();
		sb.bankInterest(100000, 12);
		
		AxisBank ab = new AxisBank();
		ab.bankInterest(100000, 12);
		
		ICICIBank ib = new ICICIBank();
		ib.bankInterest(100000, 12);
		
		
		MethodOvrirdingEx2  me2 = new MethodOvrirdingEx2();
		me2.sayHi();
		
		
	
	}

}
