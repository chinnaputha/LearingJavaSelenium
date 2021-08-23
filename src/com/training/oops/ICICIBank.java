package com.training.oops;

public class ICICIBank implements Interest{

	@Override
	public void bankInterest(int priniple, int time) {
		double inte= (priniple*time*12)/100;
		System.out.println("Rate of Interest ICICI Bank-->"+inte);
	}

}
