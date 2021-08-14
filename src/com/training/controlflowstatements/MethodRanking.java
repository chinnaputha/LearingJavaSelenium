/**
 * Author K S S DURGA PRASAD
 */


package com.training.controlflowstatements;

public class MethodRanking {
	
	public static void methodRankPoints(double points) {
		if (points >= 202.5) {
			System.out.println("Rank:A1");
		} else if (points >= 122.4) {
			System.out.println("Rank:A2");
		} else {
			System.out.println("Rank:A3");
		}
	}


	public static void main(String[] args) {
		methodRankPoints(225.22);

	}

}
