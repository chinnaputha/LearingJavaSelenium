package com.training.oops;

public class BankExample2 {

	public static void main(String[] args) {
		Bank b= new Bank();
		b.setUsername("mathues.hedge@yahoo.com");
		b.setPassword("Mathews@123");
		
		System.out.println("username-->"+b.getUsername());//
		System.out.println("password-->"+b.getPassword());//

	}

}
