package com.training.exception;

public class ExceptionExample5 {

	public static void main(String[] args) throws Exception {
		int a = 10, b = 0;
		int arr[] = { 1, 2, 3, 4 };

		int c;
		try {
			c = arr[5] / b;
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Dont enter zero as Denominator");
		} catch (ArrayIndexOutOfBoundsException aie) {
			throw new ArrayIndexOutOfBoundsException("Array size reached morethan the limit");
		}
		System.out.println("c value-->" + c);
		System.out.println("ExceptionExample.main()");

		System.out.println("Denominator should not be zero");
	}

}
