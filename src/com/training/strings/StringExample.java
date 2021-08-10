package com.training.strings;

public class StringExample {

	public static void main(String[] args) {
		
		String str ="java programming";//String literal -- String constant pool
		String str2 ="java programming";
		String str6 ="java programming";
		
		String str3 = new String("test");//by using new operator -- Heap memory 
		String str4 = new String("test");//by using new operator -- Heap memory 
		
		
		System.out.println(str.length());
		System.out.println(str2.toUpperCase());
		
		

	}

}
