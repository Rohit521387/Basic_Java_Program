package basics.programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Functions2 
{
static int  counts_of_Digits=0;
static int  counts_of_alphabets=0;
static int  counts_of_spaces=0;
static int  counts_of_special_characters=0;

public static void main(String[] args) 
{
		String name = "I am Rohit";
	    boolean answer = name.contains("am");
	    System.out.println(answer);
	    
	    
	    boolean	answer1 = name.endsWith("Ram");
	    System.out.println(answer1);
	
		String s1 = "500 77 Cen trtt %&*@#@#";
	    char c1[] = s1.toCharArray();
	    System.out.println(Arrays.toString(c1));
	    
	    
	    for(int i=0; s1.length()>i; i++)
	    {
	     boolean b1 =  Character.isDigit(c1[i]);
	   
	     if(b1==true)
	     {
	    	 counts_of_Digits++;
	     }
	     
	     boolean b2 = Character.isLetter(c1[i]);
	     
	     if (b2==true)
	     {
	    	 counts_of_alphabets++;
	     }
	     
	    boolean b3 = Character.isSpaceChar(c1[i]);
	      
	      if (b3==true)
	      {	  
	    	  counts_of_spaces++;
	      }
	      if (b1==b2==b3==false)
	      {
	    	  counts_of_special_characters++;
	      }
	     
	    }
	    
	     System.out.println("Count of numeric presents in the given string --> "+counts_of_Digits);
	     System.out.println("Count of Alphabets presents in the given string --> "+counts_of_alphabets);
	     System.out.println("Count of Spaces presents in the given string --> "+counts_of_spaces);
	     System.out.println("Count of special characters presents in the given string --> "+counts_of_special_characters);
	     
	     
}
}
