package com.training.oops;

public class SBIBank implements Interest{

	@Override
	public void bankInterest(int priniple, int time) {
		double roi= (priniple*time*13)/100;
		System.out.println("Rate of Interest SBI Bank-->"+roi);
		
	}
}
