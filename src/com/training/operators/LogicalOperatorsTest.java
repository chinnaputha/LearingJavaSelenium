package com.training.operators;

public class LogicalOperatorsTest {

	public static void main(String[] args) {
		int a=8, b=4, c=-10;
		System.out.println("(a<b) && (b>c) ----->"+((a<b) && (b>c))); // False && true ---> false
		System.out.println("(b!=c) || (a==b) ----->"+((b!=c) || (a==b))); // true || false ---> true
		System.out.println("!(b<=-a) -->"+!(b<=-a)); //true

	}

}
