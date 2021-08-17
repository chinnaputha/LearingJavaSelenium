package com.training.strings;

public class StringComparisionExample {

	public static void main(String[] args) { 
		//Strings are immutable that means whose content can’t be changed.
		//Once string object is created its content can’t be changed but new object is created.

		String s = "Java";//String literal -- String constant pool
		System.out.println("s value -->"+s);
		//s= s.concat("Selenium");// concat() method appends the string at the end
		//System.out.println("s value-->"+s);// will print java because strings are immutable objects
		
		 
		s=s.replace("Java", "Selenium1"); 
		System.out.println(s);
	}

}
