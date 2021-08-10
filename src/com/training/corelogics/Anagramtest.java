package com.training.corelogics;
import java.util.Arrays;
/**
 * Class to perform a anagram test program
 * @author VEERA SAKE
 *
 */
public class Anagramtest {
	public void anagramOperation() {
	}

	public static void main(String[] args) {
String s1="java";
String s2="vaja";

s1 = s1.replace(" "," ");
s2 = s2.replace(" "," ");



s1 = s1.toLowerCase();
s2 = s2.toLowerCase();

char a[] = s1.toCharArray();
char b[] = s2.toCharArray();

Arrays.sort(a);
Arrays.sort(b);

boolean result =Arrays.equals(a,b);

if(result == true)
{
	System.out.println("strings are anagram");
}
else
{
	System.out.println("strings are not anagram");
}
	}

}
