package com.training.operators;

/**
 * Class to perform relational operators
 * 
 * @author Chinna.Putha
 *
 */
public class RelationalOperatorsTest {

	//Zero parameter method
	public void relationalOperators() {
		int a = 8, b = 4;

		System.out.println("a<b ---->" + (a < b)); // false
		System.out.println("a<=b ---->" + (a <= b));// false
		System.out.println("a>b ---->" + (a > b)); // true
		System.out.println("a>=b ---->" + (a >= b));// true
		System.out.println("a==b ---->" + (a == b));// false
		System.out.println("a!=(-4) ---->" + (a != (-4)));// true
	}
	//2 parameters method
	public void relationalOperators(int a,int b) {
		System.out.println(" a value -->"+a);
		System.out.println(" b value -->"+b);
		System.out.println("a<b ---->" + (a < b)); // false
		System.out.println("a<=b ---->" + (a <= b));// false
		System.out.println("a>b ---->" + (a > b)); // true
		System.out.println("a>=b ---->" + (a >= b));// true
		System.out.println("a==b ---->" + (a == b));// false
		System.out.println("a!=(-4) ---->" + (a != (-4)));// true
	}

	public static void main(String[] args) {
		RelationalOperatorsTest rot = new RelationalOperatorsTest();
		rot.relationalOperators();
		rot.relationalOperators(55, 78);
		rot.relationalOperators(7, 3);
	}

}
