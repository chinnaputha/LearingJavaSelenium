package com.training.corelogics;
/**
 * Class to perform Swap two numbers using temporary variable
 * @author Sukumar
 *
 */
public class SwapNumbers {
	
 public void swapnumbersusingtemporaryvariable () {
        float first = 10,  second = 20;
		
		System.out.println("--Before swap--");
		System.out.println("first number = " + first);
		System.out.println("second number = " + second);
		
		// Value of first is assigned to temporary	
		float temporary = first;
		
		// Value of second is assigned to first
        first = second;
        
        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;
        
        System.out.println("--After swap-- ");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
	}
	
 /**
  * Class to perform Swap two numbers without using temporary variable
  */

	public void swapnumberswithoutusingtemporaryvariables ()	{
    	float first = 10,  second = 20;
 		
 		System.out.println("--Before swap1--");
 		System.out.println("first number = " + first);
 		System.out.println("second number = " + second);
 		 
 		first = first - second;
 		second = first + second;
 		first = second - first;
 		
 		System.out.println("--after swap1--");
 		System.out.println("first number = " + first);
 		System.out.println("second number = " + second);
 		
 	}

	public  static void main(String[] args) {

		SwapNumbers obj =new SwapNumbers ();
		obj.swapnumbersusingtemporaryvariable();
		obj.swapnumberswithoutusingtemporaryvariables();
		
	}

}
