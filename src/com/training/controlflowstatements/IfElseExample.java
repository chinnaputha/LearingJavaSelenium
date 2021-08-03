package com.training.controlflowstatements;
/**
 * Class for if else example
 * @author Chinna.Putha
 *
 */
public class IfElseExample {
	//to check how many methods in a class -- Ctrl+O
	public void oddOrEven(int number) {
		if(number%2 == 0) { // 0 == 0
			System.out.println("Given number is Even "+ number);
		} else {
			System.out.println("Given number is odd " + number);
		}
	}

	public static void main(String[] args) {
		IfElseExample iee = new IfElseExample();
		iee.oddOrEven(9);
		iee.oddOrEven(11);
		iee.oddOrEven(44);
		iee.oddOrEven(24);
		
	}

}
