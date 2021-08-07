package com.training.corelogics;

/**
 * Class to find Factorial of a given number
 * @author ACER
 *
 */
public class Factorial {

	public static void main(String[] args) {

		int i;
		int fact = 1;
		int number = 6;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);//o/p is : 120
	}

}
