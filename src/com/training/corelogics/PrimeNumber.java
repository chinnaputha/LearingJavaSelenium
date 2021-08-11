package com.training.corelogics;

/**
 * class to perform given number is prime or not
 * @author Siva
 *
 */
public class PrimeNumber
{
	
	public void prime(int num)
	{
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i)
	    	
	    {
	      // condition for nonprime number
	      if (num % i == 0) 
	      {
	        flag =  true;
	        break;
	      }
	    }
	    if (!flag)
            System.out.println(num + " is a prime number.");
          else
            System.out.println(num + " is not a prime number.");
	   }
	
	public static void main(String[] args) 
	{
		PrimeNumber pn = new PrimeNumber();
		pn.prime(10);
		pn.prime(5);
		pn.prime(1000);
	}
	
}