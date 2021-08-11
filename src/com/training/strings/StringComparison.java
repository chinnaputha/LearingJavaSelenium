package com.training.strings;

import com.training.controlflowstatements.IfElseIf;

/**
 * 
 * @author Chinna.Putha
 *
 */

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "Hello"; // String literal
		String s2 = "HellO";// String literal
		String s3 = s1;// String literal

		String s4 = new String("Hello");// String object -- memory addres -123
		String s5 = new String("Hello");// String object -- memory addres -124

		// == checking memory location/address
		// equals() check only content/value

		System.out.println(" s1 == s2 " + (s1 == s2));// true
		System.out.println(" s1 == s3 " + (s1 == s3));// true
		System.out.println(" s2 equlas s3 " + (s2.equals(s3)));// true

		System.out.println(" s1==s4 " + (s1 == s4));// false
		System.out.println(" s1 equals s4 " + s1.equals(s4));// true

		System.out.println(" s4 == s5 " + (s4 == s5));// false

		System.out.println(" s4 equlas s5 " + (s4.equals(s5)));// true

	}

}
