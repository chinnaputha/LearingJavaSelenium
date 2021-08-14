package com.training.strings;

public class StringExample3 {

	public static void main(String[] args) {
		String str1="is web selenium automation tool";
		System.out.println(str1.startsWith("selenium"));//true
		System.out.println(str1.endsWith("tool"));//true
		System.out.println(str1.contains("selenium"));//true
		
		String s="Java is programming language";
		System.out.println("String substring-->"+s.substring(8));
		System.out.println("String substring-->"+s.substring(8,14));
		
		String s2="    Java is programming language    ";
		System.out.println(s2.trim());
		
		String s3="I Love my india";
		String spRev[] = s3.split(" ");
		
		for(int i=spRev.length-1;i>=0;i--) {
			System.out.println(spRev[i]);
		}

	}
}
