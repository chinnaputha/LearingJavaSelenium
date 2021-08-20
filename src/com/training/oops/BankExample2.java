package com.training.oops;

public class BankExample2 {

	public static void main(String[] args) {
		Bank b= new Bank();
		b.setUsername("mathues.hedge@yahoo.com");
		b.setPassword("Mathews@123");
		
		System.out.println("username-->"+b.getUsername());//
		System.out.println("password-->"+b.getPassword());//
		
		Employee ee = new Employee();
		ee.setEmpName("Andrews");//set method -- assign/set the value
		ee.setEmpId(456);
		ee.setEmpSalary(151.23f);
		ee.setEmpAddress("chennai");
		
		System.out.println("emp name-->" + ee.getEmpName() + " emp id-->" + ee.getEmpId() + " emp salary-->"
				+ ee.getEmpSalary() + " emp addrass-->" + ee.getEmpAddress());

	}

}
