package com.training.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		//String Buffer is mutable-- content can be changed
		//Strings are Immutable
		
		
		StringBuffer sb= new StringBuffer("Hello");
		sb.append("Test");
		
		
		System.out.println(sb);

	}

}
