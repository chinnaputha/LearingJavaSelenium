package com.training.oops;

public class Employee {

	private String empName="Mathew";
	private int empId=355;
	private float empSalary=789.8f;
	private String empAddress="kerala";

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public static void main(String[] args) {
		Employee ee = new Employee();
		ee.setEmpName("HelloTet");
		ee.setEmpId(123);
		ee.setEmpSalary(111.23f);
		ee.setEmpAddress("Hyderabad");

		System.out.println("emp name-->" + ee.getEmpName() + "emp id-->" + ee.getEmpId() + "emp salary-->"
				+ ee.getEmpId() + "emp addrass-->" + ee.getEmpAddress());
	}

}
