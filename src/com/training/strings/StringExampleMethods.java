package com.training.strings;

public class StringExampleMethods {
	
	//static method
	public static void stringReverse(String str) {
		String rev_string ="";
		int lengthOfStr=str.length();
		for(int i=str.length()-1;i>=0;i--) {
			//System.out.println(str.charAt(i));
			//rev_string = rev_string+str.charAt(i);
			rev_string +=str.charAt(i);
		}
		System.out.println("reverse string-->"+rev_string);
		
		if(str.equals(rev_string)) {
			System.out.println("Given string is palindrome "+str);
		}else {
			System.out.println("given string is not a palindrome "+str);
		}
	}
	
	public static void reverseWithBuiltMethod() {
		StringBuffer sb= new StringBuffer("javaselenium");
		System.out.println("reverse of string-->"+sb.reverse());
	}
	
	
	public static void main(String[] args) {
		/*
		 * String str="javaselenium"; String str2="Testing";
		 * System.out.println("length of given string-->"+str.length());//8
		 * System.out.println("char at of given string-->"+str.charAt(4));//s
		 * System.out.println("Upper cases-->"+str.toUpperCase());
		 * System.out.println("lower case-->"+str.toLowerCase());
		 * System.out.println("String concat-->"+str.concat(str2));
		 */
		
		
		StringExampleMethods.stringReverse("icici");//static methods directly we can call using Classname.method name
		StringExampleMethods.stringReverse("Test");
		
		
		StringExampleMethods.reverseWithBuiltMethod();
	
	}
	
	

}
