package com.training.exception;

import java.util.Scanner;

public class ExceptionExample3 {

	public static void main(String[] args) {
		String a,b;
		String s1="10";
		String s2="20.125";
				
		int ans=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		try {
			a= s.next();
			b= s.next();
			ans = Integer.parseInt(a)/Integer.parseInt(b);
		} catch (NumberFormatException e) {
			System.out.println("Enter only numbers");
			e.printStackTrace();
		}catch (ArithmeticException ae) {
			System.out.println("Denominator should not be zero");
			ae.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
