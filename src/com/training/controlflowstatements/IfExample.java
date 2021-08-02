package com.training.controlflowstatements;

/**
 * Class to perform if programs
 * 
 * @author Chinna.Putha
 *
 */
public class IfExample {

	public void voteEligible() {
		int age = 50;
		if (age >= 18) { // (20>18)
			System.out.println("Eligigle for vote");
		}
	}

	public void voteEligible(int ageNumber) {
		System.out.println("Age number -->" + ageNumber);
		if (ageNumber >= 18) { // (20>18)
			System.out.println("Eligigle for vote");
		}else {
			System.out.println("Not eligible for vote");
		}
	}

	public static void main(String[] args) {
		IfExample ie = new IfExample();// object of class
		ie.voteEligible();
		ie.voteEligible(50);
		ie.voteEligible(10);
	}

}
