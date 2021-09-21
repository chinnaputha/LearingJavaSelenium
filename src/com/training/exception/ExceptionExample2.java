package com.training.exception;

public class ExceptionExample2 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int arr[] = { 1, 2, 3, 4 };

		try {
			int c = arr[5] / b;
			System.out.println("c value-->" + c);
			System.out.println("ExceptionExample.main()");
		} catch (ArithmeticException ae) {
			System.out.println("Demoninatory should not be zero");
			ae.printStackTrace();
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aib) {
			System.out.println("array size reached morethan limit");
			aib.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Denominator should not be zero");
	}

}
