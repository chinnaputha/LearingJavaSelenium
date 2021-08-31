package com.training.oops;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		//Array - fixed size
		       //- allow only created data type
		
		int arr[]= {1,2,3,4,5};
		
		List al = new ArrayList();
		//List interface
		//Arraylist is a implmentation class of List
		//List -- 100 methods abstract mehtods, Arraylist- 100 methods(overrident methods)+ extra methods,
		System.out.println("arraylist size-->"+al.size());
		al.add(10);
		al.add("Hello");
		al.add(15.25f);
		al.add(true);
		al.add('c');
		System.out.println("arraylist size-->"+al.size());
		System.out.println("array list elements-->"+al);
		
		
		System.out.println("get list 2nd value-->"+al.get(2));//
		
		
		
		List<String> al2 = new ArrayList<String>();
		

		
		al2.add("java");
		al2.add("selenium");
		
		List<Integer> al3 = new ArrayList<Integer>();
		al3.add(10);
		
		ArrayList<Integer> al4 = new ArrayList<Integer>();
	
		
		
		
		
		
		
		
		

	}

}
