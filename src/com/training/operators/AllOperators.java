package com.training.operators;

/**
 * Class to perform programs of Arithmetic, logical, assignment, ternary
 * operators
 * 
 * @author Chinna.Putha
 *
 */
public class AllOperators {

	/**
	 * Method to perform arithmetic operations
	 */
	public void arithmeticOperations() {
		System.out.println("******Arithmetic Operators************");
		int a = 8, b = 4;
		System.out.println("a+b---->" + (a + b));// 12
		System.out.println("a-b---->" + (a - b));// 4
		System.out.println("a*b---->" + (a * b));// 32
		System.out.println("a/b---->" + (a / b));// 2
		System.out.println("a%b---->" + (a / b));// 0
		
	}

	/**
	 * Method to perform logical operations programs
	 */
	public void logicalOperators() {
		System.out.println("******Logical Operators************");
		int a = 8, b = 4, c = -10;
		System.out.println("(a<b) && (b>c) ----->" + ((a < b) && (b > c))); // False && true ---> false
		System.out.println("(b!=c) || (a==b) ----->" + ((b != c) || (a == b))); // true || false ---> true
		System.out.println("!(b<=-a) -->" + !(b <= -a)); // true
	}

	/**
	 * Method to perform relational operators
	 * 
	 * @param a
	 * @param b
	 */
	public void relationalOperators(int a, int b) {
		System.out.println("******Relational Operators************");
		System.out.println(" a value -->" + a);
		System.out.println(" b value -->" + b);
		System.out.println("a<b ---->" + (a < b)); // false
		System.out.println("a<=b ---->" + (a <= b));// false
		System.out.println("a>b ---->" + (a > b)); // true
		System.out.println("a>=b ---->" + (a >= b));// true
		System.out.println("a==b ---->" + (a == b));// false
		System.out.println("a!=(-4) ---->" + (a != (-4)));// true
	}

	/**
	 * Method to perform assingnment operator program
	 */
	public void assignmentOperators() {
		System.out.println("******Assignment Operators************");
		int a = 8, b = 4;
		System.out.println("a+=b or a= a+b--->" + (a += b));// a=12
		System.out.println("a-=b or a= a-b--->" + (a -= 3));// a=9
		System.out.println("a*=b or a= a*b--->" + (a *= 7));// a=63
		System.out.println("a/=b or a= a/b--->" + (a /= b));// a=15
		System.out.println("a%=b or a= a%b--->" + (a %= 5));// a=0
	}
	/**
	 * Method to perform ternary operators
	 */
	public void ternaryOperators() {
		System.out.println("******Ternary Operators************");
		int a,b;
		a=10;
		
		//ternary operator 
		b=(a==1)?20:30;
		System.out.println("b value-->"+b);//30
		
		b=(a==10)?20:30;
		System.out.println("b value-->"+b);//20
	}

	/**
	 * Method to perform unary operators
	 */
	public void unaryOperators() {
		System.out.println("******Unary Operators************");
		int age=18;
		System.out.println("pre increment -->"+ (++age));
		System.out.println("post increment -->"+ (age++));
		System.out.println(age);//20
		
		System.out.println("pre decremetn-->"+(--age));//19
		System.out.println("post decrement-->"+(age--));//19
		System.out.println("Current age-->"+age);//18
	}
	
	public static void main(String[] args) {
		AllOperators ao=new AllOperators();
		ao.arithmeticOperations();
		ao.assignmentOperators();
		ao.relationalOperators(10, 20);
		ao.logicalOperators();
		ao.ternaryOperators();
		ao.unaryOperators();
	}

}
