package basics.programs;

import java.util.Arrays;

public class Anagram_String_Program 
{

	public static void main(String[] args) 
	{
		String a1 = "inch";
		String a2 = "chin";
		
		if(a1.length() != a2.length())
		{
			System.out.println("The two strings are not anagram");
		}
		else
		{
			System.out.println("Eligible to become an anagram but need to see........");
			
			char    b1[]   =   a1.toCharArray();
			char    b2[]   =   a2.toCharArray();
			
			Arrays.sort(b1);
			Arrays.sort(b2);
			
			System.out.println(Arrays.toString(b1));
			System.out.println(Arrays.toString(b2));
			
		boolean finalanswer = Arrays.equals(b1, b2);
		
		if (finalanswer == true )
		{
			System.out.println("The given strings are anagram to each other");
		}
		else
		{
			System.out.println("The given strings are not anagram to each other");
		}
			
}
}
}
