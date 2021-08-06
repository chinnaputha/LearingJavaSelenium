package com.training.operators;
/**
 * Class to perform assignment operators program
 * @author Chinna.Putha
 *
 */
public class AssignmentOperatorsTest {

	public void assignmentOperators() {
		int a = 8, b = 4;
		System.out.println("a+=b or a= a+b--->" + (a += b));// a=12
		System.out.println("a-=b or a= a-b--->" + (a -= 3));// a=9
		System.out.println("a*=b or a= a*b--->" + (a *= 7));// a=63
		System.out.println("a/=b or a= a/b--->" + (a /= b));// a=15
		System.out.println("a%=b or a= a%b--->" + (a %= 5));// a=0
	}

	public static void main(String[] args) {
		AssignmentOperatorsTest aot = new AssignmentOperatorsTest();
		aot.assignmentOperators();
		
		
		
	}

}
