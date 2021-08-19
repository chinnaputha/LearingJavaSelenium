package com.training.oops;

public class Bank {
	private String username="chinna.putha@gmail.com";
	private String password="Test@123";
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public static void main(String[] args) {
		
		Bank b= new Bank();
		System.out.println("username-->"+b.username);
		System.out.println("password-->"+b.password);
		System.out.println(b.getUsername());
		System.out.println(b.getPassword());
	}
	
	

}
