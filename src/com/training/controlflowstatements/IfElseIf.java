package com.training.controlflowstatements;

public class IfElseIf {

	public void marksStatus(int marks) {
		// >=60 -- First class
		// >=50 and <60 -- second class
		// >=35 and <50 -- Third class
		// fail

		if (marks >= 60) {
			System.out.println("FIRST CLASS");//Ctrl+shift+X -- upper case //Ctrl+shift+Y -- lowercase
		} else if (marks >= 50 && marks < 60) {
			System.out.println("SECOND CLASS");
		} else if (marks >= 35 && marks < 50) {
			System.out.println("THRID CLASS");
		} else {
			System.out.println("FAIL");
		}
	}

	public static void main(String[] args) {
		IfElseIf iei = new IfElseIf();
		iei.marksStatus(69);
		iei.marksStatus(55);
		iei.marksStatus(38);
		iei.marksStatus(10);
	}

}
