package com.training.corelogics;
/**
 * 
 */

import java.util.Scanner;

public class NextCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			ch++;
			System.out.println(ch);
		}

		
		
	}

}

