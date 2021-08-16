package com.training.arrays;

/**
 * Class to perform Array example
 * @author Chinna.Putha 
 *
 */
public class ArrayExample { 
	 
	public static void arrayEx() { 
		int []arr= {85,10,20,30,40,50,60,70};
		System.out.println("Array size--->"+arr.length);
		System.out.println("value using array index postion-->"+arr[6]);//50
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" Index position value  "+arr[i]);
		}
	}
	
	public static void arrayEx2() {
		int[] values=new int[5];
		values[0]=77;
		values[1]=87;
		values[2]=97;
		System.out.println(values.length);
		
		for(int i=0;i<values.length;i++) {
			System.out.println(i+" Index position value  "+values[i]);
		}
	}
	
	public static void stringArrayEx() {
		String cities[]= {"Banglore","Hyd","Cochin","Chennai"};
		for(int i=0;i<cities.length;i++) {
			System.out.println(i+" Index position value  "+cities[i]);
		}
		
	}

	public static void main(String[] args) {
		//ArrayExample.arrayEx();
		arrayEx2();
		stringArrayEx();
	}

}
