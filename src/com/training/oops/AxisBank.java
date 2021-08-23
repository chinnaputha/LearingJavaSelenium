package com.training.oops;

public class AxisBank implements Interest{

	@Override
	public void bankInterest(int priniple, int time) {
		double inte = (priniple*time*15)/100;
		System.out.println("Rate of Interest Axis Bank-->"+inte);
	}

}
