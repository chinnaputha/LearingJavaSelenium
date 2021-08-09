package com.training.operators;
/**
 * Class to perform unary operators program
 * @author Chinna.Putha
 *
 */
public class UnaryOperatorsTest {
	
	public static void main(String[] args) {
		int age=18;
		System.out.println("pre increment -->"+ (++age));
		System.out.println("post increment -->"+ (age++));
		System.out.println(age);//20
		
		System.out.println("pre decremetn-->"+(--age));//19
		System.out.println("post decrement-->"+(age--));//19
		System.out.println("Current age-->"+age);//18
		
	}

}
