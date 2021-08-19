package com.training.oops;

public class BankExample {

	public static void main(String[] args) {
		Bank b= new Bank();
		b.setUsername("ashok.t@gmail.com");
		b.setPassword("Hello@123");
		
		System.out.println("username-->"+b.getUsername());//
		System.out.println("password-->"+b.getPassword());//
		
		
		b.setUsername("ttaaccc@gmail.com");
		b.setPassword("afasdfasdf@123");
		
		System.out.println("username-->"+b.getUsername());//
		System.out.println("password-->"+b.getPassword());//

	}

}
